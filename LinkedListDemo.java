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
    int size;
    Node<T> start;
    // Node<T> tail;

    LinkedListOperation() {
        start = null;
        size = 0;
        // tail = null;
    }

    Node<T> createNode(T data) {
        Node<T> node = new Node<>(data);
        size++;
        return node;
    }

    void deleteAtBeg() {
        if (start == null) {
            System.out.println("LL is Empty");
            return;
        }
        if (start.next == null) {
            start = null;
        } else {
            Node<T> temp = start;
            start = start.next;
            temp.next = null;
            temp = null;
        }
        size--;
        System.out.println("Delete SuccessFully...");
    }

    void deleteAtEnd() {
        if (start == null) {
            System.out.println("LL is Empty");
            return;
        }
        if (start.next == null) {
            start = null;
        } else {
            Node<T> temp = start;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            temp.next = null;
        }
        size--;
        System.out.println("Delete SuccessFully...");
    }

    void delAtMid(int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index Can't Delete");
            return;
        }
        if (index == 0) {
            deleteAtBeg();
        } else if (index == size) {
            deleteAtEnd();
        } else {
            Node<T> temp = start;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        size--;
        System.out.println("Delete SuccessFully...");

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

    void addAtMid(int index, T data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index Can't Add");
            return;
        }
        if (index == 0) {
            addAtBeg(data);
        } else if (index == size) {
            addAtEnd(data);
        } else {
            Node<T> temp = start;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<T> newNode = createNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
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
            System.out.println("4. Add at Mid");
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
                case 4:
                    System.out.println("Enter the Index");
                    int index = scanner.nextInt();
                    System.out.println("Enter the Data");
                    int data = scanner.nextInt();
                    opr.addAtMid(index, data);
                    break;
                case 0:
                    return;
            }
        }
    }
}
