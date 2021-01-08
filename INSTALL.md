# Installation Guide

We explain how to install JEST with necessary environment settings from the
scratch.  Before installation, please download JDK 8 and
[`sbt`](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html).

Additionally, we packaged the artifact in a docker container.  If you want to
skip the environment setting, we recommend you to use it.  You can install the
docker by following the instruction in
[https://docs.docker.com/get-started/](https://docs.docker.com/get-started/)
and downlaod our docker image with the following command:
```
$ docker pull jhnaldo/icse-21-jest
$ docker run -it -m=16g --rm jhnaldo/icse-21-jest
# user: guest, password: jest
```
_WARNING_: The docker image is 3GB large thus be patient when you
download it and please assign more than 16GB memory for the docker engine.

## Download JEST
```
$ git clone https://github.com/jhnaldo/jest.git
$ cd jest
```

## Environment Setting

Insert the following commands to `~/.bashrc`:
```
# for JEST
export JEST_HOME="<path to JEST>"
export PATH="$JEST_HOME/bin:$PATH"
export JAVA_OPTS="-Djava.library.path=$JEST_HOME/lib"
```
The `<path to JEST>` should be the absolute path of JEST repository.


## Install JavaScript Engines

### GraalJS

1. Navigate to [GraalVM Releases repository on GitHub](https://github.com/graalvm/graalvm-ce-builds/releases) and download the GraalVM Communite Edition 20.1.0 version using Java 8:
  - Linux: [graalvm-ce-java8-linux-amd64-20.1.0.tar.gz](https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-linux-amd64-20.1.0.tar.gz)
```
$ wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-linux-amd64-20.1.0.tar.gz
```
  - MacOS: [graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz](https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz)
```
$ wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz
```
2. Extract the archive to your file system and move the obtained GraalVM to its proper location.
  - Linux:
```
$ tar -xvf graalvm-ce-java8-linux-amd64-20.1.0.tar.gz
$ mv graalvm-ce-java8-20.1.0 <path to GraalVM>
```
  - MacOS:
```
$ tar -xvf graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz
$ sudo mv graalvm-ce-java8-20.1.0 /Library/Java/JavaVirtualMachines
```
3. Insert the following commands to `~/.bashrc` (or `~/.zshrc` when you use `zsh`).
  - Linux:
```
# for GraalJS
export GRAAL_HOME="<path to GraalVM>"
alias js="$GRAAL_HOME/bin/js"
alias gnode="$GRAAL_HOME/bin/node"
```
  - MacOS:
```
# for GraalJS
export GRAAL_HOME="/Library/Java/JavaVirtualMachines/graalvm-ce-java8-20.1.0/Contents/Home"
alias js="$GRAAL_HOME/bin/js"
alias gnode="$GRAAL_HOME/bin/node"
```
4. Check the version of GraalVM:
```
$ source ~/.bashrc
$ js --version
# Expected: GraalVM JavaScript (GraalVM CE Native 20.1.0)
```

### QuickJS

1. Prepare the proper environments:
  - Linux:
```
$ sudo apt-get install -y build-essential gcc-multilib
```
  - MacOS: update xcode to the most recent version
2. Clone the repository of [QuickJS](https://github.com/ldarren/QuickJS) and install it:
```
$ git clone https://github.com/ldarren/QuickJS.git
$ cd QuickJS
$ git checkout 6fe8f8f
$ make
$ sudo make install # to use qjs and qjsc outside of repo folder
```
3. Check the version of QuickJS via help message:
```
$ qjs -h
# Expected:
# QuickJS version 2020-04-12
# usage: qjs [options] [file [args]]
# ...
```

### Moddable XS

1. Prepare the proper environments:
  - Linux:
```
$ sudo apt-get install -y libgtk-3-dev
```
  - MacOS: update xcode to the most recent version
2. Clone the repository of [Moddable](https://github.com/Moddable-OpenSource/moddable) and set the path of Moddable:
```
$ git clone https://github.com/Moddable-OpenSource/moddable.git
$ export MODDABLE="<path to Moddable>"
$ cd $MODDABLE
$ git checkout 79b50f50
```
3. Install Moddable:
  - Linux:
```
$ cd $MODDABLE/build/makefiles/lin
$ make
$ cd $MODDABLE/xs/makefiles/lin
$ make
```
  - MacOS:
```
$ cd $MODDABLE/build/makefiles/mac
$ make
$ cd $MODDABLE/xs/makefiles/mac
$ make
```
4. Insert the following commands to `~/.bashrc` (or `~/.zshrc` when you use `zsh`).
  - Linux:
```
# for Moddable
export MODDABLE="<path to Moddable>"
export PATH="$MODDABLE/build/bin/lin/release:$PATH"
```
  - MacOS:
```
# for Moddable
export MODDABLE="<path to Moddable>"
export PATH="$MODDABLE/build/bin/mac/release:$PATH"
```
5. Check the version of Moddable XS:
```
$ source ~/.bashrc
$ xst -v
# Expected: XS 10.2.1
```


### V8 (Node.js)

1. Install the specified version([Node v14.5.0(v8 8.3.110.9)](https://nodejs.org/download/release/v14.5.0/)):
```
$ wget https://nodejs.org/download/release/v14.5.0/node-v14.5.0-linux-x64.tar.gz
$ tar -zxf node-v14.5.0-linux-x64.tar.gz
$ mv node-v14.5.0-linux-x64 <path to Node>
```
2. Insert the following commands to `~/.bashrc` (or `~/.zshrc` when you use `zsh`).
```
# for V8
export NODE_HOME="<path to Node>"
export PATH=$NODE_HOME/bin:$PATH
```
3. Check the version of Node.js:
```
$ node --version
# Expected: v14.5.0
```


## Build JEST
1. Build JEST using `sbt`:
```
$ cd $JEST_HOME
$ sbt assembly
# It took few minutes at the first time because it initilizes sbt
```
2. Check the `jest` command:
```
$ jest help
```
