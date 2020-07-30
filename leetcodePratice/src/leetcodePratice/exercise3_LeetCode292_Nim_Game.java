package leetcodePratice;

public class exercise3_LeetCode292_Nim_Game {

	
	/*
	You are playing the following Nim Game with your friend: 
	There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. 
	The one who removes the last stone will be the winner. 
	You will take the first turn to remove the stones.
	Both of you are very clever and have optimal strategies for the game. 
	Write a function to determine whether you can win the game given the number of stones in the heap.
	For example, if there are 4 stones in the heap, then you will never win the game: 
	no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
	 */
	
	
	/**
	 * 因為可拿取石頭的數量為一到三且拿玩的人贏，故只要一開始的石頭數量為4的倍數，就會輸。
	 * 
	 */
	public static void nimGameDiscriminant(int n) {
		
		if(n%4==0) {
			System.out.println("lose!");
		}else {
			System.out.println("win!");
		}
		
		
	}
	
	
	public boolean canWinNim(int n) {
        if(n%4==0) {
			return false;
		}else {
			return true;
		}
    }
	
	
	public static void main(String[] args) {		

		nimGameDiscriminant(12);
		
		
	}

}
