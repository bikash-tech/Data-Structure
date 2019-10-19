package com.bikash.linkedlist.circular.doubly;

public class CDNode {
	private CDNode nextNode, prevNode;
	private int data;

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

	public CDNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(CDNode prevNode) {
		this.prevNode = prevNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
