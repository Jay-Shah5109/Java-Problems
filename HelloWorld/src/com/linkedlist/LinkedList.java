package com.linkedlist;


// 1-->2-->3-->4-->5

public class LinkedList {
	
	static Node head;
	
	public void insertAtHead(int data){
		//insert 6 at head
		Node newnode=new Node(data);
		newnode.setNextNode(this.head);
		this.head=newnode;
	}
	
	// Enter the element in the linked list
	
	public void insert_into_list(int data){
		Node newnode=new Node(data);
		Node current=this.head;
		if(head==null){
			head=newnode;
		}
		else{
			while(current.getNextNode()!=null){
				current=current.getNextNode();
			}
			current.setNextNode(newnode);
			newnode.setNextNode(null);
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
	
	//Display the length of the linked list
	
	int count=0;
	
	public int length_of_linked_list(){
		Node current=this.head;
		
		while(current!=null){
			count++;
			current=current.getNextNode();
		}
		return count;
	}
	
	// Delete the head node in linked list
	
	public void delete_head_node(){
		this.head=this.head.getNextNode();
	}
	
	// Search for an item in a linked list
	
	public void search_for_element(int data){
		Node current=this.head;
		while(current!=null){
			if(current.getData()==data){
				System.out.println("Element found!");
				break;
			}
			else{
				current=current.getNextNode();
			}
		}
		System.out.println("Element not found!");
	}
	
	// Enter element in a sorted linked list
	
	public void enter_in_sorted_list(int data){
		Node newnode=new Node(data);
		Node current=this.head;
		
		if(this.head==null){
			head=newnode;
		}
		else{
			while(current.getNextNode()!=null){
				
				if(current.getNextNode().getData()>newnode.getData()){
					newnode.setNextNode(current.getNextNode());
					current.setNextNode(newnode);
					break;
				}
				else{
					current=current.getNextNode();
				}
			}		
		}
	}
	
	// Reverse a linked list
	
	public Node reverse_linked_list(Node head){
		Node previous=new Node(); previous=null;
		Node current=new Node(); current=head;
		Node next=new Node(); next=head.getNextNode();
		
		while(current!=null){
			current.setNextNode(previous);
			next.setNextNode(current);
			previous=current;
			current=next;
			next=next.getNextNode();
		}
		
		return previous;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
