
public class SinglyList {

	class Node{
		public int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//attributes
	public Node head = null;
	public Node tail = null;
	
	//method to add node to the beginning
	public void addToBeginning(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		}else {
			newNode.next = this.head;
			this.head = newNode;
		}
	}
	
	//method to add node to the end
	public void addToEnd(int data) {
		Node newNode = new Node(data);
		if(this.head ==null) {
			this.head = newNode;
		}else {
			Node cur = this.head;
			while(cur.next != null) {
				cur = cur.next;
			}
			cur.next = newNode;
		} 
	}
	
	//add node to the specified position
	public void addToSpecificPosition(int position,int data) {
		Node newNode = new Node(data);
		Node cur = this.head, prev = this.head;
		
		if(position ==1) {
			newNode.next = this.head;
			this.head = newNode;
			return;
		}
		while(cur.next != null && --position >0) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = newNode;
		cur.next = newNode;
		
		
	}
	
	//method to delete node
	@SuppressWarnings("unused")
	public void delete(int data) {
		
		if(this.head ==null) {
			System.out.println("LIst is empty");
			return;
		}
		
		Node cur = this.head,
			prev = this.head;
		
		if(this.head.data == data) {
			this.head = this.head.next;
			return;
		}
		
		while(cur.next !=null && cur.data != data) {
			prev = cur;
			cur = cur.next;
		}
		if(cur !=null) {
			prev.next = cur.next;
		}else {
			System.out.println("cannot be found");
			
		}
		
		
		
	}
	
	//method to display the nodes 
	public void print() {
		if(this.head ==null) {
			System.out.println("list is empty");
		}else {
			Node cur = this.head;
			while(cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.print(" null");
			System.out.println();
		}
		
		
		
	}
	
	
	
	
	
}
