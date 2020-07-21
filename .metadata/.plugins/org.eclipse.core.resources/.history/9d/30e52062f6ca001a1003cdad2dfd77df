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
		String[] strArray = str.split("");
		int startIndex = 0;
		int n = 0;
		HashMap<String, String> map = new HashMap<String, String>();
		HashMap<String, Integer> subAns = new HashMap<String, Integer>();
		
		while ((startIndex) < str.length()) {
			for (int i = startIndex; i < str.length(); i++) {
				if (i > 0 && map.containsKey(strArray[i])) {
					subAns.put(str.substring(startIndex, startIndex + n),
							str.substring(startIndex, startIndex + n).length());
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
				subAns.put(str.substring(startIndex, startIndex + n),
						   str.substring(startIndex, startIndex + n).length());
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
		int ans = longestSubstring("abcabcabcd");
		System.out.println(ans);

	}

}
