package leetcodePratice;

import java.util.HashMap;

public class exercise1_LeetCode1_Two_Sum {

	/*
	 * Example:
	 * 
	 * Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7
	 * =9, return [0, 1].
	 * 
	 */

	/**
	 * Solution1
	 * LEETCODE
	 */
    public int[] twoSum(int[] nums, int target) {
        int[] solutionForm= new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int a = nums[i] + nums[j];
				if (a == target) {
					solutionForm[0]=i;
					solutionForm[1]=j;
				}
			}
		}
		if (solutionForm == null) {
			System.out.println("NoSolution!");
		}
		return solutionForm;
    }

	/**
	 * Solution2 若數字有重複則答案不唯一，此方法不能找出所有結果，但比較快
	 */
	public static void targetFunction2(int[] array, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String solutionForm = null;
		for (int i = 0; i < array.length; i++) {
			if (map.containsKey(array[i])) {
				solutionForm = "[" + map.get(array[i]) + ", " + i + "]";
				System.out.println(solutionForm);
			} else {
				map.put(target - array[i], i);
			}
		}
		if (solutionForm == null) {
			System.out.println("NoSolution!");
		}
	}

	public static void main(String[] args) {

		int[] array = { 2, 2, 14, 7 };
		int target = 9;

		System.out.println("////////////////////");
		targetFunction2(array, target);
	}

}
