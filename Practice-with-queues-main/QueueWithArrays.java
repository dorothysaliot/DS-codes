
public class QueueWithArrays {

	//attributes
	int queue[];
	int N;
	int front, rear;
	
	//constructor
	QueueWithArrays(){
		N =5;
		front = -1;
		rear = -1;
	}
	
	//method to add to the queue
	void enqueue(int data) {
		if(isFull()) {
			System.out.println("the queue is full");
		}else {
			if(rear == -1) {
				rear++;
				front++;
			}else {
				rear++;
			}
			queue[rear] = data;
			System.out.println("element enqueued: " + queue[rear]);
		}
	}
	//method to check if queue is empty
	private boolean isFull() {
		return rear == N-1;
	}

	//method to delete queue
	void dequeue(int data) {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}else if(front == rear) {
			System.out.println("elements dequed: " + queue[front]);
			front = -1;
			rear = -1;
		}else {
			System.out.println("elements dequeued "+ queue[front]);
			for(int i = front; i <= rear-1;i++) {
				queue[i] = queue[i+1];
			}
			queue[rear] = 0;
			rear--;
		}
	}
	//method to check if queue is full 
	private boolean isEmpty() {
		return rear == -1;
	}
	
	//method to display the queue
	void display() {
		System.out.println("the queues are: ");
		for(int i = front; i<=rear;i++) {
			System.out.println(queue[i] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
}
