package leetcodePratice;

import java.util.ArrayList;
import java.util.HashMap;

public class exercise35_LeetCode38_Count_And_Say {

	/*
	 	The count-and-say sequence is the sequence of integers with the first five terms as following:

			1.     1
			2.     11
			3.     21
			4.     1211
			5.     111221
			1 is read off as "one 1" or 11.
			11 is read off as "two 1s" or 21.
			21 is read off as "one 2, then one 1" or 1211.

		Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence. 
		You can do so recursively, in other words from the previous member read off the digits, counting the number of digits in groups of the same digit.

		Note: 
			Each term of the sequence of integers will be represented as a string.
	 */
	
	
	/*
	 *	 遞迴解法
	 */
	public static String countAndSay(int n) {
		
		// integer n where 1 ≤ n ≤ 30
		if(n==1) {
			return "1";
		}
		
		String ansStr = "";
		String str = countAndSay(n-1)+"*"; //	加上"*"可避免IndexOutOfBounds，且更好判斷迴圈何時終止
		int count = 1;
		
		for(int i=0;i<str.length();i++) {	
			
			if(str.charAt(i)=='*') {
				break;
			}
			
			if(str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				ansStr=""+ansStr+count+str.charAt(i);
				count=1;// count初始化
			}
		}
		
		return ansStr;
	}
	
	
	public static void main(String[] args) {
		String ans = countAndSay(12);
		System.out.println(ans);
		
	}

}
