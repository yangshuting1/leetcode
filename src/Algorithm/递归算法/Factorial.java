package Algorithm.递归算法;

/**
 * Created by sugaryang on 2017/10/20.
 */
//求整数阶层。n!=n*(n-1)!  0！=0
public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            int next=factorial(n-1);
            int result = next * n;
            return result;
        }


    }

    public static void main(String[] args) {
      int a =  factorial(6);
    }
}
