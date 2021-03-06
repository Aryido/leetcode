package leetcodePratice;

public class exercise33_LeetCode21_Merge_Two_Sorted_List {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	/*
	 * Merge two sorted linked lists and return it as a new sorted list. The new
	 * list should be made by splicing together the nodes of the first two lists.
	 * 
	 * Example: Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
	 */

	// LEETCODE ListNode初次練習
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		//	若有一個ListNode為空，則解答直接為非空的ListNode
		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}
		
		
		//	先令出一個新的ListNode
		ListNode res = null;
		
		if (l1.val <= l2.val) {
			//	res指向小的ListNode
			res = l1;
			//	下一個節點指向哪裡? 用遞迴解
			l1.next = mergeTwoLists(l1.next, l2);
		} else {
			//	res指向小的ListNode
			res = l2;
			//	下一個節點指向哪裡? 用遞迴解
			l2.next = mergeTwoLists(l1, l2.next);
		}
		
		return res;
	}

}
