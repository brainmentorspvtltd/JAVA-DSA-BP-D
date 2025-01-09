import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTree<T> {
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;

    BinaryTree(T data) {
        this.data = data;
    }
}

class BinaryTreeOperations<T> {
    BinaryTree<T> createTree() {

        // once tree build return the root
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Root Data or q to Quit");
        String rootData = scanner.next();
        if (rootData.equalsIgnoreCase("q")) {
            return null;
        }
        // Create a New Node
        BinaryTree<T> root = new BinaryTree<>((T) rootData);
        Queue<BinaryTree<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTree<T> node = queue.poll();
            System.out.println("Enter the data of " + node.data + " for the left child or press q to quit");
            String leftChildData = scanner.next();
            if (!"q".equalsIgnoreCase(leftChildData)) {
                node.left = new BinaryTree<>((T) leftChildData);
                queue.add(node.left);
            }
            System.out.println("Enter the data of " + node.data + " for the right child or press q to quit");
            String rightChildData = scanner.next();
            if (!"q".equalsIgnoreCase(rightChildData)) {
                node.right = new BinaryTree<>((T) rightChildData);
                queue.add(node.right);
            }

        }
        return root;
    }

    void print(BinaryTree<T> root) {
        Queue<BinaryTree<T>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 1; i <= size; i++) {
                BinaryTree<T> node = queue.poll();
                System.out.print(node.data + " ");
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            System.out.println();
        }
    }
}

class TreeIterative {
    public static void main(String[] args) {
        BinaryTreeOperations<Integer> opr = new BinaryTreeOperations<>();
        BinaryTree<Integer> root = opr.createTree();
        opr.print(root);
    }
}