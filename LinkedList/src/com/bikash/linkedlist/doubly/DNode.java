package com.bikash.linkedlist.doubly;

public class DNode {
	private DNode prevNode, nextNode;
	private int data;

	public DNode(int data) {
		super();
		this.data = data;
	}

	public DNode(DNode prevNode, DNode nextNode, int data) {
		super();
		this.prevNode = prevNode;
		this.nextNode = nextNode;
		this.data = data;
	}

	public DNode getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(DNode prevNode) {
		this.prevNode = prevNode;
	}

	public DNode getNextNode() {
		return nextNode;
	}

	public void setNextNode(DNode nextNode) {
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
