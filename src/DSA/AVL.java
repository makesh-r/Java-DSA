package DSA;

public class AVL {
    Node root;
    class Node {
        int key;
        Node left, right;
        int height;

        public Node(int val) {
            key = val;
            left = null;
            right = null;
            height = 0;
        }
    }
    public AVL(int val) {
        root = new Node(val);
    }
    public  AVL(){
        root = null;
    }

    public int getHeight(Node node) {
        if(node == null) {
            return -1;
        }
        return node.height;
    }
    public int max(int a, int b) {
        return a>b?a:b;
    }
    public int getBalanceFactor(Node node) {
        if(node == null) {
            return 0;
        }
        return getHeight(node.left)-getHeight(node.right);
    }
    public void insert(int val) {
        root = insert(root, val);
    }
    public Node insert(Node node, int val) {
        if(node == null) {
            return new Node(val);
        }
        if(val < node.key) {
            node.left = insert(node.left, val);
        }
        else if (val > node.key){
            node.right = insert(node.right, val);
        }
        else
            return node;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        int balFactor = getBalanceFactor(node);

        // LL case
        if(balFactor > 1 && val < node.left.key){
            return rightRotate(node);
        }
        // LR case
        if(balFactor > 1 && val > node.left.key) {
            node.left = leftRotate(node.left);
            return  rightRotate(node);

        }
        // RR case
        if(balFactor < -1 && val > node.right.key) {
            return leftRotate(node);
        }
        // RL case
        if(balFactor < -1 && val < node.right.key) {
            node.right = rightRotate(node.right);
            return  leftRotate(node);
        }
        return node;
    }

    private Node rightRotate(Node node) {

        Node temp = node.left;
        Node temp1 = temp.right;

        temp.right = node;
        node.left = temp1;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        temp.height = 1 + max(getHeight(temp.left), getHeight(temp.right));

        return temp;
    }
    private Node leftRotate(Node node) {

        Node temp = node.right;
        Node temp1 = temp.left;

        temp.left = node;
        node.right = temp1;

        node.height = 1 + max(getHeight(node.left), getHeight(node.right));
        temp.height = 1 + max(getHeight(temp.left), getHeight(temp.right));

        return temp;
    }

    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.key + " height is " + root.height);
            inOrder(root.right);
        }
    }
}
