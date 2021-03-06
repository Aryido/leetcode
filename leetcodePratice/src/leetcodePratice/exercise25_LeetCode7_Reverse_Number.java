package leetcodePratice;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise25_LeetCode7_Reverse_Number {

	/*
	 	Given a 32-bit signed integer, reverse digits of an integer.

		Example 1:
				Input: 123
				Output: 321
				
		Example 2:
				Input: -123
				Output: -321
				
		Example 3:
				Input: 120
				Output: 21
	 */
	
	public static int reverse(int x) {
		
		if(x==0) {
			return 0;
		}
		
		
		String ans="";
		
		String strx = Integer.toString(x);
		StringBuffer xSb = new StringBuffer();
		strx=xSb.append(strx).reverse().toString();
		
		String[] arrayx = strx.split("");
		
		
		StringBuffer sb = new StringBuffer();
		ArrayList<String> list = new ArrayList<String>();
		boolean isNegative=false;
		
		//負號
		if(arrayx[arrayx.length-1].equals("-")) {
			isNegative=true;
		}
		
		//90100>>109
		int index=0;
		for(int i=0;i<arrayx.length;i++) {
			if(!arrayx[i].equals("0")) {
				index=i;
				break;
			}
		}
		for(int i=index;i<arrayx.length;i++) {
			if(!arrayx[i].equals("-")) {
				sb.append(arrayx[i]);
				ans=sb.toString();
			}
		}
		
		
		
		
		if(isNegative) {
			ans="-"+ans;
		}
		
			
		long longAns = Long.parseLong(ans);
		
		
		
		return (int)longAns;
	}
	
	//LEETCODE
	public int reverse1(int x) {
	      int rev = 0;
	       while (x != 0) {
	            int pop = x % 10;
	            x /= 10;
	            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
	            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
	            rev = rev * 10 + pop;
	        }
	        return rev;
	 }
	
	
	public static void main(String[] args) {
		reverse(123);
		System.out.println(reverse(-90100));

	}

}
