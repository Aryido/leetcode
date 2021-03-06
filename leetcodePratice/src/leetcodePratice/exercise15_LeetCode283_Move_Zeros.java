package leetcodePratice;


public class exercise15_LeetCode283_Move_Zeros {

	/*
	 	Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

		For example
			given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].		
		Note:
			You must do this in-place without making a copy of the array.
			Minimize the total number of operations.
	 */
	
	
	/**
	 * index來記錄碰到的非0數字，最後把Array的index之後的數字改為0就完成搬移的動作。
	 */
	static int[] moveZerosFunction(int[] nums) {
		
		//	遇到非0整數，將整數塞到index的位子
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				continue;
			}
			nums[index]=nums[i];
			index++;	
		}
		
		//把index後的位置都擺0
		for(int j=index;j<nums.length;j++) {
			nums[j]=0;
		}	
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] nums= {0, 1, 0, 3, 12};
		int[] ansArray = moveZerosFunction(nums);
		
		for(int p:ansArray) {
			System.out.print(p+" ");
		}
			
	}

}
