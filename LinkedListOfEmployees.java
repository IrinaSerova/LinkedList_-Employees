public class LinkedListOfEmployees {
	private Node head;
	public LinkedListOfEmployees() {
		head = null;
	}
	public void insertAtFront ( Employee e) {
		Node newNode = new Node(e);
		newNode.setNext(head);
		head = newNode;
	}
	public void insertAtBack ( Employee e) {
		Node newNode = new Node(e);
		if(head==null) {
			head = newNode;
		}
		else {
			Node curr = head;
			while (curr.getNext()!=null){
				curr = curr.getNext();
			}
			curr.setNext(newNode);
		}
	}
	public int countEmployees(String g) {
		int n = 0;
		Node current = head; 
		while (current != null) {
			if
			(current.getData().getGender().equalsIgnoreCase(g))
				n++;
			current = current.getNext();
		}
		return n;
	}
	Employee getOldestEmployee() {
		if(head==null)
			return null;
		Node current = head;
		Employee oldest=current.getData();
		current = current.getNext();
		while (current != null) {
			if (current.getData().getAge()>oldest.getAge())
				oldest=current.getData();
			current = current.getNext();
		}
		return oldest;
	}
	public LinkedListOfEmployees getEmployees(String g) {
		LinkedListOfEmployees newList=new LinkedListOfEmployees();
		Node current = head;
		while (current != null) {
			if (current.getData().getGender().equalsIgnoreCase(g))
				newList.insertAtBack(current.getData());
			current = current.getNext();
		}
		return newList;
	}
	public void split(LinkedListOfEmployees male, LinkedListOfEmployees
			female) {
		Node current = head;
		while (current != null) {
			if
			(current.getData().getGender().equalsIgnoreCase("male"))
				male.insertAtBack(current.getData());
			else
				female.insertAtFront(current.getData());
			current = current.getNext();
		}
	}
	public void display() {
		Node current = head;
		while (current != null) {
			current.getData().displayEmployeeInfo();
			current = current.getNext();
		}
	}
}