package leetcodePratice;

public class exercise41_LeetCode203_Remove_Linked_List_Elements {

	/*
	 	Remove all elements from a linked list of integers that have value val.

		Example:
			Input:  1->2->6->3->4->5->6, val = 6
			Output: 1->2->3->4->5
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

	public ListNode removeElements(ListNode head, int val) {
		if(head == null) {
			return null;
		}
		
		//cur一開始為假節點
		ListNode node = new ListNode(0); 
		ListNode cur = node;
		node.next = head;
		
		
		while(head != null) {
			if(head.val !=val) {
				cur = head;
				head = head.next;
			}else {
				cur.next = head.next;
				head = head.next;
			}
		}
		return node.next;
	}
	
	
}
