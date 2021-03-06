package leetcodePratice;

public class exercise12_LeetCode231_Power_Of_Two {

	/*
	 * Given an integer, write a function to determine if it is a power of two.
	 */
	
	public static boolean powerOfTwoFunction(int num) {
		
		if(num<=1) {
			return false;
		}
		
		while(num>=2) {
			if(num>=2 && num%2!=0) {
				return false;
			}
			num=num/2;
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
	
		boolean ans = powerOfTwoFunction(9);
		
		System.out.println(ans);
		
		
	}

}
