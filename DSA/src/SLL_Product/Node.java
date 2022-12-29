package SLL_Product;

public class Node <Product> {
	private Product Product;
	private Node Next;
	public Node() {
		
	}
	public Node(Product product, Node next) {
		super();
		Product = product;
		Next = null;
	}
	public Product getProduct() {
		return Product;
	}
	public void setProduct(Product product) {
		Product = product;
	}
	public Node getNext() {
		return Next;
	}
	public void setNext(Node next) {
		Next = next;
	}
	
	
}
