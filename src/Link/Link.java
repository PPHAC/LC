package Link;


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}

class Solution206 {
	public ListNode reverseList(ListNode head) {
		if(head == null) {
			return null;
		}
		ListNode cur = head.next;
		head.next = null;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = head;
			head = cur;
			cur = temp;
		}
		return head;
	}
}

class Solution237 {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}


public class Link {
	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode head1 = new ListNode(1);
		ListNode head2 = new ListNode(2);
		ListNode head3 = new ListNode(3);
		ListNode head4 = new ListNode(4);
		head.next = head1;
		head1.next = head2;
		head2.next = head3;
		head3.next = head4;

		Solution206 solution206 = new Solution206();
		solution206.reverseList(head);

	}
}
