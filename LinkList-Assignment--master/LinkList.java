/**
 * Saliot, Regine Joy Dorothy
 * BS IT 2IT
 * 
 * 
 */

import java.util.Scanner;

public class LinkList {

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
	
	
	//INSERT
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
	



	//remove duplicates method
	void remove_duplicates()
    {
        Node ptr1 = null, ptr2 = null, dup = null;
        ptr1 = head;
 
        /* Pick elements one by one */
        while (ptr1 != null && ptr1.next != null) {
            ptr2 = ptr1;
 
            /* Compare the picked element with rest
                of the elements */
            while (ptr2.next != null) {
 
                /* If duplicate then delete it */
                if (ptr1.data == ptr2.next.data) {
 
                    /* sequence of steps is important here
                     */
                    ptr2.next = ptr2.next.next;
                    System.gc();
                }
                else /* This is tricky */ {
                    ptr2 = ptr2.next;
                }
            }
            ptr1 = ptr1.next;
        }
    }




	//DELETE
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
	
	//DISPLAY
	public void print() {
		if(this.head ==null) {
			System.out.println("list is empty");
		}else {
			Node cur = this.head;
			while(cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
		
			System.out.println();
		}
		
		
		
	}
	
	
	
	//SEARCH
	public int search(int data)
    {
  
        if (head == null) {
            return -1;
        }
  
        int index = 0;
        Node temp = head;
  
        // While loop is used to search the entire Linked
        // List starting from the tail
        while (temp != null) {
  
            // Returns the index of that particular element,
            // if found.
            if (temp.data == data) {
                return index;
            }
  
            // Gradually increases index while
            // traversing through the Linked List
            index++;
            temp = temp.next;
        }
  
        // Returns -1 if the element is not found
        return -1;
    }


	//SORT
	public void sortList() {  
		Node current = null, index = null;  
		int temp;   
		//Check whether list is empty  
		if(head == null) {  
			return;  
		}  
		else {  
			//Current will point to head  
			for(current = head; current.next != null; current = current.next) {  
				//Index will point to node next to current  
				for(index = current.next; index != null; index = index.next) {  
					//If current's data is greater than index's data, swap the data of current and index  
					if(current.data > index.data) {  
						temp = current.data;  
						current.data = index.data;  
						index.data = temp;  
					}  
				}  
			}  
		}  
	}





	//main method
   public static void main(String[] args) {

	Scanner kb = new Scanner(System.in);
	Scanner input = new Scanner(System.in);
	LinkList list1 = new LinkList();
	int option;
	char choice = '0';
	

	//initial data to be added : 1  55  22  2  59  101  68  4  98  99
	list1.addNode(1);
	list1.addNode(55);
	list1.addNode(22);
	list1.addNode(2);
	list1.addNode(59);
	list1.addNode(101);
	list1.addNode(68);
	list1.addNode(4);
	list1.addNode(98);
	list1.addNode(99);
	System.out.println("Initial Data: ");
	list1.print();
	
	//do while loop for menu driven program
	do{
		System.out.println("[1] SEARCH");
		System.out.println("[2] INSERT");
		System.out.println("[3] DELETE");
		System.out.println("[4] DISPLAY");
		System.out.println("[5] SORT");
		System.out.println("[6] EXIT");
		System.out.print("Enter choice: ");
		option = kb.nextInt();
		
		
		switch (option) {

			case 1: 
			//SEARCH
			System.out.println("**Search Data**");
			System.out.print("Enter element to search :");
			int index_search = kb.nextInt();
			int a= list1.search(index_search);

			if(a != -1){
				System.out.println("Found at index: " + a);

				
			}else{
				System.out.println("Data not found");
				System.out.println();
			}
			
	
			break;
			
			

			case 2: 
			//INSERT
			System.out.println("**Insert Data**");
			System.out.print("Enter element to insert :");
			int data = kb.nextInt();
			list1.addNode(data);
			list1.remove_duplicates();
			System.out.println("Data successfully inserted");
		
		
				break;
			

			case 3: 
			//DELETE
			System.out.println("**Delete Data**");
			System.out.print("Enter element to delete :");
			int data_delete = kb.nextInt(); 

			int b= list1.search(data_delete);

			if(b != -1){
				list1.delete(data_delete);
				System.out.println("Data Successfullly Deleted");
				
				
			}else{
				System.out.println("Data not found");
				System.out.println();
			}


		
				break;
			

			case 4: 
			//DISPLAY
			System.out.println("**Display Data**");
			list1.print();
		
		
				break;
			

			case 5:
			//SORT
			System.out.println("**Sorted Data**");
			list1.sortList();
			list1.print();
		
		
			break;

			case 6:
			//EXIT
			break;

			default:
			System.out.println("**Invalid input**");
			break;
			
		
		}//end switch



	}while (option != 6);

	

   }//end of main method




}
	
	
	

