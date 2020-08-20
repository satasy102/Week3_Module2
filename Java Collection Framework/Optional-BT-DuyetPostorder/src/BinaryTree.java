public class BinaryTree {

    private final int root;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int root) {
        this.root = root;
        this.left = null;
        this.right = null;
    }

    public void addNode(int num) {
        if (num < root) {
            if (left != null) left.addNode(num);
            else left = new BinaryTree(num);
        }
        else {
            if (right != null) right.addNode(num);
            else right = new BinaryTree(num);
        }
    }


    public void displayBSTByPostOrder() {
        if (left != null) left.displayBSTByPostOrder();

        if (right != null) right.displayBSTByPostOrder();

        System.out.println(root);
    }

}