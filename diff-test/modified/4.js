$assert.notThrows(function () {
  var x;
  ((y) => { x = y; })(() => {});
  $assert.compareArray(Object.getOwnPropertyNames(x), ['length']);
});
