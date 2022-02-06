# leetcode
Leet Code problem Algorithm practices record

80. Remove Duplicates from Sorted Array II
Medium

2981
Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

Example 1:

Input: nums = [1,1,1,2,2,3]
Output: 5, nums = [1,1,2,2,3,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 

Constraints:

1 <= nums.length <= 3 * 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.

# leetcode-CN

1748. 唯一元素的和
给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。

请你返回 nums 中唯一元素的 和 。

示例 1：

输入：nums = [1,2,3,2]
输出：4
解释：唯一元素为 [1,3] ，和为 4 。
示例 2：

输入：nums = [1,1,1,1,1]
输出：0
解释：没有唯一元素，和为 0 。
示例 3 ：

输入：nums = [1,2,3,4,5]
输出：15
解释：唯一元素为 [1,2,3,4,5] ，和为 15 。

提示：

1 <= nums.length <= 100
1 <= nums[i] <= 100