package leetcodePratice;

import java.util.ArrayList;
import java.util.HashMap;

public class exercise21_LeetCode189_Rotate_Array {

	/*
	 * Question: Given an array, rotate the array to the right by k steps, where k
	 * is non-negative.
	 * 
	 * Example 1: Input: [1,2,3,4,5,6,7] and k = 3 Output: [5,6,7,1,2,3,4]
	 * Explanation: rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to
	 * the right: [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4]
	 * 
	 * Example 2: Input: [-1,-100,3,99] and k = 2 Output: [3,99,-1,-100]
	 * Explanation: rotate 1 steps to the right: [99,-1,-100,3] rotate 2 steps to
	 * the right: [3,99,-1,-100]
	 * 
	 * Note: Try to come up with as many solutions as you can, there are at least 3
	 * different ways to solve this problem. Could you do it in-place with O(1)
	 * extra space?
	 */

	// 不考慮Note的解法
	static void rotateArrayFunction1(int[] numsArray, Integer k) {
		HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
		k = k % numsArray.length;
		for (int i = 0; i < numsArray.length; i++) {
			if (i + k < numsArray.length) {
				nums.put(i + k, numsArray[i]);
			} else {
				nums.put(i + k - numsArray.length, numsArray[i]);
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numsArray.length; i++) {
			list.add(nums.get(i));
		}
		System.out.println(list);
	}

	// with O(1)
	static void rotateArrayFunction2(int[] numsArray, Integer k) {
		k = k % numsArray.length;
		reverse(numsArray, 0, numsArray.length-1);
		reverse(numsArray, 0, k-1);
		reverse(numsArray, k, numsArray.length-1);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < numsArray.length; i++) {
			list.add(numsArray[i]);
		}
		System.out.println(list);
	}

	private static void reverse(int[] numsArray, int start, int end) {
		while (start < end) {
			int temp = numsArray[start];
			numsArray[start] = numsArray[end];
			numsArray[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] numsArray = { 1, 2, 3, 4, 5, 6, 7 };
		rotateArrayFunction1(numsArray, 3);
		rotateArrayFunction2(numsArray, 8);

	}

}
