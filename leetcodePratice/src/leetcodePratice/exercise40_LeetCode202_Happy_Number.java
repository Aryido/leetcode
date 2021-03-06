package leetcodePratice;

import java.util.HashSet;

public class exercise40_LeetCode202_Happy_Number {

	/*
	 	Write an algorithm to determine if a number n is "happy".

		A happy number is a number defined by the following process: 
			Starting with any positive integer, replace the number by the sum of the squares of its digits, 
			and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
			Those numbers for which this process ends in 1 are happy numbers.
		
		Return True if n is a happy number, and False if not.
		
		Example: 
			Input: 19
			Output: true
			
		Explanation: 
				1^2 + 9^2 = 82
				8^2 + 2^2 = 68
				6^2 + 8^2 = 100
				1^2 + 0^2 + 0^2 = 1
	 */
	
	public static HashSet set = new HashSet<String>();
	
	
	
	public static boolean isHappy(int n) {
		if(n<=0) {
			set = new HashSet<String>();
			return false;
		}
		int sum=0;
		String str="";
		String[] array = Integer.toString(n).split("");
			
		for(int i=0;i<array.length;i++) {
				int k = Integer.parseInt(array[i]);
				sum = sum+k*k;
				str=Integer.toString(sum);
			}
			if(sum==1) {
				set = new HashSet<String>();
				return true;
			}
		
			if(set.contains(str)) {
				set= new HashSet<String>();
				return false;
			}
			str=Integer.toString(sum);
			set.add(str);
		
		return isHappy(sum);
    }
	
	//	另解:不使用遞迴
	public static boolean isHappy2(int n) {
		HashSet<Integer> seen = new HashSet<>();
		//	加不進去代表seen內已存在n這個元素
		while (seen.add(n)) {
			int square = 0;
			int sum = 0;
			while (n!=0) {
				square = n%10;
				sum += (square*square);
				n /=10;
			}
		n = sum;
		}
		return n==1 ? true : false;
	}
	
	
	public static void main(String[] args) {
		boolean a = isHappy2(13);
		boolean b = isHappy2(19);
		System.out.println(a);
		System.out.println(b);

	}

}
