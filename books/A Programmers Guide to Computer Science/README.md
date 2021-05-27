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


#### Graph Theory
- The Seven Bridges of Konigsberg
	- Konigsberg had a river that divided the city into four regions connected by seven bridges
	- Is possible to take a walk through the city crossing every bridge exactly once?
- Graphs are important in computer science because so many problems can be represented as graphs
- Reducing a problem statement to an equivalent problem on a particular class of graph give us useful information about how difficult the problem will be to solve
- Graphs represent relationships in a set of data
- Vertices(represented usually by circles)
- Edges(represented by lines between circles(vertices))
- Two vertices are adjacent if there is an edge between them and non-adjacent if there is no edge between them
- Subgraph(subset of data) - any number of vertices and edges that exist on the original graph
- Graph representation
	- Commonly graphs are represented at "n" vertices and "m" edges
	- Representing graphs with adjancency lists
	- Each vertex is stored with a list of the vertices to which it is adjacent
	- Representing graphs with adjacency matrices
	- Each matrix has the following properties:
		- Every cell in the matrix is either 0 or 1
		- The cell at position (i,j) is a 1 if and only if there exists an edge between vertices i and j. This is also true of the cell at position (j,i).
		- As result of the fact above, the number of 1's in the matrix is double the number of edges in the graph
		- The diagonal is always zero because no vertex has an edge to itself
		- The matrix has n rows and n columns so it takes n^2 space.
- Trees - A tree is simply a connected graph in which there are not cycles - acyclic
	- Acyclic(aye | sick | lick) - acyclic graph has at most one path between any two vertices
	- We pick up the tree at it's root then define the rest of the vertices by their relationship to the root
	- Equivalent definitions for a tree:
		- An acyclic graph where a simple(without repeated vertices) cycle will be formed if any edge is added
		- A connected graph that will no longer be connected if any edge is removed
		- A graph where any two vertices are connected by a unique simple path
	- A tree node is either an internal node(if it has at least one child) or a leaf(if it does not)


#### Data Structures on Graphs
- Binary Search tree - is a rooted binary tree defined recursively as follows:
	- The key of the root is greater than or equal to the key of its left child and less than or equal to the key of its right child(if any) - this is also true for the subtree rooted at every other node
	- Operations take time proportional to the height of the tree, which is the length of the longest chain from the root(which has a height of zero) to a leaf
	- Average case `O(log n)` and `O(n)` for the worst case(when each node has on child making the tree essentially a linked list)
	- Can be implemented with a collection of linked nodes where each node has key and pointers to its left and right child and to its parent.
- Searching a Binary Search Tree:
	- Same idea as the Binary Search Alogrithm, `O(log n)` halving the input until the desired value is found
	- Given a pointer to the root if the desired key is less than the root then we'll recurse to the left subtree(values are less than or equal to the root) or if the desired key is greater than the root we'll recurse to the right subtree(values are greater than or equal to the root)
	- To find the minimum value of the tree we'll always recurse the left subtree
	- Most commonly the runtime will be `O(log n)` with worst case of `O(n)`
- Back to Heaps
	- A rooted nearly complete binary tree where the key of the root is greater than the key of either of its children and this is recursively true for the subtree rooted at each child
	- Nearly complete mean that the tree is completely filled except possibly on the lowest level which is filled from left to right


#### Graph Algorithms
- Turn an arbitary graph into a search tree
- Breadith First Search(BFS)
	- Explore all vertices adjacent to the root
	- Recursively explore all vertices to the roots neighbors that have not already been explored
	- Discover all vertices that are at distance "k" from the root(usually denoted as "s" for source) before find any vertices at distance "k+1"
	- The depth of each node of the tree is the minimum number of edges(the length of the shortest path) required to get to is from the source(s) in both the tree and original graph. This path can be found by following parent pointers until reaching source(s).
	- BFS is a useful strategy when finding the shortest path between two vertices
- Depth First Search(DFS)
	- Start with a source vertex and recursively search the rest of the graph going as far as we can down one path before exploring any others
	- In large datasets specifying a search depth is applicable
- Shortest Paths
	- single-source - Find the shortest path from a source node to every other node in the graph(shortest route from the fire station to every location in town)
	- single-destination - Find the shortest path from every node in the graph to a destination node(shortest path to the hospital from any location)
	- all-pairs - Find the shortest path between every pair of nodes in the graph(GPS find best route from anywhere to anywhere)


#### Sorting Algorithms
- Bubble Sort
	- Unlikely to be actually useful
	- Given an array compare each pair of adjacent values and swap them if they are out of order
	- After `n-1` iterations the largest value will be at the end of the array
	- List is sorted with a total(worst case) runtime of `O(n^2)`
	- If the list is sorted or close to sorted we can achieve `O(n)` runtime
- Insertion Sort
	- Useful in practice for small data sets
	- Works iteratively on an array
	- For each element added to the end of the array either it is larger than all current elements or it can be moved to the correct place and all sorted elements after it are shifted down one spot
- Merge Sort
	- Sorts list recursively
	- Array is divided into multiple smaller sorted arrays
	- Runtime `O(n log n)`
	- In practice rather than dividing the sets down to single elements we stop dividing when the sets are reasonably small and use a more efficient algorithm (insertion sort)
- Quick Sort
	- Worst case runtime of `O(n^2)`
	- Worse runtime than mergesort but in practice is normally 2-3 times faster when it hits its average-case runtime of `O(n log n)`
	- Selecting a pviot and arranging all other elements of the array so that all elements to the left of the pivot are less than or equal to that pivot and all elements to the right are equal or greater
	- It is then called recursively on the left and right segments of the array until reaching the base case(segment contains one or zero values)
