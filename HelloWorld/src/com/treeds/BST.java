package com.treeds;

class Nodes{
	int data;
	Nodes left,right;
	
	public Nodes(int data){
		this.data=data;
		left=right=null;
	}
}
public class BST {
	
	Nodes head=null;
	
	public Nodes insertintoBST(Nodes root,int data){
		Nodes newnode=new Nodes(data);
		Nodes temp=head;
		if(head==null){
			head=newnode;
			return root;
		}
		if(root.data<data){
			root.left=insertintoBST(root.right, data);
		}
		else if(root.data>data){
			root.right=insertintoBST(root.left, data);
		}
		return root;
	}
	
	public void printBST(Nodes root){
		Nodes temp=head;
		if(head==null){
			return;
		}
		printBST(temp.left);
		System.out.println(temp.data+"->");
		printBST(temp.right);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST b=new BST();
		Nodes root=null;
		b.insertintoBST(root, 10);
		b.insertintoBST(root, 20);
		b.insertintoBST(root, 30);
		b.insertintoBST(root, 15);
		b.insertintoBST(root, 50);
		
		b.printBST(root);
		
	}

}
