package main

import "fmt"

/**
 * Insertion Sort - sort array by shifting values depending on the comparison
 * @param {array} nums
 * List is sorted with a total(worst case) runtime of `O(n^2)`
 */
func insertionSort(list []int) []int {
	for i := 1; i < len(list); i++ {
		j := i - 1
		temp := list[i]

		for j >= 0 && list[j] > temp {
			list[j+1] = list[j]
			j--
		}

		list[j+1] = temp
	}

	return list
}

func main() {
	fmt.Println(insertionSort([]int{3, 1, 5, 6, 2}))
}
