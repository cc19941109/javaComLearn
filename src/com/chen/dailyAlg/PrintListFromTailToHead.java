package com.chen.dailyAlg;

import java.util.ArrayList;

public class PrintListFromTailToHead {
	ArrayList<Integer> arrayList = new ArrayList<>();

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		while (listNode.next != null) {
			arrayList.add(listNode.val);
		}
		for (int i = 0; i < arrayList.size(); i++) {

			System.out.print(arrayList.get(arrayList.size() - 1 - i) + " ");
		}

		return arrayList;
	}

	public static void main(String[] args) {
		PrintListFromTailToHead ps = new PrintListFromTailToHead();
		ListNode listNode1 = ps.new ListNode(1);
		ListNode listNode2 = ps.new ListNode(2);
		ListNode listNode3 = ps.new ListNode(3);

		listNode1.next = listNode2;
		listNode2.next = listNode3;

		ps.printListFromTailToHead3(listNode1);
	}

	public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
		if (listNode != null) {
			this.printListFromTailToHead3(listNode.next);
			arrayList.add(listNode.val);
			System.out.println(listNode.val);
		}
		return arrayList;
	}

	public ListNode circle(ListNode listNode) {
		if (listNode.next == null) {
			System.out.println(listNode.val);
			return null;
		} else {
			circle(listNode.next);
		}

		return null;
	}

	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (listNode.next != null) {
			arrayList.add(listNode.val);
		}
		return arrayList;
	}

	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

}
