package Simple;

/**
 * Created by sugaryang on 2017/10/16.
 */
public class Test2 {
    //将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
    public static String replaceSpace(StringBuffer str) {
        //首先遍历字符串
        String a=str.toString();
        String b=a.replace(" ","%20");
        System.out.println(b);
        return a;
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("We Are Happy");
        replaceSpace(str);
    }

}
