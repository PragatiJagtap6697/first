package SLL;

public class Node {
private int data;
private Node Next;
public Node() {
	
}
public Node(int data) {
	this.data=data;
	Next=null;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public Node getNext() {
	return Next;
}
public void setNext(Node next) {
	Next = next;
}

}
