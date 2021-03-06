package leetcodePratice;

public class exercise27_LeetCode191_Number_Of_One_Bits {

	/*
	 	Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
		For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
	 */
	
	public static int hammingWeight(int n) {
		
		int count=0;
		String strN = Integer.toBinaryString(n).toString();
		String[] arrayN = strN.split("");
		
		for(int i=0;i<arrayN.length;i++) {
			if(arrayN[i].equals("1")) {
				count++;
			}
		}
		
		return count;
	}
	
	//LEETCODE
	public static int hammingWeight2(int n) {
		
		int count = 0;
		int testIndex = 1;
		
		//因為32bit
		for(int i=0;i<32;i++) {
			if((n&testIndex)!=0) {
				count++;
			}
			testIndex<<=1;
		}
		
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		hammingWeight(11);
		System.out.println(hammingWeight(11));

		hammingWeight2(11);
	}

}
