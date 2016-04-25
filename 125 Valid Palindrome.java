/**
* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
* For example,
* "A man, a plan, a canal: Panama" is a palindrome.
* "race a car" is not a palindrome.
**/

public class Solution {
	public boolean isPalindrome(String s) {
		if(s==null){
			return true;
		}
		String str = s.toLowerCase().replaceAll("\\W", "");
		char[] chars = str.toCharArray();
		int length = str.length();
		Solution solution = new Solution();
		for(int i=0,j=length-1;j-i>0;i++,j--){
			if(chars[i]!=chars[j])
				return false;
		}
	    return true;
    }
} 