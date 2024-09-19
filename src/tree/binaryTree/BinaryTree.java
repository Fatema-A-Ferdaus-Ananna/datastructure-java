package tree.binaryTree;

public class BinaryTree {
    private  TreeNode root;
    private int nodeNum;

    private class TreeNode{
        private int data;  // 1. Storing value of node
        private TreeNode leftNode;  // 2. Storing address of left node
        private TreeNode rightNode; // 3. Storing address of right node

        TreeNode(int data){
            this.data = data;
        }
    }

    public BinaryTree(){
        root = null;
        nodeNum = 0;
    }

    public void createRootNode(int value){
        TreeNode newNode = new TreeNode(value);
        root = newNode;
    }

    public void createleftNode(int value){
        TreeNode newNode = new TreeNode(value);
        if(root == null){
            return;
        }
    }

    public void createRightNode(int value){
        TreeNode newNode = new TreeNode(value);
        root = newNode;
    }
    public void createBinaryTree(){
         TreeNode first = new TreeNode(6);
         TreeNode second = new TreeNode(5);
         TreeNode third = new TreeNode(9);
         TreeNode fourth = new TreeNode(2);
         TreeNode fifth = new TreeNode(1);

         root = first;
         root.leftNode = second;
         root.rightNode = third;
         second.leftNode = fourth;
         second.rightNode = fifth;
    }

    public void preOrder(TreeNode root){ //r-->left subtree --> right subtree
        if(root == null){
            return;
        }
        System.out.print(root.data + "  ");
        preOrder(root.leftNode);
        preOrder(root.rightNode);
    }

    public void inOrder(TreeNode root){ //left subtree --> r --> right subtree

    }

    public void postOrder(TreeNode root){ //left subtree --> right subtree --> r

    }
    public static void main(String[] agrs){
        System.out.println("Binary Tree");
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.print("Pre-order: ");
        bt.preOrder(bt.root);

    }
}
