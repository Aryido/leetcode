package leetcodePratice;

public class exercise10_LeetCode45_Jump_Game2 {

	/*
	 	Given an array of non-negative integers, you are initially positioned at the first index of the array.
		Each element in the array represents your maximum jump length at that position.
		Your goal is to reach the last index in the minimum number of jumps.
		
		Example:
			Input: [2,3,1,1,4]
			Output: 2
			Explanation: The minimum number of jumps to reach the last index is 2.
			Jump 1 step from index 0 to 1, then 3 steps to the last index.
			
		Note:
			You can assume that you can always reach the last index.
	 */
	
	
	public static int jumpGameFunction(int[] array) {
		
		if(array==null||array.length==0) {
			return -1;
		}
		
		int farthest=0;//最遠可以跳多遠
		int count=0;//跳躍次數
		int floor=0;//目前所在層
		
		for(int i=0;i<array.length-1;i++) {
			farthest=Math.max(array[i]+i, farthest);
			
			
			if(floor==i) {
				count++;
				floor=farthest;
			}
				
		}
		
		if(farthest<array.length-1) {
			return -1;
		}
		
		
		return count;
	}
	
	
	
	public static void main(String[] args) {
		int[] array= {2,3,1,1,4}; 
		//int[] array= {3,2,1,0,4}; 
		
		System.out.println(jumpGameFunction(array));

	}

}
