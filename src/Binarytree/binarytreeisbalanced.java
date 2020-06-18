package Binarytree;

import java.util.Scanner;

public class binarytreeisbalanced {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	binarytree bt=new binarytree();
	}

}
class Node{
	int data;
	Node left;
	Node right;
}
class binarytree{
	Scanner scn=new Scanner(System.in);
//	class Node{
//		int data;
//		Node left;
//		Node right;
//	}
	 Node root;
	public binarytree() {
		root=construct(null,false);
	}
	public Node construct(Node node,Boolean ith) {
		if(node==null)
			System.out.println("Enter the data of parent node");
		else {
			if(ith) 
				System.out.println("Enter the data of left child of"+node.data);
			else
				System.out.println("Enter the data of right child of"+node.data);	
			
		}
		Node nn=new Node();
		int n=scn.nextInt();
		nn.data=n;
		System.out.println(n+"have a left child?");
		boolean il=scn.nextBoolean();
		if(il)
			nn.left=construct(nn,true);
		System.out.println(n+"have a right child?");
		 il=scn.nextBoolean();
		 if(il)
			 nn.right=construct(nn,false);
		 return nn;
			
	}
	public void Display() {
		System.out.println("---------------------------");
		display(root);
		System.out.println("---------------------------");
	}
	private void display(Node node) {
		if(node==null)
			return;
		String st="";
		if(node.left!=null)
			st+=node.left.data+"->";
		else
			st+="-->";
		st+=node.data;
		if(node.right!=null)
			st+="<-"+node.right.data;
		else
			st+="<--";
		display(node.left);
		display(node.right);
	}
	public int height() {
		return height(root);
	}
	public int height(Node node) {
		if(node==null)
			return -1;
		int lh=height(node.left);
		int rh=height(node.right);
		return Math.max(lh, rh)+1;
	}
private boolean isbalanced() {
	return isbalanced(root);
}

	public boolean isbalanced(Node node) {
		if(node==null)
			return true;
		boolean lb=isbalanced(node.left);
		boolean rb=isbalanced(node.right);
		int bf=height(node.left)-height(node.right);
		if(lb&&rb&&(bf==0||bf==1||bf==-1))
			return true;
		else
			return false;
	}
	


}
