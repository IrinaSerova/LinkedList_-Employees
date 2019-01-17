public class Node {
	private Employee data;
	private Node next;
	public Node(Employee data) {
		this.data = data;
		this.next = null;
	}
	public Employee getData() {
		return data;
	}
	public void setData(Employee data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}