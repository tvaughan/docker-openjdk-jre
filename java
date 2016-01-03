#!/bin/sh -e
# -*- coding: utf-8; mode: sh -*-
CONTAINER=tvaughan/openjdk-jre
VERSION=9
ENTRYPOINT=/usr/bin/$(basename $0)
docker run --rm -i -t -v $PWD:/tmp/workdir -w /tmp/workdir --entrypoint=$ENTRYPOINT $CONTAINER:$VERSION "$@"
exit 0
