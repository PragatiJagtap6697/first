package Queue;

public class Queue {
private int arr[];
private int rear=-1,front=-1;
public Queue() {
	arr=new int[5];
	rear=front=-1;
	
}
public Queue(int size) {
	arr=new int[size];
	rear=front=-1;
	
}
public boolean isEmpty() {
	if((front ==-1) ||(front>rear)) {
		return true;
	}else {
		return false;
	}
}
public boolean isFull() {
	if(rear==(arr.length-1))
{
		return true;
		}
	else {
		return false;
	}
}
public void enqueue(int data) {
	if(isFull()==false) {
		rear=rear+1;
		arr[rear]=data;
		if(front==-1) {
			front=0;
		}
		System.out.println("enque  "+data +"  front  " +front +"  rear  "+rear);
	}else {
		System.out.println("queue is full");
	}
}
public int dequeue() {
	if(isEmpty()==false) {
		int temp=arr[front];
		front++;
		System.out.println("Dequeue"+temp+" front "+front+" rear"+ rear);
		return temp;
	}
	else {
		// q is empty
		System.out.println("q is empty");
		return -999;
		// OR throw an exception
	}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue q=new Queue();
q.enqueue(5);
q.enqueue(10);
q.enqueue(50);
q.enqueue(15);
while(!q.isEmpty()) {
	System.out.println(q.dequeue()+" ");
}

	}

}
