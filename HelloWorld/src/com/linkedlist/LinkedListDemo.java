package com.linkedlist;

import java.time.format.ResolverStyle;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList newlinkedlist=new LinkedList();
		newlinkedlist.insertAtHead(10);
		newlinkedlist.insertAtHead(9);
		newlinkedlist.insertAtHead(7);
		newlinkedlist.insertAtHead(6);
		newlinkedlist.insertAtHead(4);
		//Node head=newlinkedlist.reverse_linked_list(newlinkedlist);
		//newlinkedlist.reverse_linked_list(head);
		
		DoublyLinkedList newdoublylinkedlist=new DoublyLinkedList();
		newdoublylinkedlist.insert_at_Tail(40);
		newdoublylinkedlist.insert_at_Tail(42);
		newdoublylinkedlist.insert_at_Tail(43);
		newdoublylinkedlist.insert_at_Tail(45);
		newdoublylinkedlist.insert_at_Tail(41);
		
		LinkedList newlink=new LinkedList();
		//Node head=newlink.insert_into_list(55);
		//newlink.insert_into_list(56);
		//newlink.insert_into_list(57);
		//newlink.insert_into_list(58);
		
		Node head=new Node(55);
		head.setNextNode(new Node(56));
		head.setNextNode(new Node(57));
		
		
		
		
		
		System.out.println(newlinkedlist.toString());
		System.out.println("Length is:"+newlinkedlist.length_of_linked_list());
		//newlinkedlist.delete_head_node();
		//System.out.println("After deleting head node:"+newlinkedlist.toString());
		newlinkedlist.search_for_element(66);
		System.out.println("Printing the double ended linked list:");
		System.out.println(newdoublylinkedlist);
		newlinkedlist.enter_in_sorted_list(8);
		newlinkedlist.enter_in_sorted_list(5);
		System.out.println("After entering the new node in sorted linked list:"+newlinkedlist.toString());
		//newlinkedlist.reverse_linked_list(this.head);
		System.out.println("After reversing the linked list:"+newlinkedlist.toString());
		System.out.println("Printing the new linked list:"+newlink.toString());
		Node head1=newlink.reverse_linked_list(head);
		System.out.println(head1);
		
		
	}

}
