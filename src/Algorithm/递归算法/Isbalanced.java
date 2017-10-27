package Algorithm.递归算法;

import static Algorithm.递归算法.RootDeep.getTreeDept;

/**
 * Created by sugaryang on 2017/10/20.
 */
//平衡二叉树：任意节点的左右子树深度之差不等于1.
public class Isbalanced {
    public static boolean is_balanced(BinaryTreeNode root){

        //如果等于空的话，就不考虑了。
        if(root == null){     //为空。当然是平衡的
            return true;
        }
        int left = getTreeDept(root.leftChild);
        int right=getTreeDept(root.rightChild);
        int diff=left-right;
        if(diff >1|| diff<-1){    //深度之差大于1返回false
            return false;
        }
        //左右树同时进行判断平衡
        return is_balanced(root.rightChild) && is_balanced(root.leftChild);
    }


   //更优
   //获取深度
   public boolean is_balanced_2(BinaryTreeNode root, int Depth)
    {
        if(root == null)
        {
            return true;
        }
        int left=0;
        int right = 0;
        if(is_balanced_2(root.leftChild, left) //左子树平衡
        && is_balanced_2(root.rightChild, right)) //右子树平衡
        {
            int diff = left - right;
            if(diff <= 1 && diff >= -1) {
            Depth = 1 + (left > right ? left : right);
                return true;
            }
        }

        return false;
    }


}
