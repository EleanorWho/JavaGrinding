# Question
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

## Example 1:
Input: nums = [2,7,11,15], target = 9

Output: [0,1]

Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

## Example 2:
Input: nums = [3,2,4], target = 6

Output: [1,2]

## Example 3:
Input: nums = [3,3], target = 6

Output: [0,1]
 

## Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

## Follow-up: 
Can you come up with an algorithm that is less than O(n2) time complexity?

# Notes
## Brute force will cost a time complexity of O(n2).
The brute force thinking process is like: check each pair to see if the addition is equal to the target number.

However, this solution costs a time complexity of O(n2) because we need a nested loop to check every two elements.

## To solve the problem within O(n2) time complexity
We need to come up with a better approach. What if I store what I've seen? So for each number, I can find a (target - number). If this complement is in the same storage, we can know both number and their indices.

## Conclusion
This is a Data Structure problem. 

This problem has two key points: the specific number which needs to be compared in the loop, the index of the specific number.

In order to get these two items, we need a data structure to store both of them, while distinguishing each other.

HashMap is the best structure to store two elements with different roles. This is why we choose HashMap to solve this problem.

As for the time complexity, because the looking up using HashMap is only O(1), so the worst case is O(n) because of the iteration.