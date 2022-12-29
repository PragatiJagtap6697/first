package bst;

import java.util.Stack;

public class BST {
private Node root;
public BST() {
	root=null;
}

public Node getRoot() {
	return root;
}

public void setRoot(Node root) {
	this.root = root;
}

public boolean insert(int data) {
	Node newNode=new Node(data);
	if(newNode==null) {
		return false;
	}
	if(root==null) {
		root=newNode;
		return true;
	}
	Node temp=root;
	while(true) {
	if(data==temp.getData()) {
		return false;
	}
	if(data < temp.getData()) {
	if(temp.getLeft()==null)
	{
		temp.setLeft(newNode);
		return true;
	}
	temp=temp.getLeft();
}
	else {
		if(temp.getRight()==null){
	
		temp.setRight(newNode);
		return true;
	}
      temp=temp.getRight();

		}
}
}
public void preorder(Node root) {
	if(root==null) {
		return;
	}
	System.out.println(root.getData() +" ");
	preorder(root.getLeft());
	preorder(root.getRight());
}
public void preorder() {
	Stack<Node>s=new Stack<>();
	Node temp=root;
	while(temp!=null || s.isEmpty()) {
		while(temp!=null) {
			System.out.println(temp.getData() +" ");
			s.push(temp);
			temp=temp.getLeft();
			
		}
		temp=s.pop().getRight();
	}
	System.out.println();
}










}

