package leetcodePratice;

import java.util.HashMap;

public class exercise29_LeetCode13_Roman_To_Integer {

	/*
	 	Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

			Symbol       Value
			I             1
			V             5
			X             10
			L             50
			C             100
			D             500
			M             1000
	 */
	
	/*
	 	Example 1:
				Input: "III"
				Output: 3
			
		Example 2:
				Input: "IV"
				Output: 4
		
		Example 3:
				Input: "IX"
				Output: 9
				
		Example 4:
				Input: "LVIII"
				Output: 58
				Explanation: L = 50, V= 5, III = 3.
		
		Example 5:
				Input: "MCMXCIV"
				Output: 1994
				Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
	 */
	
	public static int romanToInt(String s) {
        int ans=0;
        
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        String[] array = s.split("");
        for(int i=0;i<array.length;i++) {
        	switch(array[i]) {
        		case("I"):
        			if(i<array.length-1 && map.get(array[i])<map.get(array[i+1])) {
        				ans=ans-1;
        			}else {
        				ans=ans+1; 
        			}
        			
        			break;
        		case("V"):
        			if(i<array.length-1 && map.get(array[i])<map.get(array[i+1])) {
        				ans=ans-5;
        			}else {
        				ans=ans+5; 
        			}
        			break;
        		case("X"): 
        			if(i<array.length-1 && map.get(array[i])<map.get(array[i+1])) {
        				ans=ans-10;
        			}else {
        				ans=ans+10; 
        			}
        			
        			break;
        		case("L"): 
        			if(i<array.length-1 && map.get(array[i])<map.get(array[i+1])) {
        				ans=ans-50;
        			}
        			ans=ans+50; 
        			break;
        		case("C"):
        			if(i<array.length-1 && map.get(array[i])<map.get(array[i+1])) {
        				ans=ans-100;
        			}else {
        				ans=ans+100;
        			}
        			
        			break;
        		case("D"):
        			if(i<array.length-1 && map.get(array[i])<map.get(array[i+1])) {
        				ans=ans-500;
        			}else {
        				ans=ans+500; 
        			}
        			
        			break;
        		case("M"): 
        			ans=ans+1000; 
        			break;
        	}
        }
        
        System.out.println(ans);
        
        return ans;
    }
	
	
	public static void main(String[] args) {
		romanToInt("IX");

	}

}
