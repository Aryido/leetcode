package leetcodePratice;

public class exercise9_LeetCode55_Jump_Game1 {

	/*
	 	Given an array of non-negative integers, you are initially positioned at the first index of the array.
		Each element in the array represents your maximum jump length at that position.
		Determine if you are able to reach the last index.
		Example 1:

			Input: nums = [2,3,1,1,4]
			Output: true
			Explanation: 
			Jump 1 step from index 0 to 1, then 3 steps to the last index.
		
		Example 2:
			Input: nums = [3,2,1,0,4]
			Output: false
			Explanation: 
			You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
		 */
	
	
	public static Boolean jumpGameFunction(int[] array) {
		
		if(array==null||array.length==0) {
			return false;
		}
		
		
		//最遠可跳多遠
		int farthest=0;
		
		for(int i=0;i<array.length-1;i++) {
			
			farthest = (farthest >= array[i]+i) ? farthest : array[i]+i ;
			
			//考慮不能跳躍的時候
			if(farthest==0) {
				return false;
			}
			
			if(farthest>=array.length-1) {
				return true;
			}
			
			if(array[i]==0 && i==farthest) {
				return false;
			}
			
		}
		
		return false;
	}

	
	
	
	
	public static void main(String[] args) {
		//int[] array= {2,3,1,1,4}; 
		//int[] array= {3,2,1,0,4}; 
		int[] array= {1,0,1,0}; 
		System.out.println(jumpGameFunction(array));
		
	}

}
