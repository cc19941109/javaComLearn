package com.chen.dailyAlg;

import java.util.ArrayList;

public class NewPrintListFromTailToHead {
	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		NewPrintListFromTailToHead ss = new NewPrintListFromTailToHead();
		System.out.println(listNode.val);
		if (listNode.next != null) {
			ss.printListFromTailToHead(listNode.next);
			System.out.println(Thread.currentThread().getId()+"  ——-----------");
			System.out.println(listNode.val * 10);
		}
		System.out.println(-listNode.val);
		return null;
	}

	public static void main(String[] args) {

		NewPrintListFromTailToHead ps = new NewPrintListFromTailToHead();
		ListNode listNode1 = ps.new ListNode(1);
		ListNode listNode2 = ps.new ListNode(2);
		ListNode listNode3 = ps.new ListNode(3);

		listNode1.next = listNode2;
		listNode2.next = listNode3;
		ps.printListFromTailToHead(listNode1);
	}

}
