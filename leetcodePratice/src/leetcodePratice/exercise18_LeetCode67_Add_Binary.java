package leetcodePratice;

public class exercise18_LeetCode67_Add_Binary {

	/*
	 * Given two binary strings, return their sum (also a binary string). The input
	 * strings are both non-empty and contains only characters 1 or 0.
	 * 
	 * Example 1: Input: a = "11", b = "1" Output: "100"
	 * 
	 * Example 2: Input: a = "1010", b = "1011" Output: "10101"
	 */

	static String addBinary(String a, String b) {
		String ans = "";

		StringBuffer sba = new StringBuffer(a).reverse();
		StringBuffer sbb = new StringBuffer(b).reverse();
		int maxLength = Math.max(sba.length(), sbb.length());

		// 把兩個數補零至長度都一樣
		while (sba.length() < maxLength) {
			sba.append("0");
		}
		while (sbb.length() < maxLength) {
			sbb.append("0");
		}

		StringBuffer res = new StringBuffer();
		int sum = 0;
		int num1;
		int num2;
		for (int i = 0; i < maxLength; i++) {

			// num1 = sba.charAt(i) - '0';
			num1 = Character.getNumericValue(sba.charAt(i));

			// num2 = sbb.charAt(i) - '0';
			num2 = Character.getNumericValue(sbb.charAt(i));

			if (sum + num1 + num2 > 1) {
				res.append(sum + num1 + num2 - 2);
				sum = 1;
			} else {
				res.append(sum + num1 + num2);
				sum = 0;
			}
		}
		if (sum == 1) {
			res.append("1");
		}

		ans = res.reverse().toString();

		return ans;
	}

	public static void main(String[] args) {
		System.out.println(addBinary("1010", "10101"));

	}

}
