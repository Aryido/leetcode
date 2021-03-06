package leetcodePratice;


public class exercise11_LeetCode557_Reverse_Words_III {

	/*
	 	Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
		Example 1:
			Input: "Let's take LeetCode contest"
			Output: "s'teL ekat edoCteeL tsetnoc"
		Note: In the string, each word is separated by single space and there will not be any extra space in the string.
	 */
	
	/**
	 * 切割用正規化\\s+
	 */
	public static String reverseWordsFunction(String str) {
		String ans="";
		String[] arrayString = str.split("\\s+");
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arrayString.length;i++) {
			String[] contextArray = arrayString[i].split("");
			for(int j=arrayString[i].length()-1;j>=0;j--) {
				sb.append(contextArray[j]);
			}
			if(i!=arrayString.length-1){
                sb.append(" ");
            }
		}
		ans=sb.toString();
		return ans;
	}
	
	/**
	 * 切割用正規化\\s+,善用API(StringBuffer)
	 */
	public static String reverseWordsFunction2(String str) {
		String ans="";
		String[] arrayString = str.split("\\s+");
		
		for(String context:arrayString) {
			StringBuffer sbf = new StringBuffer();
			String string = sbf.append(context).reverse().append(" ").toString();
			ans+=string;
		}
		return ans;
	}
	
	
	
	
	
	public static void main(String[] args) {
		String str="I like bird!";
		//String ans = reverseWordsFunction(str);
		//System.out.println(ans);
		
		String ans1 = reverseWordsFunction(str);
		System.out.println(ans1);
			
	}

}
