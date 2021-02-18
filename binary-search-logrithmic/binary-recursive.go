package main

import (
	"fmt"
	"math"
)

/**
 * Binary Search - usually assumes a sorted array - Divide and Conquer - O(log n)
 * @param {array} list
 * @param {integer} value
 */
func binarySearchRecursive(list []int, startIndex int, endIndex int, value int) int {
	if startIndex > endIndex {
		return -1
	}

	floorVal := float64((startIndex + endIndex) / 2)
	middleIndex := int(math.Floor(floorVal))

	if value == list[middleIndex] {
		return value
	} else if value > list[middleIndex] {
		return binarySearchRecursive(list, middleIndex+1, endIndex, value)
	}

	return binarySearchRecursive(list, startIndex, middleIndex-1, value)
}

func main() {
	list := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}

	// prints 36
	fmt.Println(binarySearchRecursive(list, 0, len(list)-1, 36))

	// prints -1
	fmt.Println(binarySearchRecursive(list, 0, len(list)-1, 57))
}
