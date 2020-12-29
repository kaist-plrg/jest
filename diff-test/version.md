# Version of Each JS Engine
| JS Engine   | Command | Version           | Site                                                        | ES2020 support                            |
|:-----------:|:-------:|------------------:|:------------------------------------------------------------|:-----------------------------------------:|
| GraalJS     | `js`    | 20.1.0            |[https://www.graalvm.org/](https://www.graalvm.org/)         | [Y](https://github.com/graalvm/graaljs)   |
| QuickJS     | `qjs`   | 2020-04-12        |[https://bellard.org/quickjs/](https://bellard.org/quickjs/) | [Y](https://bellard.org/quickjs/)         |
| Moddable XS | `xst`   | 10.2.1            |[https://www.moddable.com/](https://www.moddable.com/)       | [Y](https://blog.moddable.com/blog/xs10/) |
| Google V8   | `node`  | 8.3 (node 14.5.0) |[https://v8.dev/](https://v8.dev/)                           | [Y](https://v8.dev/)                      |


## Install JS Engines


### GraalJS

1. Navigate to [GraalVM Releases repository on GitHub](https://github.com/graalvm/graalvm-ce-builds/releases) and download the GraalVM Communite Edition 20.1.0 version using Java 8:
  - Linux: [graalvm-ce-java8-linux-amd64-20.1.0.tar.gz](https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-linux-amd64-20.1.0.tar.gz)
```
wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-linux-amd64-20.1.0.tar.gz
```
  - MacOS: [graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz](https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz)
```
wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-20.1.0/graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz
```
2. Extract the archive to your file system and move the obtained GraalVM to its proper location.
  - Linux:
```
tar -xvf graalvm-ce-java8-linux-amd64-20.1.0.tar.gz
mv graalvm-ce-java8-20.1.0 <path to GraalVM>
```
  - MacOS:
```
tar -xvf graalvm-ce-java8-darwin-amd64-20.1.0.tar.gz
sudo mv graalvm-ce-java8-20.1.0 /Library/Java/JavaVirtualMachines
```
3. Insert the following command to the `.profile` (or `.zshrc` when you use `zsh`).
  - Linux:
```
alias js=<path to GraalVM>/bin/js
```
  - MacOS:
```
alias js=/Library/Java/JavaVirtualMachines/graalvm-ce-java8-20.1.0/Contents/Home/bin/js
```
4. Check the version of GraalVM:
```
js --version
# Exepcted: GraalVM JavaScript (GraalVM CE Native 20.1.0)
```

### QuickJS

1. Prepare the proper environments:
  - Linux:
```
sudo apt-get install -y build-essential gcc-multilib
```
  - MacOS: update xcode to the most recent version
2. Clone the repository of [QuickJS](https://github.com/ldarren/QuickJS) and install it:
```
git clone https://github.com/ldarren/QuickJS.git
cd QuickJS
git checkout 6fe8f8f
make
sudo make install # to use qjs and qjsc outside of repo folder
```
3. Check the version of QuickJS via help message:
```
qjs -h
# Expected:
# QuickJS version 2020-04-12
# usage: qjs [options] [file [args]]
# ...
```

### Moddable XS

1. Prepare the proper environments:
  - Linux:
```
sudo apt-get install -y libgtk-3-dev
```
  - MacOS: update xcode to the most recent version
2. Clone the repository of [Moddable](https://github.com/Moddable-OpenSource/moddable) and set the path of Moddable:
```
git clone https://github.com/Moddable-OpenSource/moddable.git
export MODDABLE=<path to Moddable>
cd $MODDABLE
git checkout 79b50f50
```
3. Install Moddable:
  - Linux:
```
cd $MODDABLE/build/makefiles/lin
make
cd $MODDABLE/xs/makefiles/lin
make
```
  - MacOS:
```
cd $MODDABLE/build/makefiles/mac
make
cd $MODDABLE/xs/makefiles/mac
make
```
4. Insert the following command to the `.profile` (or `.zshrc` when you use `zsh`).
  - Linux:
```
alias xst=$MODDABLE/build/bin/lin/release/xst
```
  - MacOS:
```
alias xst=$MODDABLE/build/bin/mac/release/xst
```
5. Check the version of Moddable XS:
```
xst -v
# Expected XS 10.2.1
```


### Google V8 (Node.js)

1. Install [Node.js](https://nodejs.org/):
  - Linux:
```
sudo apt-get update
sudo apt-get install nodejs
```
  - MacOS:
```
brew update
brew install node
```
If you want to install the specified version([Node v14.5.0(v8 8.3.110.9)](https://nodejs.org/download/release/v14.5.0/)), follow the below instructions.
  - Linux (x64):
```
wget https://nodejs.org/download/release/v14.5.0/node-v14.5.0-linux-x64.tar.gz
tar -zxf node-v14.5.0-linux-x64.tar.gz
export NODE_HOME=$(pwd)/node-v14.5.0-linux-x64
export PATH=$NODE_HOME/bin:$PATH
```
2. Check the version of Node.js:
```
node --version
# Expected: v14.5.0
```
