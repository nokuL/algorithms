package arrays;

import java.util.Arrays;

public class mostfrequentElement {

    public static int mostFrequentEl(int [] array){
        if(array.length == 0){
            throw new IllegalArgumentException("Invalid Array length");
        }
        //first sort the array
        Arrays.sort(array);

        int curr_count = 1;
        int max = 1;
        int result = 0;

        for (int i =1 ; i < array.length; i++){
            if(array[i] == array[i -1]){
                curr_count++;
            }else{
                curr_count = 1;
            }

            if(curr_count > max){
                max = curr_count;
                result = array[i -1];
            }

        }
        return result;

    }
}
