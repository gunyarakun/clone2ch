#!/bin/sh

JAVA_OPT="-Xverify:none -XX:MaxPermSize=128m -Xms1G -Xmx1G -Xss2M -XX:+UseTLAB \
 -XX:+AggressiveOpts -XX:+UseFastAccessorMethods -Dfile.encoding=UTF-8"
JAVA_GC_OPT="-XX:+UseParallelGC -XX:+UseParallelOldGC"

java $JAVA_OPT $JAVA_GC_OPT -jar `dirname $0`/lib/sbt-launch.jar "$@"
