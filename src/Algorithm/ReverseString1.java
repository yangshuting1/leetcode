package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */

/** input："how old are you"
  * output"you are old how"
 */
public class ReverseString1 {

    public static String reverse(String str){
        String[] arr=str.split(" ");
        String temp;

        //全部遍历一遍并不优。那么遍历一遍
        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;


        }
        return String.join("",arr);    //在每个数组的中间加指定符号
    }

    public static void main(String[] args) {
        String str="how old are you doing";
        reverse(str);
    }
}
