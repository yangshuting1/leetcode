package link;

/**
 * Created by sugaryang on 2017/10/21.
 */
    //初始值指向头，slow每次前进一步，fast每次前进两步，如果有环。必定相遇
    //如果无环，那么fast先到终点
    //当链表长度为奇数时，fast,next为空
    //长度为偶数时，fast为空
public class 链表是否有环 {

    public boolean isRing(LinkNode root) {
        //初始化不是环
        LinkNode fast = root;
        LinkNode slow = root;    //起点相同

        while (fast != null && fast.next != null) {    //当前节点有，下一节点也有
            fast = fast.next.next;    //fast变成下一节点slow
            if (fast.equals(slow)) {
                break;
            }
        }
        //长度为偶数时，fast为空
        if(fast== null || fast.next==null){
            return false;
        }else{
            return true;
        }

    }
}
