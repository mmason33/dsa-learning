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
func binarySearch(list []int, value int) bool {
	iterator := 0
	result := false
	startIndex := 0
	endIndex := len(list) - 1

	for startIndex <= endIndex {
		iterator++
		floorVal := float64((startIndex + endIndex) / 2)
		middleIndex := int(math.Floor(floorVal))

		if list[middleIndex] == value {
			fmt.Println("Found value!")
			result = true
			break
		} else if value > list[middleIndex] {
			startIndex = middleIndex + 1
		} else if value < list[middleIndex] {
			endIndex = middleIndex - 1
		} else {
			fmt.Println("Not found looping again")
		}

	}

	fmt.Printf("Search took %x iterations \n", iterator)
	return result
}

func main() {
	list := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40}
	value := 36
	fmt.Println(binarySearch(list, value))
}
