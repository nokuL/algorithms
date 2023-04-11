import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDiffInArray {

    public static void absoluteDifference(int[] array) {

        //define two pointers, left=0 and right=1
        //define min =0;
        //find dif between array[left] and array[right]
        //calculate min between diff of array[left] and array[right]
        //if diff == min, insert the two elements in left and right index in array , then insert in parent array

        int left = 0;
        int right = 1;
        int min_diff =  Integer.MAX_VALUE;
        int diff = 0;
        int n = array.length;
        List<List<Integer>>result = new ArrayList<>();

        Arrays.sort(array);
       for(int i =1; i < n; i++){
         min_diff = Math.min((array[i] - array[i-1]), min_diff);
       }

       for(int j =1; j< array.length;j++ ){
           if(array[j]- array[j-1] == min_diff){
               List<Integer>pair = new ArrayList<>();
               pair.add(array[j-1]);
               pair.add(array[j]);
               result.add(pair);
           }
       }
        System.out.println(" MIN DIFF IS :"+ min_diff +">>>>>>>>>>>>>>"+ "ARRAY >>>>>>>>"+ result);


    }
}
