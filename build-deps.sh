#!/bin/sh

ARGS=""
if [ $# -eq 0 ]; then
  ARGS="install"
else
  ARGS=$@
fi

mvn -f releng/fr.unice.i3s.sigma.releng.p2/pom.xml $ARGS
