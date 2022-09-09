
public class SinglyListTester {

	public static void main(String[] args) {
		SinglyList list1 = new SinglyList();
		
		list1.addToBeginning(20);
		list1.addToSpecificPosition(2, 22);
		list1.addToEnd(21);
		list1.delete(22);
		list1.print();
		SinglyList list2 = new SinglyList();
		for(int i = 1; i<= 10;i++) {
			list2.addToEnd(i);
		}
		
		list2.print();
		list2.delete(1);
		list2.delete(5);
		list2.delete(10);
		list2.print();

	}

}
