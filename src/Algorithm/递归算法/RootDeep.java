package Algorithm.递归算法;

import com.sun.source.tree.BinaryTree;

/**
 * Created by sugaryang on 2017/10/20.
 */
// 深度是指：二叉树从根节点到叶子节点的最大的高度
    //把每一个节点都当成一个根节点，依次遍历
public class RootDeep {

    public static int getTreeDept(BinaryTreeNode root){
        if(root== null){
            return 0;
        }
        int left = getTreeDept(root.leftChild);
        int right = getTreeDept(root.rightChild);

        if(left>=right){
            return left+1;
        }else{
            return right+1;
        }

    }

    public static void main(String[] args) {
        //getTreeDept();
    }

}
