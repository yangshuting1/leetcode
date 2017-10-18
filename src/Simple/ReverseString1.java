package Simple;

/**
 * Created by sugaryang on 2017/10/17.
 */

/**
 * Input: "Let's take LeetCode contest"
   Output: "s'teL ekat edoCteeL tsetnoc"
 */

public class ReverseString1 {

    //不是最优
    public static String reverseWords(String s) {
        String result="";
        //将字符串进行用空格进行分开，然后将数据进行倒序
        String[] array=s.split(" ");

        for(String a:array){
            int len = a.length();
            for(int i=0;i<len;i++){
                result=result+a.charAt(len-1-i);
            }
            result=result+" ";
        }

        result =result.substring(0,result.length()-1);
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        reverseWords(s);

    }

}
