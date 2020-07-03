- Abstract Equality Comparison에서 ToPrimitive를 호출하고 나서 ?를 안해서
  오류가 밖으로 빠져나가지 못함
- try { (1 != {valueOf: () => {throw 42;}}) } catch (e) { if (e != 42) throw 42; }
