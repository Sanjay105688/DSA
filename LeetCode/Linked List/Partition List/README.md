# 86. Partition List

[![LeetCode Link](https://img.shields.io/badge/LeetCode-Problem_Link-FFA116?style=flat-square&logo=leetcode)](https://leetcode.com/problems/partition-list/)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-eab308?style=flat-square)

## Problem Statement

Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

 
Example 1:

Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]


Example 2:

Input: head = [2,1], x = 2
Output: [1,2]


 
Constraints:


	The number of nodes in the list is in the range [0, 200].
	-100 <= Node.val <= 100
	-200 <= x <= 200

## Examples

```
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]

Input: head = [2,1], x = 2
Output: [1,2]

Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
```

## Constraints

- The number of nodes in the list is in the range [0, 200].
- -100 <= Node.val <= 100
- -200 <= x <= 200

---
*Synced automatically with [AlgoVault](https://github.com/mr-sanjai-offl/AlgoVault)*