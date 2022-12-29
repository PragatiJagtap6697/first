package SLL_Product;

import java.util.Stack;

import SLL.Node;

public class SLL <Product>{
	private Node head;
	public SLL() {
		head=null;
	}
	public boolean insert(int data) {
		Node newnode=new Node(data);
		if(newnode==null) {
			return false;
		}
		if(head==null) {
			head=newnode;
			return true;
		}
		Node last=head;
		while(last.getNext()!=null) {
			last=last.getNext();	
		}
		last.setNext(newnode);
		return true;
	}
	public void display() {
		
		if(head==null) {
			System.out.println("SLL isEmpty");
		}
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.getData() + " ");
			temp=temp.getNext();
		}	
	}
	public boolean insertbyPosition(int data,int position) {
		if(position <=0 ||(head==null && position>0)) {
			return false;
		}
		Node newNode=new Node(data);
		if(head==null) {
			return false;
		}
		if(position ==1) {
			newNode.setNext(head);
			head=newNode;
			return true;
		}
		Node prev=head;
		for(int i=1; i<position-1;i++) {
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		newNode.setNext(prev.getNext());
		prev.setNext(newNode);
		return true;
	}
	public boolean deletebypostion(int position) {
		if(position <=0 || head==null) {
			return false;
		}
		if(position==1) {
			head=head.getNext();
			return true;
		}
		Node prev=head;
		for(int i=1;i<position-1;i++) {
			prev=prev.getNext();
			if(prev==null) {
				return false;
			}
		}
		Node del=prev.getNext();
		prev.setNext(del.getNext());
		return true;
	}
	public boolean deleteByvalue(int data) {
		if(head==null) {
			return false;
		}
		if(head.getData()==data) {
			head=head.getNext();
			return true;
		}
		Node prev=head, del=head;
		while(del.getData()!=data) {
			prev=del;
			del=del.getNext();
			if(del==null) {
				return false;
			}
		}
		prev.setNext(del.getNext());
		return true;
	}
	public void displayreverse() {
		Stack<Node>s=new Stack<>();
		Node temp=head;
		while(temp!=null) {
			s.push(temp);
			temp=temp.getNext();
		}
		while(!s.isEmpty()) {
			System.out.println(s.pop().getData());
		}
		System.out.println();
	}

}
