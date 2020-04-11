package com.suse.codingtest.leetcode;

/**
 * iven a non-empty, singly linked list with head node head, return a middle node of linked list.
 *
 * If there are two middle nodes, return the second middle node.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,4,5]
 * Output: Node 3 from this list (Serialization: [3,4,5])
 * The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
 * Note that we returned a ListNode object ans, such that:
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
 * Example 2:
 *
 * Input: [1,2,3,4,5,6]
 * Output: Node 4 from this list (Serialization: [4,5,6])
 * Since the list has two middle nodes with values 3 and 4, we return the second one.
 *
 *
 * Note:
 *
 * The number of nodes in the given list will be between 1 and 100.
 */
public class MiddleOfLinkedList {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(4);
        node1.next.next.next.next = new ListNode(5);
        node1.next.next.next.next.next = new ListNode(6);
        System.out.println(middleNode(node1).val);
    }

    public static ListNode middleNode(ListNode head) {
        int count = getCount(head);
        System.out.println("Count: "+count);
        int middle = (count/2)+1;
        System.out.println("Middle: "+middle);
        return getMiddleNode(head, middle);
    }

    private static int getCount(ListNode head) {
        int count = 0;
        while(head!= null){
            count ++;
            head = head.next;
        }
        return count;
    }

    private static ListNode getMiddleNode(ListNode head, int middle) {

        while(head!= null){
            middle --;
            if(middle == 0){
              return head;
            }
            head = head.next;

        }
        return null;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
