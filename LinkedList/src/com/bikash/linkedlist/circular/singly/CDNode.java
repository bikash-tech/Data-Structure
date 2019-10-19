package com.bikash.linkedlist.circular.singly;

public class CDNode {
	private CDNode nextNode;
	private int data;

	public CDNode(CDNode nextNode, int data) {
		super();
		this.nextNode = nextNode;
		this.data = data;
	}

	public CDNode(int data) {
		super();
		this.data = data;
	}

	public CDNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CDNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
