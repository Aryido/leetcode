package leetcodePratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class exercise22_LeetCode189_Rotate_Array {

	/*
	 	Rotate an array of n elements to the right by k steps.

		For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

		Note: 
			Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
	 */
	
	/*
		給一個n值，n代表陣列中包含1~n個元素與一個整數k，將陣列裡面的元素向右旋轉k次。

		範例：
			n=7,k=3, array[1,2,3,4,5,6,7] -->  [5,6,7,1,2,3,4]
	 */
	
	//一般方法
	 public void rotate(int[] nums, int k) {
	       HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();//HashMap<位移到第a位置,原本nums第i個位置的數字>
	       for(int i=0;i<nums.length;i++) {
	    	   int a = (i+k)%nums.length;
	    	   map.put(a, nums[i]);   
	       }
	       
	       ArrayList<Integer> list = new ArrayList<Integer>();
//	       for(Entry<Integer, Integer> e:map.entrySet()) {
//	    	   list.add(e.getKey(), e.getValue());
//	       }
	       
		for( Integer e:map.keySet()) {
			list.add(e, map.get(e));
	       }
	       
	       System.out.println(list);
	       
	       for(int i=0;i<nums.length;i++) {
	    	   nums[i]=list.get(i);
	       }
	 }
	
	 //LEETCODE
	 public void rotate1(int[] nums, int k) {
		    // speed up the rotation
		    k %= nums.length;
		    int temp, previous;
		    for (int i = 0; i < k; i++) {
		      previous = nums[nums.length - 1];
		      for (int j = 0; j < nums.length; j++) {
		        temp = nums[j];
		        nums[j] = previous;
		        previous = temp;
		      }
		    }
		  }
	
	
	public static void main(String[] args) {
		
		exercise22_LeetCode189_Rotate_Array rotateArray = new exercise22_LeetCode189_Rotate_Array();
		
		int[] nums= {1,2,3,4,5,6,7};
		int k=3;
		rotateArray.rotate(nums, k);
	}

}
