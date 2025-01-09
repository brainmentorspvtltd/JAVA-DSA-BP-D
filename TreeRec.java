import java.util.Scanner;
import java.util.Stack;

class BinaryTreeOprRec<T> {
    BinaryTree<T> createTree(String nodeName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the " + nodeName + " Press q for quit");
        String data = scanner.next();
        if ("q".equalsIgnoreCase(data)) {
            return null;
        }
        BinaryTree<T> newNode = new BinaryTree<>((T) data);
        newNode.left = createTree("leftchild"); // null or NewNode
        newNode.right = createTree("rightchild");
        return newNode;

    }

    // // PreOrder = PLR
    // // PostOrder = LRP
    // // InOrder = LPR
    // void print(BinaryTree<T> root) {
    // if (root == null) {
    // return;
    // }
    // print(root.left); // left
    // System.out.println(root.data); // Parent
    // print(root.right); // right

    // }

    void print(BinaryTree<T> root) {
        if (root == null) {
            System.out.println("Nothing to print...");
            return;
        }
        Stack<BinaryTree<T>> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTree<T> node = stack.pop();
            System.out.println(node.data);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}

public class TreeRec {
    public static void main(String[] args) {
        BinaryTreeOprRec<Integer> opr = new BinaryTreeOprRec<>();
        BinaryTree<Integer> root = opr.createTree("root");
        opr.print(root);

    }
}
