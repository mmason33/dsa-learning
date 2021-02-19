package main

import "fmt"

/**
 * Two Sum
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * One-pass Hash Table O(n) vs Two-pass Hash Table O(n) vs Brute Force O(n^2)
 * Space complexity O(n)
 * Time complexity O(n)
 * Overall O(n)
 */
func twoSum(nums []int, target int) []int {
	hashTable := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		difference := target - nums[i]

		if val, ok := hashTable[difference]; ok {
			return []int{val, i}
		}

		hashTable[nums[i]] = i
	}

	return []int{-1}
}

func main() {

	// [0, 1]
	fmt.Println(twoSum([]int{2, 7, 11, 15}, 9))

	// [-1]
	fmt.Println(twoSum([]int{2, 7, 11, 15}, 33))
}
