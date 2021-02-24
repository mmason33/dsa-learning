package main

import "fmt"

/**
 * Bubble Sort - Comparison sort
 * @param {array} list
 * List is sorted with a total(worst case) runtime of `O(n^2)`
 */
func bubbleSort(list []int) {
	for i := 0; i < len(list); i++ {
		for j := i + 1; j < len(list); j++ {
			if list[j] < list[i] {
				temp := list[i]
				list[i] = list[j]
				list[j] = temp
			}
		}
	}

	fmt.Println(list)
}

func main() {
	bubbleSort([]int{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})
}
