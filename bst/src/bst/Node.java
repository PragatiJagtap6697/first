package bst;

public class Node {
private int data;
private Node Left,Right;
public Node(int data) {
	this.data=data;
	Left=Right=null;
	
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Node getLeft() {
	return Left;
}
public void setLeft(Node left) {
	Left = left;
}
public Node getRight() {
	return Right;
}
public void setRight(Node right) {
	Right = right;
}

}
