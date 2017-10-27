package link;

/**
 * Created by sugaryang on 2017/10/21.
 */
public class NodeBinaryTree {

    NodeBinaryTree left;
    NodeBinaryTree right;
    int data;

    public NodeBinaryTree(int data){
        this.data=data;
    }

    public NodeBinaryTree(int data, NodeBinaryTree left, NodeBinaryTree right){
        this.data=data;
        this.left=left;
        this.right=right;
    }


}
