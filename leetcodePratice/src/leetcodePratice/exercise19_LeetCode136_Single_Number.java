package leetcodePratice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class exercise19_LeetCode136_Single_Number {

	/*
	 * Given a non-empty array of integers, every element appears twice except for
	 * one. Find that single one.
	 * 
	 * Note: Your algorithm should have a linear runtime complexity. Could you
	 * implement it without using extra memory?
	 * 
	 * Example 1: Input: [2,2,1] Output: 1
	 * 
	 * Example 2: Input: [4,1,2,1,2] Output: 4
	 */

	// 方法一 直觀用map存起來
	static int singleNumberFunction1(int[] nums) {
		int singleNumber1 = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(nums[i])) {
					int count = map.get(nums[i])+1;
					map.put(nums[i], count);				
			} else {
				map.put(nums[i], 1);
			}
		}	
		
		for(Integer p:map.keySet()) {
			if(map.get(p)==1) {
				singleNumber1=p;
				break;
			}	
		}
		return singleNumber1;
	}
	
	
	/*
	 * 上網看到的非人類解法...LEETCODE
	 */
	static int singleNumberFunction2(int[] nums) {
		int singleNumber = 0;
		
		for(int num:nums) {
			singleNumber=singleNumber^num;
		}
		
		return singleNumber;
	}
	
	/*
	 * The algorithm should have a linear runtime complexity and without using extra memory.
	 */
	static int singleNumberFunction3(int[] nums) {
		
		if(nums==null||nums.length==0) {
			return -1;
		}
		
		int singleNumber3 = -1;
		
		if(nums.length==1) {
			singleNumber3=nums[0];
		}
		
		//	排序nums
		Arrays.sort(nums);
		
		if(nums[0]!=nums[1]) {
			singleNumber3=nums[0];
			return singleNumber3;
		}
		
		if(nums[nums.length-2]!=nums[nums.length-1]) {
			singleNumber3=nums[nums.length-1];
			return singleNumber3;
		}
		
		for(int i=1;i<nums.length-2;i++) {
			if(nums[i]!=nums[i+1]&&nums[i+1]!=nums[i+2]) {
				singleNumber3=nums[i+1];
			}
		}
		
		return singleNumber3;
	}
	

	public static void main(String[] args) {
		//int[] nums = { 2, 2, 1 };
		//int[] nums = { 4,1,2,1,2 };
		int[] nums = { 1,1,2,2,2,2,3,3,4,5,5,5,5,6,6,9,9,9,9};
		
		int ans = singleNumberFunction1(nums);
		System.out.println(ans);
		
		int ans2 = singleNumberFunction2(nums);
		System.out.println(ans2);
	
		int ans3 = singleNumberFunction3(nums);
		System.out.println(ans3);

	}

}
