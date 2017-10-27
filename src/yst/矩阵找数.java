package yst;

/**
 * Created by sugaryang on 2017/10/16.
 */
//矩阵排布，判断是否有这样的一个数
public class 矩阵找数 {
    public boolean Find(int target, int [][] array) {

        boolean isHave = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    isHave = true;
                    continue;
                }
            }
            if (isHave) {
                continue;
            }
        }

        return isHave;
    }

}
