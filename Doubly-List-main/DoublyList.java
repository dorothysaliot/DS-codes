
public class DoublyList {

	class Node{
		Node prev;
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	//attributes
	public Node head = null;
	public Node tail = null;
	
	//method to add node
	public void add(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = tail = newNode;
			head.prev = null;
			tail.next = null;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			tail.next = null;
			
			
		}
			
	}
	
	
	
	//method to count the node in doubly list
	public int count() {
		int counter = 0;
		Node current = head;
		
		while(current != null) {
			counter++;
			current = current.next;
		}
		return counter;
	}
	
	//method to display the nodes
	public void print() {
		Node current = head;
		if(head == null) {
			System.out.println("list is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
}
