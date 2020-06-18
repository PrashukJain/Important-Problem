package Binarytree;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	Scanner scn=new Scanner(System.in);
private class Node{
	int data;
	Node left;
	Node right;
}
private Node root;
public BinaryTree() {
	root=construct(null,false);
}
public Node construct(Node root,boolean ith) {
	if(root==null) {
		System.out.println("Enter the data of root node");
	}
	else {
		if(ith)
			System.out.println("Enter the left child data of"+root.data);
		else
			System.out.println("Enter the right child data of"+root.data);
	}
	Node nn=new Node();
	nn.data=scn.nextInt();
	System.out.println(nn.data+"have left child or not");
	boolean i=scn.nextBoolean();
	if(i)
		nn.left=construct(nn,i);
	System.out.println(nn.data+" have right child or not");
	boolean ir=scn.nextBoolean();
	if(ir)
		nn.right=construct(nn,!ir);
	return nn;
}
public void display() {
	System.out.println("---------------------");
	display(root);
	System.out.println("----------------------");
}
private void display(Node root) {
	if(root==null)
		return;
	String s="";
	if(root.left!=null)
		s+=root.left.data+">";
	else
		s+="*>";
	s+=root.data;
	if(root.right!=null)
		s+="<"+root.right.data;
	else
		s+="<*";
	System.out.println(s);
	display(root.left);
	display(root.right);
	
}
public int size() {
	return size(root);
}
private int size(Node node) {
	if(node==null)
		return 0;
	int ls=size(node.left);
	int rs=size(node.right);
	return ls+rs+1;
}
public int max() {
	return max(root);
}
private int max(Node node) {
	if(node==null)
		return 0;
	int lm=max(node.left);
	int rm=max(node.right);
	
	return Math.max(node.data, Math.max(lm, lm));
}
public boolean find(int item) {
	return find(item,root);
}
private boolean find(int item,Node node) {
	if(node==null)
		return false;
	if(node.data==item)
		return true;
	return find(item,node.left)||find(item,node.right);
}
public int height() {
	return height(root);
}
private int height(Node node) {
	if(node==null)
		return -1;
	int lh=height(node.left);
	int rh=height(node.right);
	return Math.max(lh, rh)+1;

}
public static void main(String[] args) {
	//10 true 20 true 40 true 80 false false false true 50 false false true 30 true 60 false false true 70 false false
	BinaryTree bt=new BinaryTree();
	bt.display();
	System.out.println(bt.size());
	System.out.println(bt.max());
	System.out.println(bt.find(90));
	System.out.println(bt.height());
}
}
