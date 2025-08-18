/*

3467. Transform Array by Parity
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:

Replace each even number with 0.
Replace each odd numbers with 1.
Sort the modified array in non-decreasing order.
Return the resulting array after performing these operations.

 

Example 1:

Input: nums = [4,3,2,1]

Output: [0,0,1,1]

Explanation:

Replace the even numbers (4 and 2) with 0 and the odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].
After sorting nums in non-descending order, nums = [0, 0, 1, 1].
Example 2:

Input: nums = [1,5,1,4,2]

Output: [0,0,1,1,1]

Explanation:

Replace the even numbers (4 and 2) with 0 and the odd numbers (1, 5 and 1) with 1. Now, nums = [1, 1, 1, 0, 0].
After sorting nums in non-descending order, nums = [0, 0, 1, 1, 1].
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 1000
 

Seen this question in a real interview before?
1/5
Yes
No
Accepted
63,605/71K
Acceptance Rate
89.6%

*/

class Solution {
    public int[] transformArray(int[] nums) {
        int arr[]= new int[nums.length];
        int idx=0;
        for(int i: nums){
            if(i % 2 == 0){
                arr[idx++]=0;
            }
            else if(i % 2 != 0){
                arr[idx++]=1;
            }
        }
        Arrays.sort(arr);
        return arr;
    }
}