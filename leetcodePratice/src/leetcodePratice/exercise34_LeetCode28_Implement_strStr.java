package leetcodePratice;

public class exercise34_LeetCode28_Implement_strStr {
	/*
	 * Implement strStr().

		Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
		
		Example 1:
				Input: haystack = "hello", needle = "ll"
				Output: 2
				
		Example 2:
				Input: haystack = "aaaaa", needle = "bba"
				Output: -1
	 */
	
	//	直接套用api結束
	public int strStr1(String haystack, String needle) {    
        return haystack.indexOf(needle);
    }
	
	public static int strStr(String haystack, String needle) {    
		if(haystack==null||needle==null) {
        	return -1;
        }
        
        if(haystack.length()<needle.length()) {
        	return -1;
        }else if(needle.length()==0) {
        	return 0;
        }
        
        int ans=0;
        
        int checkIndexLength = haystack.length()-needle.length();
        for(int i=0;i<=checkIndexLength;i++) {
        	boolean checkFlag = haystack.substring(i, i+needle.length()).equals(needle);
        	if(checkFlag) {
        		ans=i;
        		return ans;
        	}
        }
       
		return -1;
    }
	
	public static void main(String[] args) {
		int a = strStr("aaaaaa", "bba");
		System.out.println(a);
		
	}

}
