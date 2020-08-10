import subprocess
import argparse
import sys
import os
import glob
import enum

# possible execution result type
class ExecutionResultType(enum.Enum):
  NORMAL = "No Exception"
  SYNTAX_ERROR = "SyntaxError"
  REFERENCE_ERROR = "ReferenceError"
  TYPE_ERROR = "TypeError"
  RANGE_ERROR = "RangeError"
  EVAL_ERROR = "EvalError"
  INTERNAL_ERROR = "InternalError"
  THROW = "Throw"
# execution result of engines and IRES
class ExecutionResult:
  def __init__(self, result_type, msg = ''):
    self.result_type = result_type
    self.msg = msg
  @staticmethod
  def get_result_type(engine_msg, is_err = False):
    if "SyntaxError" in engine_msg:
      return ExecutionResultType.SYNTAX_ERROR
    elif "ReferenceError" in engine_msg:
      return ExecutionResultType.REFERENCE_ERROR
    elif "TypeError" in engine_msg:
      return ExecutionResultType.TYPE_ERROR
    elif "RangeError" in engine_msg:
      return ExecutionResultType.RANGE_ERROR
    elif "EvalError" in engine_msg:
      return ExecutionResultType.EVAL_ERROR
    elif "InternalError" in engine_msg:
      return ExecutionResultType.INTERNAL_ERROR
    elif "Throw" in engine_msg or is_err:
      return ExecutionResultType.THROW
    else:
      return ExecutionResultType.NORMAL
  @staticmethod
  def get(out, err):
    # handle `Node.js` warning
    is_err = err != "" and not "UnhandledPromiseRejectionWarning" in err
    result_type = ExecutionResult.get_result_type(err, True) if is_err else ExecutionResult.get_result_type(out)
    msg = err if is_err else out
    return ExecutionResult(result_type, msg)
  @staticmethod
  def get_expected(comment):
    result_type = ExecutionResult.get_result_type(comment)
    return ExecutionResult(result_type, comment)
  def __str__(self):
    return "{}\n- {}".format(self.result_type.value, self.msg)
  def __eq__(self, other):
    return self.result_type == other.result_type

# execute shell command
def execute(cmd):
  proc = subprocess.Popen(cmd, shell=True, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
  out, err = proc.communicate()
  proc.wait()
  return out.decode("utf-8"), err.decode("utf-8")

# run engine
def check(engine, filepath):
  # execute temp.js
  out, err = execute("{} {}".format(engine, filepath))
  # parse execution result
  return ExecutionResult.get(out, err)
  
def check_all(filepath):
  # concat helper.js
  temppath = "_81204d72cd_temp.js"
  with open("helper.js", "r") as helper:
    with open(filepath, "r") as script:
      with open(temppath, "w") as temp:
        script_content = script.read()
        # read first line and get expected output
        expected = script_content.splitlines()[0][2:]
        ires_output = ExecutionResult.get_expected(expected)
        # write temp.js
        temp.write(helper.read() + '\n' + script_content)
  # execute script in each engines
  engines = ["js", "qjs", "xst", "node"]
  print_check_result = False
  hr = "-" * 60
  check_str = "{}\n[Script]\n{}\n\n".format(hr, script_content)
  check_str += "[Expected]: {}\n\n".format(ires_output)
  for engine in engines:
    engine_output = check(engine, temppath)
    # engine_output = ExecutionResult.get(out, err)
    if engine_output != ires_output:
      print_check_result = True
      check_str += "[{}]: {}".format(engine, engine_output)
  check_str += hr
  # print if something different
  if print_check_result:
    print(check_str)
  # remove temp.js
  os.remove(temppath)

def main():
  # parse arguments
  parser = argparse.ArgumentParser(description="check injected result")
  parser.add_argument( '-f', '--file', help="target filename")
  parser.add_argument( '-d', '--dir', help="target directory", default="./injected")
  args = parser.parse_args()

  try:
    # check file
    if args.file != None and os.path.exists(args.file):
      check_all(args.file)
    # check directory
    elif os.path.isdir(args.dir):
      for filepath in glob.glob("./injected/*.js"):
        check_all(filepath)
    else:
      raise Exception("Error : invalid arguments")
  except Exception as ex:
    print(ex)

main()