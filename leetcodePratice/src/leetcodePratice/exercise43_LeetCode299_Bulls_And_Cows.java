package leetcodePratice;

import java.util.ArrayList;


public class exercise43_LeetCode299_Bulls_And_Cows {

	/*
	 	Example 1:

				Input: secret = "1807", guess = "7810"
				
				Output: "1A3B"
				
				Explanation: 
					1 bull and 3 cows. The bull is 8, the cows are 0, 1 and 7.
			
		Example 2:
		
				Input: secret = "1123", guess = "0111"
				
				Output: "1A1B"
				
				Explanation: 
					The 1st 1 in friend's guess is a bull, the 2nd or 3rd 1 is a cow.
	 */
	
	
	public static String getHint(String secret, String guess) {
        StringBuffer sb = new StringBuffer();
        ArrayList secretList = new ArrayList();
        ArrayList guessList = new ArrayList();
		
        //	先判斷位置且數字一樣的數量
        int countSamPlaceAndNum = 0;
        for(int i=0; i<secret.length(); i++) {
        	if(secret.charAt(i) == guess.charAt(i)) {
        		countSamPlaceAndNum++;
        		continue;
        	}
        	//	不一樣的部分用List存起來
        	secretList.add(secret.charAt(i));
        	guessList.add(guess.charAt(i));
        }
        
        //	再來判斷數字幾個一樣(已經去掉位置對的部分)
        int countSamNum = 0;
        for(Object gt:guessList) {
        	int findIndex = secretList.indexOf(gt);
        	if(findIndex != -1) {
        		countSamNum++;
        		secretList.remove(findIndex);
        	}
        }
        
        sb.append(countSamPlaceAndNum).append("A").append(countSamNum).append("B");
        return sb.toString();
    }
	
	
	
	public static void main(String[] args) {
		String ans = getHint("1807", "7810");
		String ans1 = getHint("1123", "0111");
		System.out.println(ans);
		System.out.println(ans1);
	}
}
