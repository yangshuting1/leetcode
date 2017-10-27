package Algorithm.递归算法;

/**
 * Created by sugaryang on 2017/10/20.
 */
public class BinaryTreeNode {
    public int Data;
    public BinaryTreeNode leftChild;
    public BinaryTreeNode rightChild;

    //重载构造方法
    public BinaryTreeNode(int data){
        this.Data=data;
    }
    //重载构造方法
    public BinaryTreeNode(int data,BinaryTreeNode left,BinaryTreeNode right){
        this.Data=data;
        this.leftChild=left;
        this.rightChild=right;
    }

    //深度
    public int dept(BinaryTreeNode root,BinaryTreeNode t){
        return 1;
    }


}
