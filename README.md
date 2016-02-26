## Usage

Create a script called `java` that looks like:

    #!/bin/sh
    docker run --rm -i -t -v $PWD:/mnt/workdir tvaughan/openjdk-jre:9 java "$@"

make it executable, and then run it.
