package yst;

/**
 * Created by sugaryang on 2017/10/21.
 */
public class 矩阵走法 {

    public int ways(int x,int y){
        if(x==1 || y==1){
            return 1;
        }
        return ways(x-1,y)+ways(x,y-1);
    }
}
