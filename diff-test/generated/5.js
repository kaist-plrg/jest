var x = {};
x[Symbol.iterator] = function() {
  return {
    next: function() {
      return { done: false, value: null };
    },
    return: 'str'
  };
};
for (var x of iterable) throw 42;
