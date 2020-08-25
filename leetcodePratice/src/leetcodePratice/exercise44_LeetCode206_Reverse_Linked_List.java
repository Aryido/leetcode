package leetcodePratice;



public class exercise44_LeetCode206_Reverse_Linked_List {

	/*
	 	Reverse a singly linked list.

		Example:
			Input: 1->2->3->4->5->NULL
			Output: 5->4->3->2->1->NULL
			
		Follow up:
				A linked list can be reversed either iteratively or recursively. Could you implement both?
	 */
	
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
	 * 	參考: https://www.youtube.com/watch?v=QuWBvSx9DeI
	 */
	public ListNode reverseList(ListNode head) {
		if(head==null) {
			return null;
		}
		
		ListNode cur = head;
		ListNode pre = null;
		
		while(cur!=null) {
			ListNode next = cur.next;
			cur.next=pre;
			pre=cur;//指針歸位
			cur=next;
			
		}
		
		return pre;
	}
}
