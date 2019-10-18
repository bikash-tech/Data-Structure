package com.bikash.linkedlist.circular.singly;

public class CSNode {
	private CSNode nextNode;
	private int data;

	public CSNode(CSNode nextNode, int data) {
		super();
		this.nextNode = nextNode;
		this.data = data;
	}

	public CSNode(int data) {
		super();
		this.data = data;
	}

	public CSNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CSNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
