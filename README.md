# IRES
JavaScript IR-based Semantics Extraction Toolchain

## Environment Setting
```
export IRES_HOME="<<IRES directory path>>"
export PATH="$IRES_HOME/bin:$PATH"
```

## Install
```
git clone --recurse-submodules git@github.com:kaist-plrg/ires.git
cd ires
sbt generateModel
```

## Unsupported Features for Test262
- Parts of built-in objects
  - Date
  - Math
  - JSON
  - RegExp
- module
- strict mode
- [[CanBlock]]
- locale
