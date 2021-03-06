package leetcodePratice;

public class exercise4_LeetCode371_Sum_of_Two_Integers {

	/*
	 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
	 */
	
	/*1 假設輸入的數字為a=3(0011), b=9(1001);
 	2 相加不考慮進位 a = a^b = (0011)^(1001) = 1010;
	3相加只考慮進位 carry =a&b = (0011)^(1001) = 0001 進位值;
	4 b = 0001 << 1 = 0010 進位;
	5 第一輪後 a= 10(1010), b = 2(0010);
	6 相加不考慮進位 a = a^b = (1010)^(0010) = 1000;
	7 相加只考慮進位 carry =a&b = (1010)^(0010) = 0010 進位值;
	8 b = 0001 << 1 = 0100 進位;
	9 第二輪後 a= 8(1000), b = 4(0010);
	10 相加不考慮進位 a = a^b = (1000)^(0100) = 1100;
	11 相加只考慮進位 carry =a&b = (1010)^(0010) = 0000 進位值;
	12 b = 0000 << 1 = 0;
	13 b=0，相加完成， a = 1100 = 12;
	*/
	
	
	/**
	 * 計算a,b的加總，但是不能用+-符號。
	 * @param a
	 * @param b
	 */
	public static int sumOfTwoNum(int a, int b) {
		
		int carry=0;//進位值
		
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		
		//以下演算順序不可顛倒
		while(b!=0) {			
			carry=a&b;
			a=a^b;
			b=carry<<1;
		}
		return a^b;	
	}
	
	
	public static void main(String[] args) {
		
		int ans = sumOfTwoNum(3, 6);
		System.out.println(ans);
		
	}

}
