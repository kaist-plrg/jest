$assert.notThrows(function () {
  var x;
  (y => { x = y; })`\1`;
  $verifyProperty(x, '0', { value: undefined, writable: false, enumerable: true, configurable: false });
  $verifyProperty(x.raw, '0', { value: "", writable: false, enumerable: true, configurable: false });
});

