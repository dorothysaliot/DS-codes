
public class CountNodes {

	//class node
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	//attributes for node
	public Node head = null;
	public Node tail = null;
	
	//methods
	
	//add node to the list
	public void addNode(int data) {
		Node newNode = new Node(data); //make new node
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.next = newNode;
			tail= newNode;
		}
		
	}
	
	//method to count the nodes inside the list
	public int countNodes() {
		Node current = head;
		int count = 0;
		
		while( current != null) {
			count++;
			current= current.next;
		}
		
		return count;
		
	}
	
	//method to display the nodes in the list
	public void display() {
		Node current = head;
		if(current == null) {
			System.out.println("List is empty");
		}
		
		System.out.println("Nodes of singly linked list : ");
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
}
