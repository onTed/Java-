package leetCode;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *  π”√µ›πÈ
 */
public class S21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	if(l1 == null)
    		return l2;
    	if(l2==null)
    		return l1;
    	ListNode mergeHead = null;
    	if(l1.val<l2.val) {
    		mergeHead=l1;
    		mergeHead.next=mergeTwoLists(l1.next,l2);
    	}else{
    		mergeHead=l2;
    		mergeHead.next=mergeTwoLists(l1,l2.next);
    	}
    	return mergeHead;
        
    }
}
