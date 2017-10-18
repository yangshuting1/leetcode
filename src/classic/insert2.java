package classic;



//简单选择排序: 找出排序中最小的数x,然后交换位置

//
public class insert2 {
    public static void sort(Comparable[] data){
        int len=data.length;     //记录数组的长度
        for(int i=0;i<len;i++){    //for循环数组
            //记录当前位置
            int position=i;
            for(int j=i+1;j<len;j++){
                //如果前一位大
                if(data[position].compareTo(data[j])>0){
                    position=j;     //循环最小位
                }
            }
            // 交换最小位和第i位的位置
            Comparable d=data[i];
            data[i]=data[position];
            data[position]=d;

        }

    }
    public static void main(String[] args) {
        //在JDK1.5版本以上,基本数据类型可以自动装箱
        //int,double等基本类型的包装类已实现了Comparable接口
        Comparable[] c={4,9,23,1,45,27,5,2};
        sort(c);

    }
}
