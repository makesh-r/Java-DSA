package DSA;

public class Demo {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree(10);
//        tree.insertLeft(tree.root, 5);
//        tree.insertRight(tree.root, 15);
//        tree.insertLeft(tree.root.left, 3);
//        tree.insertRight(tree.root.left, 8);
//        tree.insertLeft(tree.root.right, 12);
//
//        tree.preOrder(tree.root);
//        System.out.println();
//        tree.inOrder(tree.root);
//        System.out.println();
//        tree.postOrder(tree.root);
//        System.out.println();

//        BinarySearchTree bst = new BinarySearchTree(50);
//        bst.insert(20);
//        bst.insert(70);
//        bst.insert(10);
//        bst.insert(25);
//        bst.insert(60);
//        bst.insert(90);
//        bst.insert(75);
//        bst.insert(80);
//        bst.inOrder(bst.root);
//        System.out.println();

//        if(bst.search(bst.root,0) != null) {
//            System.out.println("found");
//        }
//        else{
//            System.out.println("not found");
//        }

//        bst.delete(50);
//        bst.inOrder(bst.root);
        AVL avltree = new AVL(50);
        avltree.insert(20);
        avltree.insert(60);
        avltree.insert(10);
        avltree.insert(30);
        avltree.insert(40);

        avltree.inOrder(avltree.root);
    }
}
