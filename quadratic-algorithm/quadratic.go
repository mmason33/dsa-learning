package main

import (
	"fmt"
	"math"
)

/**
 * Quadratic - comparing every element to every other element
 * For each element check every element to see if it's the Sqrt of the current element
 * Time & Space Complexity - O(n^2) - We do O(n) work O(n) times - loop over list(n) "n" times
 * @param {[]int} list
 */
func quadratic(list []int) bool {
	result := false

	for i := 0; i < len(list); i++ {
		current := list[i]

		for j := 0; j < len(list); j++ {
			// Type conversion
			// math.Sqrt expects float64 and int provided
			calc := math.Sqrt(float64(list[j]))
			if int(calc) == current {
				result = true
			}
		}
	}

	return result
}

func main() {
	// true
	list := []int{3, 4, 5, 6, 7, 8, 16}
	fmt.Println(quadratic(list))

	// false
	l := []int{3, 4, 5, 6, 7, 8}
	fmt.Println(quadratic(l))
}
