package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class mostfrequentElement {

    public static int mostFrequentEl(int [] array){
        if(array.length == 0){
            throw new IllegalArgumentException("Invalid Array length");
        }
        //first sort the array
        Arrays.sort(array);

        int curr_count = 1;
        int max = 1;
        int result = array[0];

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

    public static int mostFreqEl2(int [] array){
        if(array.length == 0){
            throw new IllegalArgumentException("Invalid Array length");
        }

        int max = 1;
        int result = array[0];

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 1; i< array.length; i++){
            if(hashMap.containsKey(array[i])){
                hashMap.put(array[i], hashMap.get(array[i])+1);
            }else{
                hashMap.put(array[i], 1);
            }

            if(hashMap.get(array[i]) > max){
                max = hashMap.get(array[i]);
                result = array[i];
            }

        }
        return result;
    }
}
