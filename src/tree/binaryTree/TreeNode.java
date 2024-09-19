package tree.binaryTree;

public class TreeNode<T> {

    private T data;  // 1. Storing value of node
    private TreeNode<T> leftNode;  // 2. Storing address of left node
    private TreeNode<T> rightNode; // 3. Storing address of right node

    public TreeNode(T data){
        this.data = data;
        this.rightNode = null;
        this.leftNode = null;
    }
}
