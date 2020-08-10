package leetcodePratice;

import java.util.ArrayList;
import java.util.Collections;

public class exercise30_LeetCode35_Search_Insert_Position {

	public static int searchInsert(int[] nums, int target) {
        int ans=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n:nums) {
        	list.add(n);
        }
        list.add(target);
        
        Collections.sort(list);
        
        ans=list.indexOf(target);
        
        System.out.println(ans); 
		return ans;
    }
	
	
	public static void main(String[] args) {
		int[] nums={1,3,5,6};
		searchInsert(nums,2);
	}

}
