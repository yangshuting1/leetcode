package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */

//将字符串转化成整型
    //考虑:1.  开头可能会有"+"或"-"，表示正数的正负
    //2. 字符串为null或" "
    //是否掺杂其他的非数字的字符
    // 只有一个+或-吗？
    // 溢出问题

    //-123456789012346789846464
public class StringToInt {

    public static int atoi(String s){
      if(s==null || " ".equals(s)) {   //字符串为null或" "
          System.out.println("s is null");
      }
      final int MAX_DIV=Integer.MAX_VALUE/10;
      final int MIN_DIV=Integer.MIN_VALUE/10;
      final int MAX_M=Integer.MAX_VALUE%10;
      final int MIN_M=Integer.MIN_VALUE%10;

      int result = 0;
      int i=0,len=s.length();
      int sign = 1;      //标志，正负
      int digit = s.charAt(0);      //当前字符
        if(digit=='-'|| digit=='+'){      //第一个字符
            if(digit == '-'){
                sign=-1;
            }
            if(len==1){       //就一个符号
                System.out.println("s is null");
                }
                i++;          //第一位是符号位，不算在内，从1开始
            }
            while(i<len){
            //先执行s.charAt(i),再加加
            digit = s.charAt(i++)-'0';    //获取的char出来是char中对应的字符，减0后就对应着数字
                if(digit>=0 && digit<=9){     //判断是不是0-9的数

                    //如果sign大于0 并且(要不result>div,要不result等于div 并且digit 大于最大的m)
                    if(sign>0 &&(result>MAX_DIV || (result==MAX_DIV && digit>MAX_M))){
                        System.out.println("number overFlow");

                    }else if(sign<0 &&(result>MIN_DIV ||result==MIN_DIV &&  digit>MIN_M)){
                        System.out.println("number overFlow");

                    }
                    result = result*10+digit;
                }else{
                     //输入的数字不是0-9
                    System.out.println("illegal number input");

                }
        }
        if(sign>0){
                return result;
        }else{
            return -result;
        }
    }

    public static void main(String[] args) {
        String str = "-123456789012346789846464";

            atoi(str);
    }
}
