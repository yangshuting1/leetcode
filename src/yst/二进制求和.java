package yst;

/**
 * Created by sugaryang on 2017/10/17.
 */

/**
 a = "11"
 b = "1"
 Return "100".
 * */
//二进制求和
public class 二进制求和 {

    public static String addBinary(String a, String b) {
        //确定二者大小,

        if(a.length()<b.length()){
            String temp=a;
            a=b;
            b=temp;
        }

        //b比较小，a比较大
        int la=a.length()-1;
        int lb=b.length()-1;
        int carries=0; //进位
        String res = "";  //结果
        while(lb>0) {   //先依据短字符串的长度依次计算
            int sum = (int) (a.charAt(la) - '0') + (int) (b.charAt(lb) - '0') + carries;
            res = String.valueOf(sum % 2) + res;
            carries = sum / 2;
            la--;
            lb--;
        }
        //根据字符长度依次计算
        while(la>=0){

        int sum=(int)(a.charAt(la)-'0')+carries;
        res=String.valueOf(sum%2)+res;
        carries=sum%2;
        la--;
    }

    if(carries==1){
            res="1"+res;   //计算最后的进位
    }
        return res;
    }

    public static void main(String[] args) {
        addBinary("11","1");
    }
}
