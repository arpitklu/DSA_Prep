/*
136. Single Number
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/


class Solution {
    public int singleNumber(int[] nums) {
        //step1 : initialize map
        HashMap<Integer,Integer>hm = new HashMap<>();

        //step2: add to map
        for(int currNum:nums){
            if(!hm.containsKey(currNum)){
                hm.put(currNum,1);
            }
            else{
                hm.put(currNum,2);
                //hm.put(currNum,hm.get(currNum)+1);
            }
        }

        //step3: iterate in map
        for(Integer key:hm.keySet()){
            if(hm.get(key)==1){
                return key;
            }
        }
        return -1;

    }
}
//Find Element that appear once.