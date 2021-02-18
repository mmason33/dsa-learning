# A Programmers Guide to Computer Science

### Notes
- Algorithms are more general than programs. Programs usually implement Algorithms.
- Asymptotic runtime - The rate at which the runtime grows compared to the size of the input.

- Linear Algorithms - `O(n)` - total runtime is proportional to the number of items processed.
- Quadratic Algorithms - `O(n^2) - Doing O(n) work O(n) times` - compare every element of collection to every other element in a collection.
- Logrithmic Algorithms - `O(log n)`
	- A logarithmic function is the opposite of an exponential function. When you say something grows exponentially, it’s being multiplied. When something grows logarithmically, it is being divided.
	- Divide and conquer
	- Involves havling input until desired result is reached
	- Usual expectation is that the a given list of lenght `n` is sorted.
	- Example would be - `Binary Search in O(log n)` time. [JavaScript Binary Search Example](https://medium.com/@jeffrey.allen.lewis/javascript-algorithms-explained-binary-search-25064b896470)

- Polynomial - All algorithms where the runtime is proportional to the size of the input raised to some power are know as `polynomial` algorithms.
- Exponential - Number of operations is bounded by some constant raised to the size of the input rather than the size of the input raised to some constant.
	- Guessing a numeric passcode of length `n` assuming there are `10 digits (0-9)` the number of possible codes is `10^n`!

- Generally computer scientists are interested in `Polynomial` solutions, particularly solutions that run in `Quadratic` time or better. Given a reasonable problem size, `Exponential` algorithms can be worthwhile.
