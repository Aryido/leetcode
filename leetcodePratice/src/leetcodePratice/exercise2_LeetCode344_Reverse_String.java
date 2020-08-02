package leetcodePratice;

public class exercise2_LeetCode344_Reverse_String {

	/*
	Write a function that takes a string as input and returns the string reversed.
	Example: Given s = "hello", return "olleh".
	*/
	
	/**
	 * solution1
	 */
	public static void reverseString(String string) {
		String[] stringArray = string.split("");
		StringBuilder sb = new StringBuilder();
		for(int i=stringArray.length-1;i>=0;i--) {
			//System.out.println(stringArray[i]);
			sb.append(stringArray[i]);
		}
		System.out.println(sb);
	}
	
	
	public static void main(String[] args) {
		
		String s="hello";
		reverseString(s);
		
	}

}