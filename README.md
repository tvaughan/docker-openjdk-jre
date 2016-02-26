## Usage

Create a script called `java` that looks like:

    #!/bin/sh
    docker run --rm -i -t tvaughan/openjdk-jre:9 java "$@"

make it executable, and then run it.
