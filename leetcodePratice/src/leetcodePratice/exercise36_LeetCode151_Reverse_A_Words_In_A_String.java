package leetcodePratice;

public class exercise36_LeetCode151_Reverse_A_Words_In_A_String {

	/*
	 	Given an input string, reverse the string word by word.

		Example 1:
				Input: "the sky is blue"
				Output: "blue is sky the"
				
		Example 2:
				Input: "  hello world!  "
				Output: "world! hello"
		Explanation: 
			Your reversed string should not contain leading or trailing spaces.
		
		Example 3:
				Input: "a good   example"
				Output: "example good a"
		Explanation: 
			You need to reduce multiple spaces between two words to a single space in the reversed string.
		 
		Note:
			A word is defined as a sequence of non-space characters.
			Input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.
			You need to reduce multiple spaces between two words to a single space in the reversed string.
	 */
	
	
	public static String reverseWords(String s) {
		String ans="";
		//trim方法，是把字串前後空白去掉
		String[] array = s.trim().split("\\s+");
		
		StringBuffer sb = new StringBuffer();
		for(int i=array.length-1;i>=0;i--) {
			if(i==0) {
				sb.append(array[i]);
			}else {
				sb.append(array[i]+" ");
			}
			
		}
		
		ans=sb.toString();
		System.out.println(ans);
		return ans;
    }
	
	
	public static void main(String[] args) {
		reverseWords("  hello world!  ");

	}

}
