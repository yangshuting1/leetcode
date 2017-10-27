package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */
//连续子集和最大
public class SumMax {

    public static int SumMax(int[] array) throws Exception{
        //判断数组为空
        //判断长度为null;
        if(array==null || array.length==0){
            throw new Exception("array error");
        }

        //
        int maxSofar = array[0];
        int maxEnding=0;
        for(int i=0;i<array.length;i++){
            //此方法返回a和b中较大的一个。
            maxEnding = Math.max(maxEnding+array[i],0);
            maxSofar = Math.max(maxSofar,maxEnding);
        }
        return maxSofar;


    }

    public static void main(String[] args) {

    }
}
