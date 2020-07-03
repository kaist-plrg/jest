$assert.throws(function () {
  var x = {};
  x[Symbol.iterator] = function() {
    return {
      next: function() {
        return { done: false, value: null };
      },
      return: 'str'
    };
  };
  for (var y of x) throw 42;
}, TypeError);
