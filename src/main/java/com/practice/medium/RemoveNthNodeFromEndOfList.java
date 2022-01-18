package com.practice.medium;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {

        ListNode n = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        RemoveNthNodeFromEndOfList nthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
        ListNode listNode = nthNodeFromEndOfList.removeNthFromEnd(n, 2);


        while (listNode!=null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
    }

    public static class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0,head);
        doRecursiveRemoval(temp,n);
        return temp.next;
    }

    public int doRecursiveRemoval(ListNode node,int n){

        if(node == null)
            return 0;

        int tmp = doRecursiveRemoval(node.next,n);
        if(tmp == n){
            node.next = node.next.next;
        }
        return tmp + 1;
    }
}
