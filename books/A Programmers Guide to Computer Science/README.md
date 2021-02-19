# A Programmers Guide to Computer Science

### Notes

#### Big-O & Algorithms
- Algorithms are more general than programs. Programs usually implement Algorithms.
- Asymptotic runtime - The rate at which the runtime grows compared to the size of the input.

- Linear Algorithms - `O(n)` - total runtime is proportional to the number of items processed.
- Quadratic Algorithms - `O(n^2) - Doing O(n) work O(n) times` - compare every element of collection to every other element in a collection.
- Logrithmic Algorithms - `O(log n)`
	- [Logrithmic Time Space Complexity article](https://medium.com/better-programming/a-gentle-explanation-of-logarithmic-time-complexity-79842728a702)
		- A logarithmic function is the opposite of an exponential function. When you say something grows exponentially, it’s being multiplied. When something grows logarithmically, it is being divided.
	- Divide and conquer
	- Involves havling input until desired result is reached
	- Usual expectation is that the a given list of lenght `n` is sorted.
	- Example would be - `Binary Search in O(log n)` time. [JavaScript Binary Search Example](https://medium.com/@jeffrey.allen.lewis/javascript-algorithms-explained-binary-search-25064b896470)

- Polynomial - All algorithms where the runtime is proportional to the size of the input raised to some power are know as `polynomial` algorithms.
- Exponential - Number of operations is bounded by some constant raised to the size of the input rather than the size of the input raised to some constant.
	- Guessing a numeric passcode of length `n` assuming there are `10 digits (0-9)` the number of possible codes is `10^n`!

- Generally computer scientists are interested in `Polynomial` solutions, particularly solutions that run in `Quadratic` time or better. Given a reasonable problem size, `Exponential` algorithms can be worthwhile.

#### Data-structures

##### Arrays
- Stored sequentially
- Indexed my numeric key
- Key represents the offset from the starting location in memory
- Retrieving or storing an element takes constant time or `O(1)`
- Entire array takes `O(n)` space
- All locations are offsets from the start, no space is allocated for pointers. Iterating over an array is likely to be noticably faster due to fewer cache misses.
- The requirement for a contiguous(shared or touching) block of memory is not ideal when the number of elements is UNKNOWN - increasing the array size may involve copying the entire array to a different memory location and avoiding this by pre-allocating more space than needed is wasteful.
- Another major issue is that inserting and deleting elements from an array is very time consuming `O(n)` because every element may need to be moved.
- `Data structures implemented using arrays` - Stacks, Queues, Lists, Hash Tables, Heap and Priority Queues

##### Linked Lists
- Elements contain - a value and a pointer to the next node in the list
- Linked List is represented by a pointer(head) pointing to the first node in the list
- Finding a specific element(value) requires walking the list sequentially starting at the head
- Finding an element in a Linked List is at worst `O(n)` time
- Linked Lists can grow in size due to the fact that the nodes can be anywhere in memory. A Linked List can grow until available memory is exhausted.
- Insertions and deletions can be done in `Constant Time - O(1)` if we have a pointer to the previous node

##### Stacks
- Elements can only be added or removed from the top(beginning) of the Stack
- Follows `LIFO`(Last in first out)
- Push/pop to add/remove and element from the Stack
- Four basic operations - push(add item), pop(remove item), isEmpty(check if the Stack is empty) & size(length of the Stack) all done in constant `O(1)` time
- Peek - look at the top item by popping and then pushing said item
- Stackoverflow - pushing item to a full stack
- Underflow - popping item from an empty stack
- Do not allow for random access
- Work well for maintaining a history of operations and backtracking

##### Heaps
- `Heap Ordering Property` - Heap is partially ordered based on the key of each element such that the highest/lowest priority element is always stored at the root
- `Complete Binary Tree` - A Binary Tree is a tree data structure wherein each node has at most two “children.”
- Only one element of a Head can be removed at a time
- Min-Heap - The value of each node is no smaller than the value of its parent - The root node has the minimum value - A complete binary tree
- Max-Heap - The value of each node is no larger that the value of its parent - The root node has the maximum value - A complete binary tree
- Max-Heap will remove the maximum element
- Min-Heap will remove the minimum element
- If not specified when speaking of a Heap - usually then defaults to Binary Heap
- Binary Heap - Complete binary tree that satisfies the Heap Ordering Property
- Other Heaps - Leftist Heaps, Binomial Heaps, Fibonacci Heaps
- Operations - find/peek(min/max), insert(push), extract/pop(min/max) and increase-key(change the nodes key and move it to it's new position in the graph)
- Heap is created from a list of items in `O(n) linear` time and each Heap operation requires `O(log n) logrithmic` time

##### Hash Tables
- Key value data structure
- Hash function: converts key of an element to be place in the table then maps to the value of the element
- For collisions - storing values by string length - "cat" & "dog" would both be a key "3" - we can handle this by using a bucket of objects represented by a LinkedList - this is called chaining
- You may also search for an open location on the table - open addressing
- With chaining - the size of the table is unlimited but performance will degrade as the number of elements in a given spot increases
- Open Addressing has a fixed size once the maximum size has been reach no other elements can be inserted
- How a table is setup depends on whether we want to minimize collisions(elements mapping to the same location) or storage space
- Once the key has been hashed saving or retrieving the element takes `O(1) constant` time
- With collisions Hash Tables do have the worst retrieval time at `O(n) linear` time when every element collides
- Hash tables are used when
	- We want fast access to unsorted data based on a key
	- There exists a fast-running function for generating the key for each object
- Hash tables are avoided when
	- We need to support sorting
	- The elements are not well distributed (that is manny elements map to few locations)
	- When a common use case is to access a sequential block of items

##### Sets & Posets
- Set - unordered collection of unique items
- Three core operations
	- Union(S, T) - a set containing every element that belongs to at least one of set S and T
		- Takes in set(S) and set(T) and returns set(U) containing all elements that occur in both sets
	- Intersection(S, T) - set of elements that are contained in both set(S) and set(T)
	- Difference(S, T) - every element contained in set(S) but not in set(T)
- Subset(S, T) - returns boolean
	- Returns true if set(S) is a subset of set(T) - every element in S is also an element of T
	- If set(S) is a subset of set(T) and is not equal then it is a true subset

