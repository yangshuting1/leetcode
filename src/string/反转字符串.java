package string;

/**
 * Created by sugaryang on 2017/10/21.
 */
public class 反转字符串 {

    public static String reveserString(String a){
        String[] arr=a.split(" ");
        int len=arr.length;
        for(int i=0;i<len/2;i++){
            String temp=arr[i];
            arr[i]=arr[len-1-i];
            arr[len-i-1]=temp;
        }
        return String.join(" ",arr);

    }
}
