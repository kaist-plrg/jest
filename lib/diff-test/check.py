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
# execution result of engines and JEST
class ExecutionResult:
  def __init__(self, result_type, msg = "", log = ""):
    self.result_type = result_type
    self.msg = msg
    self.log = log
  @staticmethod
  def get_result_type(engine_msg, is_err = False):
    err_hints = {
      "SyntaxError:": ExecutionResultType.SYNTAX_ERROR,
      "ReferenceError:": ExecutionResultType.REFERENCE_ERROR,
      "TypeError:": ExecutionResultType.TYPE_ERROR,
      "RangeError:": ExecutionResultType.RANGE_ERROR,
      "EvalError:": ExecutionResultType.EVAL_ERROR,
      "InternalError:": ExecutionResultType.INTERNAL_ERROR
    }
    for line in engine_msg.splitlines():
      cands = [err for err in err_hints.keys() if err in line]
      if len(cands) != 0:
        cand, idx = cands[0], line.find(cands[0])
        for i in range(len(cands)):
          if line.find(cands[i]) < idx:
            cand, idx = cands[i], line.find(cands[i])
        return err_hints[cand]
      elif "Throw" in line:
        return ExecutionResultType.THROW
    if is_err:
      return ExecutionResultType.THROW
    else:
      return ExecutionResultType.NORMAL
  @staticmethod
  def get(out, err):
    # handle `Node.js` warning
    is_err = err != "" and not "UnhandledPromiseRejectionWarning" in err
    result_type = ExecutionResult.get_result_type(err, True) if is_err else ExecutionResult.get_result_type(out)
    # msg = err if is_err else out
    return ExecutionResult(result_type, err, out)
  @staticmethod
  def get_expected(comment):
    result_type = ExecutionResult.get_result_type(comment)
    return ExecutionResult(result_type, comment)
  def need_print(self, jest_output):
    return jest_output != self or self.log != ""
  def __str__(self):
    ret = "{}\n".format(self.result_type.value)
    if self.log != "":
      ret += "- {}\n".format(self.log)
    if self.msg != "":
      ret += "- {}\n".format(self.msg)
    return ret
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
  path = os.environ[engine]
  out, err = execute("{} {}".format(path, filepath))
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
        jest_output = ExecutionResult.get_expected(expected)
        # write temp.js
        temp.write(helper.read() + '\n' + script_content)
  # execute script in each engines
  # engines = ["js", "qjs", "xst", "node"]
  engines = ["GRAAL", "QJS", "MODDABLE", "V8"]
  hr = "-" * 60
  check_str = "{}\n[{}]\n{}\n\n".format(hr, filepath, script_content)
  check_str += "[Expected]: {}\n\n".format(jest_output)
  diff_cnt = 0
  for engine in engines:
    engine_output = check(engine, temppath)
    # engine_output = ExecutionResult.get(out, err)
    if engine_output.need_print(jest_output):
      check_str += "[{}]: {}".format(engine, engine_output)
      diff_cnt += 1
  check_str += "\ndiff_cnt: %d\n"%diff_cnt
  check_str += hr
  # print if something different
  if diff_cnt > 0:
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
      for filepath in glob.glob(args.dir+"/*.js"):
        check_all(filepath)
    else:
      raise Exception("Error : invalid arguments")
  except Exception as ex:
    print(ex)

main()
