package Algorithm.递归算法;

import java.util.HashMap;

/**
 * Created by sugaryang on 2017/10/20.
 */
public class ToweOfHanoi {

    public static void hano(char a,char b,char c,int n){

        if (n > 0) {
            hano(a, c, b, n-1);
            System.out.println(a+"->"+c);
            hano(b, a, c, n-1);
            if((" ").equals(" ")){
                HashMap
            }
        }
    }

    public static void main(String[] args) {
     hano('A','B','C',3);
    }
}
