# JEST: N+1-version Differential Testing of Both JavaScript Engines

**JEST** is a **J**avaScript **E**ngines and **S**pecification **T**ester using
_N+1-version differential testing_, which is a novel solution to the new
problem of co-evolving language specifications and their implementations.  This
artifact extends the an [Intermediate Representations for ECMAScript
Specifications (IRES)](https://github.com/kaist-plrg/ires) extracted from
ECMAScript 2020 (ES11) using [JISET](https://github.com/kaist-plrg/jiset).

## Publications

Details of the JEST framework are available in our papers:
- [ASE 2020] [JISET: JavaScript IR-based Semantics Extraction
  Toolchain](https://doi.org/10.1145/3324884.3416632)
- [ICSE 2021] [JEST: N+1-version Differential Testing of Both JavaScript
  Engines](https://doi.org/10.1109/ICSE43902.2021.00015)

## Overall Structure

![image](https://user-images.githubusercontent.com/6766660/103853229-ee944680-50f0-11eb-8927-f45fe9d3e9c1.png)

JEST consists of following modules to perform N+1-version
differential testing of JavaScript engines and specification:
- **SeedSynthesizer** synthesizes an initial seed programs using the language
  syntax.
- **TargetSelector** selects a target program in the program pool that
  potentially increases the coverage of the language semantics by the pool.
- **ProgramMutator** generates a new program by mutating a given target program
  in order to increase the coverage of the language semantics by the program
  pool.
- **AssertionInjector** generates conformance tests by injecting assertions to
  the synthesized programs to check their final program states.
- **DifferentialTester** detects bugs in the specification and implementations
  via executing the conformance tests on multiple implementations.
- **BugLocalizer** localizes bugs on the specification using statistical
  information.

## Getting Started Guide
The artifact is open-source can be obtained by cloning the following git
repository:
```
$ git clone https://github.com/kaist-plrg/jest.git
$ cd jest
```
To build and execute the artifact, you should follow the instrucitons in the
`INSTALL` file in the artifact.  Since we implement the artifact in
Scala, it requires `sbt`, which is an intereactive build tool for Scala.
Moreover, for differential testing, you also need to install four different
JavaScript engines: [V8](https://v8.dev/) (v8.5),
[GraalJS](https://github.com/oracle/graaljs) (v20.1.0),
[QuickJS](https://bellard.org/quickjs/) (2020-04-12), and [Moddable
XS](https://github.com/Moddable-OpenSource/moddable) (v10.3.0).

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

## Basic Commands

You can run the artifact with the following command:
```
$ jest <sub-command> <option>*
```
with the following sub-commands:
- `help` shows the help message.
- `sample` represents **SeedSynthesizer** and dumps seed
    programs to `result/seed`.
- `generate` loads seed programs from `result/seed`,
    repeatedly performs **ProgramMutator** with **TargetSelector**,
    dumps generated programs to `result/programs`. You can change the
    maximum iteration via the option `-generate:iter=<number>` (default:
    10).
- `inject` loaded programs from `result/programs` and dumps
    results of **AssertionInjector** to `result/tests`.
- `check` performs **DifferentialTester** for
    `result/tests` and records bugs to `result/bugs`.
- `localize` performs **BugLocalizer** for found bugs in
    `result/bugs`. When the option `-localize:answer` is given, it
    reads answers from `answer` and shows their ranks.
- `run` integrates all modules to perform $N$+1-vesion differential
    testing at once.

and global options:
- `-time` shows duration time.
- `-bugfix` uses semantics extracted from bug-fixed ECMAScript.
- `-detail` prints intermediate processes.
