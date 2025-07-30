/*
485. Max Consecutive Ones
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.

*/ 

class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int max=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                cnt++;
                max=Math.max(max,cnt);
            }
            else{
                cnt=0;
            }
        }
        return max;
    }
}