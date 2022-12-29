package SinglyLL;

public class SLL {
private Node head;
public SLL() {
	this.head=null;
}
public boolean insertatFront(int data) {
	Node newNode=new Node(data);
	//check weather node is exits or not
	if(newNode==null) {
		return false;
	}
	
	if(head==null) {
		head=newNode;
		return true;
		}
	Node temp=head;
	
	
	
	
}
}
