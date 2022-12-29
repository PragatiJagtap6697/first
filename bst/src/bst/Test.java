package bst;

public class Test {
	public static void main(String[] args) {
BST bst=new BST();
bst.insert(45);
bst.insert(30);
bst.insert(54);
bst.insert(74);
bst.insert(20);
bst.insert(35);
bst.insert(84);
bst.insert(80);
bst.insert(10);
System.out.println(bst.insert(84));
bst.preorder(bst.getRoot());
System.out.println();
bst.preorder();
System.out.println();
}
}