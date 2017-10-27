package link;

/**
 * Created by sugaryang on 2017/10/21.
 */
//https://www.61mon.com/index.php/archives/191/
    //
public class 二叉树左中右 {

      public void leftToRight(NodeBinaryTree root){
          if(root==null){
              System.out.println("tree null");
          }
          while(root!=null){
              if(root.left==null){     //如果没有左节点
                  root=root.right;
              }
              else{                     //如果有左节点
                  root = root.left;    //把左节点作为root
                  while(root.right !=null && root.left!=null){    //他有左节点，右节点
                      root=root.right;
                  }
              }
          }
          if(root.right!=null || root.left!=null){    //有左节点

          }

      }

}

