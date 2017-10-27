package string;

/**
 * Created by sugaryang on 2017/10/21.
 */
public class 字符串转整型 {

    public int StringToInt(String s){
        //1. 第一位是否是正负
        if(s==null ||(" ").equals(s)){
            System.out.println("error");
        }

        int i=0;        //如果有正负号，从第二位开始循环
        int sign=1;    //区分正负
        int result=0;
        int digit=s.charAt(0);
        final int MAX_DIV=Integer.MAX_VALUE/10;
        final int MIN_div=Integer.MIN_VALUE/10;
        final int MAX_M=Integer.MAX_VALUE%10;
        final int MIN_M=Integer.MIN_VALUE%10;

        if(digit=='+'|| digit=='-'){
            if(digit=='-'){
                sign=-1;
            }
            //判断是不是只有这一个符号
            if(s.length()==1){
                System.out.println("error");
            }
        }
        while(i<s.length()){
            //小于length时，判断首先是否是字符
            digit=s.charAt(i++)-'0'; //转换成int
            if(digit>=0 && digit<=9){        //如果符合规范
                //判断是否符合
                //if(sign>0 &&(result>MAX_DIV || (result==MAX_DIV && digit>MAX_M))){

                if(sign>0 && (result>MAX_DIV|| (result==MAX_DIV && digit>MAX_M))){
                    System.out.println("number overflow");

                }else if(sign<0 &&(result>MIN_div || result==MIN_div && digit>MIN_M)){
                    System.out.println("number overflow");
                }
                result=result*10+digit;
            }
            else{
                System.out.println("input number illegal");
            }

        }
        if(sign>0){
            return result;
        }else{
            return -result;
        }

    }
}
