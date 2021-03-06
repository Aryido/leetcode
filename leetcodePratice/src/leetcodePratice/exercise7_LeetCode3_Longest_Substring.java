package leetcodePratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class exercise7_LeetCode3_Longest_Substring {

	/*
	 * Given a string, find the length of the longest substring without repeating
	 * characters.
	 */

	public static int longestSubstring(String str) {
		//空字串或者長度為零返回0
		if(str==null||str.length()==0) {
			return 0;
		}
		
		String[] strArray = str.split("");//切字串
		int startIndex = 0;//開始index
		int n = 0;//長度
		HashMap<String, String> map = new HashMap<String, String>();//儲存重複字的容器
		HashMap<String, Integer> subAns = new HashMap<String, Integer>();//儲存子字串容器
		
		while ((startIndex) < str.length()) {
			
			for (int i = startIndex; i < str.length(); i++) {
				if (i > 0 && map.containsKey(strArray[i])) {
					subAns.put(str.substring(startIndex, startIndex + n), str.substring(startIndex, startIndex + n).length());
					startIndex = i;
					break;
				} else {
					map.put(strArray[i], strArray[i]);
					n++;

				}
				
				if (startIndex + n > str.length()) {
					startIndex++;
					break;
				}
				
			}
			
			if (startIndex + n >= str.length()) {
				subAns.put(str.substring(startIndex),str.substring(startIndex).length());
				n=0;
				map.clear();
				break;
			}
			
			n = 0;
			map.clear();

		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Entry<String, Integer> s : subAns.entrySet()) {
			list.add(s.getValue());
		}
		Integer lengthOfLongestSub = (Integer) Collections.max(list);

		return lengthOfLongestSub;
	}

	public static void main(String[] args) {
		int ans = longestSubstring("aabbasaaaasds");
		System.out.println(ans);

	}

}
