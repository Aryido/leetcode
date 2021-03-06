package leetcodePratice;

import java.util.ArrayList;
import java.util.Collections;

public class exercise8_LeetCode53_Maximum_Subarray {

	/*
	 * Given an integer array nums, find the contiguous subarray (containing at
	 * least one number) which has the largest sum and return its sum. 
	 * Example:
	 * Input: [-2,1,-3,4,-1,2,1,-5,4], 
	 * Output: 6 
	 * Explanation: [4,-1,2,1] has the
	 * largest sum = 6.
	 */

	/**
	 * 轉移方程式
	 * @param array
	 * @return integer
	 */
	public static int maximumSubarray(int[] array) {

		if (array == null || array.length == 0) {
			return 0;
		}

		int maxnum = 0;
		int res = array[0];
		for (int i = 0; i < array.length; i++) {
			// 公式： 變數 x = (表達式) ? 若真取此值 : 若假取此值
			maxnum = (maxnum + array[i] >= array[i]) ? maxnum + array[i] : array[i];
			res = (maxnum >= res) ? maxnum : res;

		}

		return res;
	}
	

	/**
	 * 暴力解法
	 * @param nums
	 * @return res
	 */
	public static int maxSubArray(int[] nums) {
		int len = nums.length;
		if (len == 0|| nums==null) {
			return 0;
		}
		
		int sum=0;		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0;i<nums.length;i++) {
			sum=nums[i];
			for(int j=i+1;j<nums.length;j++) {
				sum=sum+nums[j];
				list.add(sum);
			}
		}
		
		Integer maxsum = (Integer)Collections.max(list);
		
		
		
		return maxsum;
	}

	public static void main(String[] args) {
		int[] array = { 4,-1,2,1};
		System.out.println(maximumSubarray(array));
		//System.out.println(maxSubArray(array));
	}

}
