import java.util.Scanner;

class Stack {
    int top;
    int maxsize = 5;
    int data;
    int[] arr = new int[maxsize];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack() {
        top = -1;
    }

    boolean push(int data) {
        if (top == maxsize - 1) {
            System.out.println("Overflow !!");
            return false;
        } else {

            top++;
            arr[top] = data;

            return true;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow !!");
            return data;
        } else {
            top--;

            return data;
        }
    }

    void display() {
        System.out.println("Printing stack elements .....");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
