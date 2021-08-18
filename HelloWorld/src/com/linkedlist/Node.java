package com.linkedlist;

public class Node {
	
	private int data;
	private Node nextNode;
	static Node head;
	
	// Constructor
	public Node(int data) {
		super();
		this.data = data;
		//this.nextNode = nextNode;
	}
	
	//Default constructor
	
	public Node(){
		
	}
	
	public Node(Node head){
		this.head=head;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	

	public static Node getHead() {
		return head;
	}

	public static void setHead(Node head) {
		Node.head = head;
	}

	@Override
	public String toString() {
		return "Data:"+this.data;
	}
}
