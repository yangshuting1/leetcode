package string;

/**
 * Created by sugaryang on 2017/10/17.
 */
//给定字符串，全部倒序输出
public class ReverseString {

    //最优
    public static String getReverse1(String s){
        //首先判断字符串是否为空
        if(s==null){
            return s;
        }
        int len=s.length();
        char[] cTmp=s.toCharArray();
        char[] cRes=new char[len];
        for(int i=0;i<len;i++){
            cRes[i]=cTmp[len-1-i];
        }
        String result =String.valueOf(cRes);

        return result;
    }

    public static String getReverse2(String s){
        //把String转换成char[]
        String resultString="";
        char[] originChars=s.toCharArray();
        for(int i=originChars.length-1;i>=0;i--){
            resultString=resultString+originChars[i];
        }
        return resultString;

    }

    public static void main(String[] args) {
        String originString="s'teL ekat edoCteeL tsetnoc";
        getReverse1(originString);

    }
}
