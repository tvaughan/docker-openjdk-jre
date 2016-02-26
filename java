#!/bin/sh -e
# -*- coding: utf-8; mode: sh -*-
CONTAINER=tvaughan/openjdk-jre
VERSION=8
CMD=$(basename $0)
docker run --rm -i -t -v $PWD:/tmp/workdir -w /tmp/workdir $CONTAINER:$VERSION $CMD "$@"
exit 0
