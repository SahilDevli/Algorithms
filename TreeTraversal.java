/*
Note: These search technique in the context of Divide and Conquer and Backtracking paradigms.
*/

class Tree {
    private int data;
    private Tree left, right;

    // Constructor to create a new binary tree node.
    public Tree(int data) {
        this.data = data;
        left = right = null;
    }

    // Insertion
    public Tree insert(int data, Tree head) {
        if (head == null) { // Create a new node if head is null
            return new Tree(data);
        }
        if (data < head.data) {
            head.left = insert(data, head.left);
        } else if (data > head.data) {
            head.right = insert(data, head.right);
        }
        return head;
    }

    // In-order traversal --> Left Node Right
    public void in_order(Tree root) {
        if (root != null) {
            in_order(root.left);
            System.out.print(root.data + " ");
            in_order(root.right);
        }
    }
    // pre-order traversal --> Node Left Right
    public void pre_order(Tree root) {
        if (root != null) {
            System.out.print(root.data + " ");
            pre_order(root.left);
            pre_order(root.right);
        }
    }
    // post-order traversal --> Left Right Node
    public void post_order(Tree root) {
        if (root != null) {
            post_order(root.left);
            post_order(root.right);
            System.out.print(root.data + " ");
        }
    }
}

// main class...
public class TreeTraversal {
    public static void main(String[] args) {
        Tree root = new Tree(5); // Root node
        root = root.insert(3, root);
        root = root.insert(7, root);
        root = root.insert(2, root);
        root = root.insert(4, root);
        root = root.insert(6, root);
        root = root.insert(9, root);

        root.in_order(root);
        // root.pre_order(root);
        // root.post_order(root);
    }
}
