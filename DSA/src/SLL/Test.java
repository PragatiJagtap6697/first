package SLL;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SLL s=new SLL();
Scanner sc=new Scanner(System.in);
boolean exit=false;
 while(!exit) {
	 System.out.println("1.Insert element 2.display 3.insert at position "
	 		+"4.delete by position "+"5.delete by value" +"dispaly reverse"+ "10.exit");
	 switch(sc.nextInt()) {
	 case 1:
		 s.insert(10);
		 s.insert(20);
		 s.insert(45);
		 s.insert(12);
		 break;
	 case 2:
		 s.display();
		 break;
	 case 3:
		 s.insertbyPosition(100,3);
		 System.out.println("element is inserted");
		 break;
	 case 4:
		 s.deletebypostion(2);
		 System.out.println("element is removed");
		 break;
	 case 5:
		 s.deleteByvalue(45);
		 System.out.println("element is deleted");
		 break;
	 case 6:
		 s.displayreverse();
		 break;
	 case 10:
		 exit=true;
		 break;
	 }
 }
	}

}
