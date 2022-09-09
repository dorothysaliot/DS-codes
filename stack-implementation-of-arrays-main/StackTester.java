public class StackTester {
    public static void main(String[] args) {

        Stack s = new Stack();
        int data;
        s.push(23);
        s.push(22);
        s.push(556);
        s.push(34);
        data = s.pop();
        s.push(10);
        s.push(20);
        s.push(122);
        data = s.pop();
        s.display();

    }
}