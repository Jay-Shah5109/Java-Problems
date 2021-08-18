package com.trees;

import java.util.LinkedList;
import java.util.Queue;

//import com.linkedlist.LinkedList;

public class Trees {
	
	// Defining the class Node
	static class Node{
		int key;
		Node left,right;
		Node(int key){
			this.key=key;
			this.left=this.right=null;
		}
	}
	
	static Node root;
	static Node temp=root;
	
	static void inorder(Node temp){
		if(temp==null)
			return;
		inorder(temp.left);
		System.out.print(temp.key+" ");
		inorder(temp.right);
	}
	
	// Normal insertion in Binary Tree
	static void insert(Node temp,int key){
		
		if(temp==null){
			root=new Node(key);
			return;
		}
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(temp);
		
		while(!q.isEmpty()){
			temp=q.peek();
			q.remove();
			
			if(temp.left==null){
				temp.left=new Node(key);
				break;
			}
			else{
				q.add(temp.left);
			}
			
			if(temp.right==null){
				temp.right=new Node(key);
				break;
			}
			else{
				q.add(temp.right);
			}
		}
	}
	
	// Function to delete the deepest node
	
	public void deleteDeepest(Node root, Node DeleteNode){
		
		Queue<Node> q= new LinkedList<Node>();
		q.add(root);
		
		
		while(!q.isEmpty()){
			
			temp=q.peek();
			q.remove();
			
			if(temp==DeleteNode){
				temp=null;
				return;
			}
			
			if(temp.right!=null){
				if(temp.right==DeleteNode){
					temp.right=null;
					return;
				}
				else{
					q.add(temp.right);
				}
			}
			
			if(temp.left!=null){
				if(temp.left==DeleteNode){
					temp.left=null;
					return;
				}
				else{
					q.add(temp.left);
				}
			}
			
			}
		}
	
	// Deletion from a tree, and replace it with the rightmost node
	
	public void delete_from_BT(Node root,int key){
		
		if(root==null) // Check if the root is null, means nothing to delete in the tree
			return;
		
		if(root.left==null && root.right==null){ // Checks if only the root node is present, and if required key equals 
												// the root node, then delete the node
			if(root.key==key){
				root=null;
				return;
			}
			else 
				return;
		}
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		Node temp=null,keyNode=null;
		
		// Traverse the tree until we find the rightmost node
		
		while(!q.isEmpty()){
			temp=q.peek();
			q.remove();
			
			if(temp.key==key)
				keyNode=temp;
			
			if(temp.left==null)
				q.add(temp.left);
			
			if(temp.right==null)
				q.add(temp.right);
		}	
			if(keyNode!=null){
				int x=temp.key;
				deleteDeepest(root,temp);
				keyNode.key=x;	
		}
	}
	
	// Function to search an element in a BT
	
	/*public String search_in_BT(Node root, int find_key){
		
		if(root.key==find_key)
			return "Key found!";
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		//temp=root;
		
		while(!q.isEmpty()){
			
			temp=q.peek();
			//System.out.println(temp.key);
			q.remove();
			
			if(temp.left==null && temp.right==null){
				if(temp.key==find_key)
					return "Key found!";
				//else
					//return "Key not found!";
			}
			
			if(temp.key==find_key)
				return "Key found!";
			else
				q.add(temp.left);
		
			if(temp.key==find_key)
				return "Key found!";
			else
				q.add(temp.right);
			}
		
		return "Key not found!";
} */
	
	// To find maximum element in a BT
	
	/*public int max_element(Node root){
		
		if(root.left==null && root.right==null)
			return root.key;
		
		int max=0;
		
		// Initialized the max element to the key of root
		if(root.key>max)
			max=root.key;
		
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()){
			
			temp=q.peek();
			q.remove();
			
			if(temp.left==null && temp.right==null){
				if(temp.key>max){
					max=temp.key;
					return max;
				}
			}
			
			if(temp.left.key>max)
				max=temp.key;
			else
				q.add(temp.left);
			
			if(temp.right.key>max)
				max=temp.key;
			else
				q.add(temp.right);
		}
		
		return max;
	}*/
	
	// Function to find the max element in BT
	
	public int findmax(Node node){
		
		if(node==null)
			return Integer.MIN_VALUE;
		
		int res=node.key;
		int lres=findmax(node.left);
		int rres=findmax(node.right);
		
		if(lres>res)
			res=lres;
		if(rres>res)
			res=rres;
		
		return res;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Trees t= new Trees();
		
		root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        root.right.right.left = new Node(800);
        
        System.out.println("Inorder traversal b4 insertion:");
        inorder(root);
        
        int key=25;
        insert(root,key);
        
        System.out.println("Inorder traversal after insertion into the tree:");
        inorder(root);
        
        int delete_key=11;
        t.delete_from_BT(root, delete_key);
        
        System.out.println("After deletion, preorder sequence is:");
        inorder(root);
        
        System.out.println("New order:");
        //System.out.println(t.search_in_BT(root, 9));
        //System.out.println(t.search_in_BT(root, 100));
        //System.out.println(t.search_in_BT(root, 800));
        
        System.out.println("Max element is:"+t.findmax(root));
        
	}
}
