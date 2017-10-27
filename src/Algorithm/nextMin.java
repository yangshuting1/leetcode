package Algorithm;

/**
 * Created by sugaryang on 2017/10/20.
 */
public class nextMin {
    public static int nextM(int[] array){
        int min;
        int next;
        int len=array.length;
        if(array[0]>array[1]){
            min=array[1];
            next=array[0];
        }else{
            next=array[1];
            min=array[0];
        }
         if(len>3){
             for(int i=3;i<array.length;i++){
                 if(array[i]<min){
                     next = min;
                     min=array[i];
                 }else if(array[i]<next){
                     next = array[i];
                 }
             }
         }
        return next;
    }

    public static void main(String[] args) {
        int[] array={1,5,9,3,18,2,6,4,7};
        nextM(array);
    }
}
