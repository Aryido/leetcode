package leetcodePratice;

import java.util.HashMap;
import java.util.Stack;

public class exercise32_LeetCode20_Valid_Parentheses {

	/*
	 	Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

		An input string is valid if:
		
		Open brackets must be closed by the same type of brackets.
		Open brackets must be closed in the correct order.
			Note that an empty string is also considered valid.
		
		Example 1:
				Input: "()"
				Output: true
				
		Example 2:
				Input: "()[]{}"
				Output: true
				
		Example 3:
				Input: "(]"
				Output: false
				
		Example 4:
				Input: "([)]"
				Output: false
				
		Example 5:
				Input: "{[]}"
				Output: true
	 */
	
	
	//錯誤解法   若""(([]){})""會得到false，但這是錯的
	public static boolean isValid1(String s) {

		if(s.length()%2!=0||s==null) {
			return false;
		}
        
        if(s.length()==0){
            return true;
        }
		
        String[] arrayStr = s.split("");
        HashMap<String, Integer> FirstCheckMap = new HashMap<String,Integer>();
        for(String c:arrayStr) {
        	if(FirstCheckMap.containsKey(c)) {
        		FirstCheckMap.put(c, FirstCheckMap.get(c)+1);
        	}else {
        		FirstCheckMap.put(c,1);
        	}
        }  
        if(FirstCheckMap.get("(")!=FirstCheckMap.get(")")||
           FirstCheckMap.get("[")!=FirstCheckMap.get("]")||
           FirstCheckMap.get("{")!=FirstCheckMap.get("}")  ){
        	return false;
        }
        
        
        
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		map.put('(',')');
		map.put('[',']');
		map.put('{','}');
		
		while(map.containsKey(s.charAt(0))) {
			L2:
				for(int i=0;i<s.length();i++) {
					if(map.containsKey(s.charAt(i))) {
						int index=0;
						for(int j=i+1;j<s.length();j++) {
							if(s.charAt(j)==map.get(s.charAt(i))) {
								s=s.substring(j+1, s.length());
								if(s.length()%2!=0) {
									return false;
								}
								if(s==null||s.length()==0) {
									return true;
								}
								break L2;
							}	
							if(s.charAt(j)!=map.get(s.charAt(i)) && j==s.length()-1) {
								return false;
							}
						}
					}	
					if(!map.containsKey(s.charAt(i)) && i==s.length()-1) {
						return false;
					}	
				}
		}
		return false;
    }
	
	//第一次使用stack
	public static boolean isValid(String s) {
		if(s.length()%2!=0) {
			return false;
		}
		//Note that an empty string is also considered valid.
		if(s.length()==0) {
			return true;
		}
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			
			
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') {
				stack.push(s.charAt(i));
			}else {
				if (stack.isEmpty()) {
		                return false;
		        }
				
				if (s.charAt(i) == ')' && stack.peek() != '(') {
	                return false;
	            }
	            if (s.charAt(i) == ']' && stack.peek() != '[') {
	                return false;
	            }
	            if (s.charAt(i) == '}' && stack.peek() != '{') {
	                return false;
	            }
				 stack.pop();
			}
			
		}
		
		if(stack.isEmpty()) {
			return true;
		}
		
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
//		String Str = new String("www.runoob.com");
// 
//        System.out.print("返回值 :" );
//        System.out.println(Str.substring(4,4));
		
		boolean ans = isValid("){");
		System.out.println(ans);
		

	}

}
