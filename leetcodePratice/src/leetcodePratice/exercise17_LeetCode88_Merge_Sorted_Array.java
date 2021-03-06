package leetcodePratice;

import java.util.Arrays;



public class exercise17_LeetCode88_Merge_Sorted_Array {

	/*
	 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as
	 * one sorted array.
	 * 
	 * Note: You may assume that nums1 has enough space (size that is greater or
	 * equal to m + n) to hold additional elements from nums2. The number of
	 * elements initialized in nums1 and nums2 are m and n respectively
	 */

	static int[] mergeSortedArrayFunction(int[] nums1, int[] nums2) {

		int indexOfZero=0;
		
		for(int i=nums1.length-1;i>=0;i--) {
			if(nums1[i]!=0) {
				indexOfZero=i;
				break;
			}
		}
		for(int j=0;j<nums2.length;j++) {
			indexOfZero++;
			nums1[indexOfZero]=nums2[j];
		}
		
		//方法1.直接用API來排序:Arrays的sort方法
		Arrays.sort(nums1);
		
		//方法二:泡沫排序法
//		int tmp=0;
//		for(int i=0;i<nums1.length;i++) {
//			for(int j=i+1;j<nums1.length;j++) {
//				if(nums1[i]>nums1[j]) {
//					tmp=nums1[i];
//					nums1[i]=nums1[j];
//					nums1[j]=tmp;
//				}
//			}
//		}
		
		return nums1;
	}
	
	
	//LEETCODE
	public static void merge(int[] nums1, int m, int[] nums2, int n) {	
        for(int i=m;i<nums1.length;i++) {
        	nums1[i]=nums2[i-m];
        }
        
        Arrays.sort(nums1);
        
        for(int p:nums1) {
			System.out.print(p+" ");
		}
    }

	public static void main(String[] args) {

		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = { 2,5,6 };
		
//		int[] ansArray = mergeSortedArrayFunction(nums1, nums2);
//		for(int p:ansArray) {
//			System.out.print(p+" ");
//		}
		int m=3;
		int n=3;
		merge(nums1, m, nums2, n);

	}

}
