package main

import (
	"fmt"
	"math"
)

func merge(left []int, right []int) []int {
	var result []int
	leftIndex := 0
	rightIndex := 0

	for leftIndex < len(left) && rightIndex < len(right) {
		if left[leftIndex] < right[rightIndex] {
			result = append(result, left[leftIndex])
			leftIndex++
		} else {
			result = append(result, right[rightIndex])
			rightIndex++
		}
	}

	result = append(result, left[leftIndex:]...)
	result = append(result, right[rightIndex:]...)
	return result
}

func mergeSort(unsortedIntList []int) []int {
	if len(unsortedIntList) <= 1 {
		return unsortedIntList
	}

	middleIndex := int(math.Floor(float64(len(unsortedIntList)) / 2))

	left := unsortedIntList[0:middleIndex]
	right := unsortedIntList[middleIndex:]

	return merge(
		mergeSort(left),
		mergeSort(right),
	)
}

func main() {
	// prints sorted slice [1 2 3 4 5 10 12 17 33]
	fmt.Println(mergeSort([]int{5, 4, 2, 17, 33, 12, 3, 1, 10}))
}
