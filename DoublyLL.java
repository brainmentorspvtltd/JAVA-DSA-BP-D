import java.util.Scanner;

class DNode<T> {
    T data;
    DNode<T> prev;
    DNode<T> next;

    DNode(T data) {
        this.data = data;
    }
}

class DoublyLinkedListOpr<T> {
    DNode<T> start;
    int size;

    DNode<T> createNode(T data) {
        DNode<T> node = new DNode<>(data);
        size++;
        return node;
    }

    void addAtEnd(T data) {
        DNode<T> newNode = createNode(data);
        if (start == null) {
            start = newNode;
        } else {
            DNode<T> temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    void addAtBeg(T data) {
        DNode<T> newNode = createNode(data);
        if (start == null) {
            start = newNode;
        } else {
            newNode.next = start;
            start.prev = newNode;
            start = newNode;
        }
    }

    void addAtMid(int index, T data) {
        if (index < 0 || index > size) {
            System.out.println("Invalid INdex Can't Add ");
            return;
        }
        if (index == 0) {
            addAtBeg(data);
        } else if (index == size) {
            addAtEnd(data);
        } else {
            DNode<T> newNode = createNode(data);
            DNode<T> temp = start;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = temp.next.next;
            newNode.prev = temp;

        }
    }

    void print() {
        DNode<T> temp = start;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedListOpr<Integer> opr = new DoublyLinkedListOpr<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add At End");
            System.out.println("2. Print");
            System.out.println("0 . Exit");
            System.out.println("Enter the Choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Data");
                    opr.addAtEnd(scanner.nextInt());
                    break;
                case 2:
                    opr.print();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
}
