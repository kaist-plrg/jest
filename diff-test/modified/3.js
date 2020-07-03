$assert.notThrows(function () {
  class A {}
  $assert.compareArray(Object.getOwnPropertyNames(A), ['length', 'prototype', 'name']);
});
