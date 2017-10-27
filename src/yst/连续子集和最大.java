package yst;

/**
 * Created by sugaryang on 2017/10/21.
 */
public class 连续子集和最大 {

    public static int getSum(int[] array){
        if(array==null|| array.length<1){
            System.out.println("list error");
        }
        int maxSofar=0;
        int Ending=0;
        for(int i=0;i<array.length;i++){
            maxSofar=Math.max(maxSofar+array[i],0);
            Ending = Math.max(maxSofar,Ending);
        }
        return Ending;
    }

    public static void main(String[] args) {
        int[] array={1,9,3,-200,7,4,-3};
        getSum(array);
    }
}
