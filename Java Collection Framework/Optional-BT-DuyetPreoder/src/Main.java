public class Main {
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();

       /* Let us create following BST
             50
           /    \
         30      70
         / \    /   \
       20  40  60   80
       */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Duyet Inoder");
        tree.inorder();
        System.out.println("\nDuyet Preoder");
        tree.preOrder();
        System.out.println("\nDuyet Posoder");
        tree.postOrder();

        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Duyet Preoder");
        tree.preOrder();

        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Duyet Posoder");
        tree.postOrder();

        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Duyet inoder");
        tree.inorder();
    }
}
