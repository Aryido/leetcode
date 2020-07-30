package leetcodePratice;

public class exercise5_LeetCode258_Add_Digits {

	
	/*
	Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
	For example:
	Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	Follow up:
	Could you do it without any loop/recursion in O(1) runtime?
	 */
	
	/**
	 * 	用遞迴解去解題(可能時間複雜度高)
	 * @param num
	 * @return 
	 */
	public static int addDigitsFunction(int num) {
		String stringNum = Integer.toString(num);
		String[] arrayDigits = stringNum.split("");
		
		Integer newnum = new Integer(0);
		while(num>=10) {
			for ( String string : arrayDigits) {
				int i = Integer.parseInt(string);
				newnum+=i;	
			}
			return addDigitsFunction(newnum); 	
		}
		
		return num; 
	}
	
	
	/**
	 * 	數學解法，用9的餘數判斷
	 */
	public static int addDigitsFunction2(int num) {
		
		if(num<=9) {
			return num; 
		}
		
		if(num%9==0) {
			return 9;
		}else {
			return num%9;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		//int solution = addDigitsFunction(23);
		int solution = addDigitsFunction2(18);
		System.out.println(solution);

	}

}
