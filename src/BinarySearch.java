import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearch {

    public static int binarySearch(int[] ints, int target, int start , int end) throws Exception {
        Arrays.sort(ints);
       int left =0;
       int right = ints.length -1;
       boolean isSorted  = IntStream.range(0, ints.length -1).noneMatch(i ->ints[i]> ints[i+1]);
       if(!isSorted){
           throw new  Exception("Array should be sorted for binary search");
       }
       while(left<=right){
           int middle = (right + left)/2;
           if(ints[middle]< target){
               left = middle + 1;
           } else if (ints[middle]> target) {
               right = middle -1;

           }else{
               return middle;
           }
       }
       return -1;


    }

    private static int[] sortedArray(int [] array){
        for(int i = 0 ; i< array.length; i++){
            for (int j = i+1 ; j< array.length; j++){
                int tmp = 0;
                if(array[i] > array[j]){
                    tmp = array[i];
                    array[i] = array[j];
                     array[j] = tmp;

                }

            }
        }
        return array;

    }
}
