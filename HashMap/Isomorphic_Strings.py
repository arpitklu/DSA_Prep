'''

205. Isomorphic Strings
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

 

Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true

 

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.

'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1 = {}
        for i in range(len(s)) :
            ch1=s[i]
            ch2=t[i]

            if ch1 in d1 :
                if d1[ch1] != ch2 :
                    return False
                
            elif ch2 in d1.values():
                return False
                
            d1[ch1] = ch2
        
        return True