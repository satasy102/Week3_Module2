class Node{
    int key;
    Node left;
    Node right;

    public Node(int item)    {
        key = item;
        left = right = null;
    }

    public int getKey() {
        return key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}