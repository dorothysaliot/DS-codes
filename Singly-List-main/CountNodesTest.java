
public class CountNodesTest {

	public static void main(String[] args) {
	
		CountNodes sList = new CountNodes();
		
		sList.addNode(23);
		sList.addNode(1);
		sList.addNode(67);
		sList.addNode(33);
		sList.addNode(55);
		
		sList.display();
		
		System.out.println("the number of nodes in the lsit are : " + sList.countNodes());

	}

}
