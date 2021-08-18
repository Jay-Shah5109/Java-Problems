package com.linkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	
	// Insert the element at tail in linked list
	public void insert_at_Tail(int data){
		
		Node newnode=new Node(data);
		
		if(this.head==null){
			// System.out.println("There are no elements in the linked list.. Adding at head..");
			this.head=newnode;
		}
		
		if(this.tail!=null){
			this.tail.setNextNode(newnode);
			this.tail=newnode;
		}
	}
	
	// Below method is to display the elements in the linked list
		@Override
		public String toString(){
			String result="{";
			Node current=this.head;
			
			while(current!=null){
				result+=current.toString()+",";
				current=current.getNextNode();
			}
			result+="}";
			return result;
			
		}

}
