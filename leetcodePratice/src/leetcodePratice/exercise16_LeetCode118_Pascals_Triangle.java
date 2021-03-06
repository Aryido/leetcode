package leetcodePratice;

import java.util.HashMap;

public class exercise16_LeetCode118_Pascals_Triangle {

	/*
	 * Given numRows, generate the first numRows of Pascal's triangle.
	 * 
	 * For example, given numRows = 5, Return
	 * 
	 * [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]
	 */

	/*
	 * 思路 每一列第一個值都是1。 每一列第n個值則是上一列n-1位子+n位子的值。 假如是該列最後一個值Nx，前一列沒有Nx這個值，可以視為0。
	 * 有了以上規則，要算出毎一列的值就很簡單了，直接看下面程式碼。
	 */

	public static String pascalsTriangleFunction(int val) {
		String ptString = "";

		HashMap<Integer, int[]> map = new HashMap<Integer, int[]>();
		for (int i = 1; i <= val; i++) {
			int[] arry = new int[i];
			for (int j = 0; j < i; j++) {
				if (map.containsKey(i - 1)) {

					if (j - 1 >= 0 && j < map.get(i - 1).length) {
						arry[j] = map.get(i - 1)[j - 1] + map.get(i - 1)[j];
					} else {
						arry[j] = 1;
					}

				} else {
					arry[j] = 1;
				}

			}
			map.put(i, arry);
		}

		for (int i = 1; i <= val; i++) {
			String spc = new String("");
			for (int j = 0; j < val - i; j++) {
				spc += " ";
			}
			try {
				System.out.print(spc);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int p : map.get(i)) {

				System.out.print(p + " ");
			}
			System.out.println(" ");
		}

		return ptString;
	}

	public static void main(String[] args) {
		pascalsTriangleFunction(5);
	}

}
