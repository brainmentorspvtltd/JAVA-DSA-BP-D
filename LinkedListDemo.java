import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // this.next = null;
    }
}

class LinkedListOperation<T> {
    Node<T> start;
    // Node<T> tail;

    LinkedListOperation() {
        start = null;
        // tail = null;
    }

    Node<T> createNode(T data) {
        Node<T> node = new Node<>(data);
        return node;
    }

    void addAtBeg(T data) {
        Node<T> newNode = createNode(data);
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start = newNode;
        }
    }

    void addAtEnd(T data) {
        Node<T> newNode = createNode(data);
        if (start == null) {
            start = newNode;
            // tail = start;
            return;
        }
        // tail.next = newNode;
        // tail = newNode;
        Node<T> temp = start;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void print() {
        Node<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

// class Student {
// int rollno;
// String name;
// int marks[] = new int[3];
// }

public class LinkedListDemo {
    public static void main(String[] args) {
        // Node<Student> node = new Node<>();
        // Node<String> node = new Node<>();
        Scanner scanner = new Scanner(System.in);
        LinkedListOperation<Integer> opr = new LinkedListOperation<>();
        while (true) {
            System.out.println("1. Add at End");
            System.out.println("2. Print");
            System.out.println("3. Add at beg");
            System.out.println("0. Exit");
            System.out.println("Enter the Choice...");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Data");
                    opr.addAtEnd(scanner.nextInt());
                    break;
                case 2:
                    opr.print();
                    break;
                case 3:
                    System.out.println("Enter the Data");
                    opr.addAtBeg(scanner.nextInt());
                    break;
                case 0:
                    return;
            }
        }
    }
}
