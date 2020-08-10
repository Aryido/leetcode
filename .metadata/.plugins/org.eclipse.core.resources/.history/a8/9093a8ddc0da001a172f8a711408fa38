package leetcodePratice;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class exercise349_LeetCode349_Intersection_Of_Two_Array {

	/*
		Given two arrays, write a function to compute their intersection.

		Example:
			Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
		
		Note:
			Each element in the result must be unique.
			The result can be in any order.
	 */
	//無腦解
	public static int[] intersection1(int[] nums1, int[] nums2) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					set.add(nums1[i]);
				}
			}
		}
		
		int[] ans= new int[set.size()];
		int count=0;
		for(Integer s:set) {
			ans[count]=s;
			count++;
		}
		
		return ans;
    }
	
	//LeetCode
	public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
	    int [] output = new int[set1.size()];
	    int idx = 0;
	    for (Integer s : set1)
	      if (set2.contains(s)) output[idx++] = s;

	    return Arrays.copyOf(output, idx);
	  }

	  public int[] intersection(int[] nums1, int[] nums2) {
	    HashSet<Integer> set1 = new HashSet<Integer>();
	    for (Integer n : nums1) set1.add(n);
	    HashSet<Integer> set2 = new HashSet<Integer>();
	    for (Integer n : nums2) set2.add(n);

	    if (set1.size() < set2.size()) return set_intersection(set1, set2);
	    else return set_intersection(set2, set1);
	  }
	
	
	
	
	public static void main(String[] args) {
		int[] nums1= {1, 2, 2, 1};
		int[] nums2= {2,1};		
		
		int[] ans = intersection1(nums1, nums2);
		
		for(int p:ans) {
			System.out.println(p+" ");
		}
		
	}

}
