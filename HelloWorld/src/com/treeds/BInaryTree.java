package com.treeds;

class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class BInaryTree {
	
	boolean checkprinted;
	static int maxlevel=0;
	
	Node root;
	
	public BInaryTree(){
		root=null;
	}
	
	void printLevelOrder(){
		
		int h=height(root); // calls the height function
		
		for(int i=1;i<=h;i++){
			checkprinted=false;
			printCurrentLevel(root,i); // calls the printcurrentLevel function
		}
	}
	
	int height(Node root){
		
		if(root==null)
			return 0;
		else{
			
			int lheight=height(root.left);
			int rheight=height(root.right);
			
			return lheight>rheight?lheight+1:rheight+1;
		}
		
	}
	
	void printCurrentLevel(Node root, int level){
		
		//System.out.println("Level: "+level+" "+mcheckprinted);
		
		if(root==null){
			return;
		}
		
		if(level==1){
				System.out.print(root.data+" ");
				//maxlevel=level;
		}
		else if(level>1){
			
			printCurrentLevel(root.left, level-1);
			printCurrentLevel(root.right, level-1);
			
		}
	}
	
	void LeftView(Node node, int level){
		
		if(node==null){
			return;
		}
		
		if(maxlevel<level){
			System.out.println(node.data+" ");
			maxlevel=level;
		}
		
		LeftView(node.left, level+1);
		LeftView(node.right, level+1);
	}
	
	void printLeftView(){
		
		LeftView(root, 1);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BInaryTree tree=new BInaryTree();
		tree.root=new Node(1);
		tree.root.left= new Node(2);
	    tree.root.right= new Node(3);
	    tree.root.left.left= new Node(4);
	    tree.root.left.right= new Node(5);
	    
	    System.out.println("The level order traversal is: ");
	    tree.printLevelOrder();
	    
	    System.out.println("The left view of tree is: ");
	    tree.printLeftView();
	   
	}

}
