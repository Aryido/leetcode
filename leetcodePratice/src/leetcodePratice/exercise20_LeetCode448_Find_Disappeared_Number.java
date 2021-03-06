package leetcodePratice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class exercise20_LeetCode448_Find_Disappeared_Number {

	/*
	 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
	 * elements appear twice and others appear once. Find all the elements of [1, n]
	 * inclusive that do not appear in this array.
	 * 
	 * Could you do it without extra space and in O(n) runtime? You may assume the
	 * returned list does not count as extra space.
	 * 
	 * Example:
	 * 
	 * Input: [4,3,2,7,8,2,3,1]
	 * 
	 * Output: [5,6]
	 */

	/*
	 * 不管效率和記憶體解法
	 */
	static void findDisappearedNumberFunction1(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int j = 1; j <= nums.length; j++) {
			if (!set.contains(j)) {
				list.add(j);
			}
		}

		System.out.print("[");
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
				break;
			}
			System.out.print(list.get(i) + ", ");
		}
		System.out.println("]");
	}

	/*
	 	[ 4,  3,  2,  7,  8,  2,  3,  1] -> [ 4,  3,  2, -7,  8,  2,  3,  1]
		[ 4,  3,  2, -7,  8,  2,  3,  1] -> [ 4,  3, -2, -7,  8,  2,  3,  1]
		[ 4,  3, -2, -7,  8,  2,  3,  1] -> [ 4, -3, -2, -7,  8,  2,  3,  1]
		[ 4, -3, -2, -7,  8,  2,  3,  1] -> [ 4, -3, -2, -7,  8,  2, -3,  1]
		[ 4, -3, -2, -7,  8,  2, -3,  1] -> [ 4, -3, -2, -7,  8,  2, -3, -1]
		[ 4, -3, -2, -7,  8,  2, -3,  1] -> [ 4, -3, -2, -7,  8,  2, -3, -1]
		[ 4, -3, -2, -7,  8,  2, -3,  1] -> [ 4, -3, -2, -7,  8,  2, -3, -1]
		[ 4, -3, -2, -7,  8,  2, -3,  1] -> [-4, -3, -2, -7,  8,  2, -3, -1]
	 */
	/*
	 * 遍歷每個元素，把與元素值
	 * 近似（實際差個1）的那個索引對應的元素賦值負數，然後遍歷一遍完成後，再次遍歷，如果某個索引對應的元素值是正數，就說明與這個索引相同的值在數組中不存在
	 * ，就是結果了。
	 */
	static void findDisappearedNumberFunction2(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[Math.abs(nums[i]) - 1] != Math.abs(nums[i])) {
				nums[Math.abs(nums[i]) - 1] = (nums[Math.abs(nums[i]) - 1] > 0) ? -nums[Math.abs(nums[i]) - 1] : nums[Math.abs(nums[i]) - 1];
			}
		}
		
		
		for(int i=0;i<nums.length;i++) {	
			if(nums[i]>0) {
				System.out.print(i+1+", ");
			}
		}
		
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		findDisappearedNumberFunction1(nums);
		findDisappearedNumberFunction2(nums);

	}

}
