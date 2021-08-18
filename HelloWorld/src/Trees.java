import java.util.LinkedList;
import java.util.Queue;

//import com.linkedlist.LinkedList;

public class Trees {
	
	static class Node{
		
		Node left,right;
		int data;
		
		public Node(int data){
			left=right=null;
			this.data=data;
		}
		
	}
	
	static Node root=null;
	static Node temp=root;
	
	public void insert(Node temp,int data){
		
		Node newnode=new Node(data);
		if(temp==null){
			temp=newnode;
		}
		
		Queue<Node> q=new LinkedList<Node>();
		
		q.add(temp);
		
		while(!q.isEmpty()){
			temp=q.peek();
			q.remove();
			
			if(temp.left==null){
				temp.left=new Node(data);
				break;
			}
			
			else
				q.add(temp.left);
			
			if(temp.right==null){
				temp.right=new Node(data);
				break;
			}
			else
				q.add(temp.right);	
		}
		
	}
	
	public static void inorder(Node root){
		if(root==null){
			return;
		}
		else{
			inorder(root.left);
			System.out.print(root.data+"->");
			inorder(root.right);
		}
	}
	
	//Count the leaf nodes in the binary tree
	public static int countleaves(Node root){
		int count=0;
		
		if(root==null)
			return 0;
		if(root.left==null && root.right==null){
			return 1;
		}
		else
			return countleaves(root.left)+countleaves(root.right);
	}
	
	
	//MaxElement 
	public static int maxElement(Node root){
		 int max=0;
		 
		 Queue<Node> q = new LinkedList<Node>();
		 
		 q.add(temp);
		 
		 while(!q.isEmpty()){
			 temp=q.peek();
			 q.remove();
			 
			 if(temp.data>max){
				 max=temp.data;
			 }
			 
			 if(temp.left==null && temp.right==null){
				 if(temp.data>max)
					 max=temp.data;
			 }
			 else
				 q.add(temp.left);
			 
			 if(temp.le==null && temp.right==null){
				 if(temp.data>max)
					 max=temp.data;
			 }
			 else
				 q.add(temp.left);
			 
			 
			 
		 }
		 
		 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		root=new Node(10);
		root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        
        inorder(root);
        
        int ans=countleaves(root);
        System.out.println("leaves is:"+ans);
        int maxi=maxElement(root);
        System.out.println("max element is:"+maxi);
        

	}

}
