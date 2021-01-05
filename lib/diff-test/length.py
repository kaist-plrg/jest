import argparse
import sys
import os
import glob
import jsbeautifier

def main():
    # parse arguments
    parser = argparse.ArgumentParser(description="check injected result")
    parser.add_argument( '-d', '--dir', help="target directory", default="./paper_scripts")
    parser.add_argument( '-b', '--beautify', dest='beautify', action='store_true', help="beautify script")
    parser.set_defaults(beautify=False)
    args = parser.parse_args()

    # check directory
    total_len, total_loc, cnt = 0.0, 0.0, 0.0
    for filepath in glob.glob(args.dir + "/*.js"):
        # get file length
        with open(filepath, "r") as script:
            script_content = script.read()
            beautified = jsbeautifier.beautify(script_content)
            target = script_content if not args.beautify else beautified
            total_len += len(target)
            total_loc += target.count('\n')
            cnt += 1

    # print result
    print(f"avg length in {args.dir} length: {total_len/cnt} LOC: {total_loc/cnt}")
main()
