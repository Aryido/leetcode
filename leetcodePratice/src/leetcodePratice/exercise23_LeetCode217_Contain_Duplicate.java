package leetcodePratice;

import java.util.Arrays;
import java.util.HashSet;

public class exercise23_LeetCode217_Contain_Duplicate {

	/*
	 	Given an array of integers, find if the array contains any duplicates. 
	 	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
	 */
	
	public static boolean containsDuplicate(int[] nums) {       
		HashSet<Integer> set = new HashSet<Integer>();	
		for(int i=0;i<nums.length;i++) {
			if(!set.contains(nums[i])) {
				set.add(nums[i]);
			}else {
				return true;
			}
		}
		return false;
    }
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		boolean ans = containsDuplicate(nums);
		System.out.println(ans);	
	}

}
