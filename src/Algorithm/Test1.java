package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */

//有一个矩阵{m，n}，问从第一行第一个点开始到最后一个 点共有多少种走法(每个点只能向右或者向下走)
public class Test1 {
    public static int vectorPath(int x, int y) {
        if (x == 1 || y == 1) {
            return 1; }
        return vectorPath(x - 1, y) + vectorPath(x, y - 1); }

    public static void main(String[] args) {
          int a= vectorPath(4,5);
    }
}
