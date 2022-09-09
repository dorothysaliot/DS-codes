
public class QueueLinkedList {
	
	//attributes
	QueueNode front;
	QueueNode rear;
	
	//constructor
	QueueLinkedList(){
		this.front = null;
		this.rear = null;
	}
	
	public class QueueNode {
		int data;
		QueueNode next;
		
		
		//construcotr of the que que node class
		QueueNode(int data){
			this.data = data;
			next = null;
		}
	}

	//method to enqueue
	void enqueue(int data) {
		QueueNode newNode = new QueueNode(data);
		if(rear == null) {
			rear = newNode;
			front = rear;
		}else {
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("enqued is " + rear.data);
	}
	
	//method to dequeue 
	void dequeue() {
		if(rear == null) {
			System.out.println("queue is empty");
		}else {
			System.out.println("dequed is " + front.data);
			front = front.next;
		}
	}
	
	//method to display
	void display() {
		QueueNode temp = front;
		System.out.println("queue elements are: ");
		while(temp!= null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
