package com.treeds;
import java.util.Queue;
import java.util.LinkedList;

class MyNode{
	
	int data;
	MyNode left,right;
	
	public MyNode(int data){
		this.data=data;
		left=right=null;
	}
	
}

public class LeftViewUsingQueue {
	public void printTree(MyNode node){
		if(node==null){
			return;
		}
		Queue<MyNode> q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()){
			int n=q.size();
			for(int i=1;i<=n;i++){
				MyNode temp=q.poll();
				if(i==1){
					System.out.print(temp.data+" ");
				}
				if(temp.left!=null){
					q.add(temp.left);
				}
				if(temp.right!=null){
					q.add(temp.right);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyNode root = new MyNode(10);
        root.left = new MyNode(2);
        root.right = new MyNode(3);
        root.left.left = new MyNode(7);
        root.left.right = new MyNode(8);
        root.right.right = new MyNode(15);
        root.right.left = new MyNode(12);
        root.right.right.left = new MyNode(14);
        
        System.out.println("The left view of tree using queue data structure is: ");
        
        LeftViewUsingQueue l=new LeftViewUsingQueue();
        
        l.printTree(root);
        
        
	}

}
