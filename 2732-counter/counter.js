/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var c=0;
    return function() {
        return c+n++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */