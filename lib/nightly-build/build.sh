#!/bin/bash
# run at crontab. ex) 0 0 * * * /home/j31d0/ires/lib/nightly-build/build.sh
BIRES=/home/j31d0/ires/
logNAME=$BIRES/$(date +"%Y%m%d%H%M%S").log
export IRES_HOME=$BIRES
(cd $BIRES && git pull && sbt clean generateModel test262Test) 2> $logNAME
sed "/Run completed in/q" $BIRES/tests/detail | grep -A1 --no-group-separator "\*\*\* FAILED \*\*\*" | grep -v "\*\*\* FAILED \*\*\*" | sed -r "s/\x1B\[([0-9]{1,2}(;[0-9]{1,2})?)?[mGK]//g" | sort | uniq -c | sort -rg -k 1 > $BIRES/tests/result/errlist_$(date +"%Y%m%d").log
[ -s $logNAME ] || rm $logNAME
