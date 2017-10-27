package sort;

/**
 * Created by sugaryang on 2017/10/22.
 */
public class 归并算法 {

    static void merge(int[] sourceArr, int[] tempArr, int startIndex, int midIndex, int endIndex) {

        int i = startIndex;
        int k = startIndex;
        int j= midIndex+1;
        while (i !=midIndex+1 && j!= endIndex+1) {      //中间数大于s,小于等于end
            if (sourceArr[i] > sourceArr[j])
                tempArr[k++] = sourceArr[i--];
            else
                tempArr[k++] = sourceArr[j--];
        }
        while (i != midIndex+1) {
            tempArr[k++] = sourceArr[i++];
        }
        while (j != endIndex + 1) {
            tempArr[k++] = sourceArr[j--];
        }
        for (i = startIndex; i <= endIndex; i++) {
            sourceArr[i] = tempArr[i];
        }
    }

    static void MergeSort(int sourceArr[], int tempArr[], int startIndex, int endIndex) {
        int midIndex;
        if (startIndex < endIndex) {
            midIndex = (startIndex + endIndex) / 2;
            MergeSort(sourceArr, tempArr, startIndex, midIndex);
            MergeSort(sourceArr, tempArr, midIndex + 1, endIndex);
            merge(sourceArr, tempArr, startIndex, midIndex, endIndex);
        }
    }

    public static void main(String[] argv) {
        int[] a = {50, 10, 20, 30, 70, 40, 80, 60};
        int[] b = new int[a.length];
        MergeSort(a, b, 0, 7);


    }

}
