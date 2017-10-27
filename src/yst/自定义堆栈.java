package yst;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sugaryang on 2017/10/21.
 */

//堆栈就是栈，仅允许在表的 表头（又名栈顶） 进行插入和删除运算，另一端称为表尾（栈底）
public class 自定义堆栈 {
    List<Integer> array;
    //构建方法
    public 自定义堆栈( ){
        array=new ArrayList<>();
    }
    //添加
    public void add(int data){
        array.add(data);
    }

    //删除
    public int pop(){
        int size = array.size();
        if(size ==0){
            System.out.println("error");
        }

        int data=array.get(size-1);
        array.remove(size-1);

        return data;
    }
}
