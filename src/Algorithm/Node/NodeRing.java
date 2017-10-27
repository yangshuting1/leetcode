package Algorithm.Node;

/**
 * Created by sugaryang on 2017/10/20.
 */

//判断一个链表是否有环
    //思路
    public class NodeRing {


        public static boolean isHasRing(Node root){
            Node temp1=root;
            Node temp2=root.next;

            while (temp2!=null){
                int d1=temp1.val;
                int d2=temp2.val;

                if(d1==d2){
                    return true;
                }
                temp1=temp1.next;
                temp2=temp2.next.next;
                if(temp2==null){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {

        }


}
