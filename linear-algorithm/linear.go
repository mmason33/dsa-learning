package main

import "fmt"

/**
 * Finding a value in an array with length of "n"
 * Time & Space Complexity - O(n) - Runtime will grow proportionally to the input length "n"
 * @param {[]int} list
 * @param {int} value
 */
func linear(list []int, value int) bool {
	result := false
	for i := 0; i < len(list); i++ {
		if list[i] == value {
			result = true
		}
	}

	return result
}

func main() {
	list := []int{1, 2, 3, 4, 5}
	value := 5
	// true
	fmt.Println(linear(list, value))

	v := 9
	// false
	fmt.Println(linear(list, v))
}
