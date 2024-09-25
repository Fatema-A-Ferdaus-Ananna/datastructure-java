package tree.binaryTree;

import java.util.Stack;

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

    public void preOrderIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.print(temp.data + "  ");

            if(temp.rightNode != null){
                stack.push(temp.rightNode);
            }
            if(temp.leftNode != null){
                stack.push(temp.leftNode);
            }
        }
    }

    public void inOrder(TreeNode root){ //left subtree --> r --> right subtree
        if(root == null){
            return;
        }
        inOrder(root.leftNode);
        System.out.print(root.data + "  ");
        inOrder(root.rightNode);
    }

    public void inOrderIterative(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp != null){
            if(temp != null){
                stack.push(temp);
                temp = temp.leftNode;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + "  ");
                temp = temp.rightNode;
            }
        }
    }

    public void postOrder(TreeNode root){ //left subtree --> right subtree --> r
        if(root == null){
            return;
        }
        postOrder(root.leftNode);
        postOrder(root.rightNode);
        System.out.print(root.data + "  ");
    }

    public void postOrderIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (!stack.isEmpty() || current != null){
            if(current != null){
                stack.push(current);
                current = current.leftNode;
            }else {
                TreeNode temp = stack.peek().rightNode;
                if(temp == null){
                    temp = stack.pop();
                    System.out.print(temp.data + "  ");
                    while (!stack.isEmpty() && temp == stack.peek().rightNode){
                        temp = stack.pop();
                        System.out.print(temp.data + "  ");
                    }
                }else {
                    current = temp;
                }
            }
        }
    }

    public static void main(String[] agrs){
        System.out.println("Binary Tree");
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.print("Pre-order: ");
        bt.preOrder(bt.root);
        System.out.println(" ");
        System.out.print("In-order: ");
        bt.inOrder(bt.root);
        System.out.println(" ");
        System.out.print("Post-order: ");
        bt.postOrder(bt.root);
        System.out.println("\n");
        System.out.print("Pre-order Iterative: ");
        bt.preOrderIterative(bt.root);
        System.out.println(" ");
        System.out.print("In-order Iterative: ");
        bt.inOrderIterative(bt.root);
        System.out.println(" ");
        System.out.print("Post-order: ");
        bt.postOrderIterative(bt.root);

    }
}
