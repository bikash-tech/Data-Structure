package com.bikash.linkedlist.circular.singly;

public class CSNode {
	private CSNode nextNode, prevNode;
	private int data;

	public CSNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(CSNode nextNode) {
		this.nextNode = nextNode;
	}

	public CSNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(CSNode prevNode) {
		this.prevNode = prevNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
