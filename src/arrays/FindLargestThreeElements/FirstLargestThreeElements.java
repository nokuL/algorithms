package arrays.FindLargestThreeElements;

import java.util.HashMap;
import java.util.Map;

public class FirstLargestThreeElements {

    public static Map<String, Integer>findLargestElements(int[]array){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;

        if(array==null || array.length==0){
            throw new IllegalArgumentException("Invalid array length");
        }
        for(int i =0; i< array.length; i++){
            if(array[i] > Integer.MIN_VALUE){
                first = array[i];
            }
        }
        for(int i=0; i<array.length;i++){
            if(array[i]> Integer.MIN_VALUE && array[i]<first){
                second = array[i];
            }
        }
        for(int i =0; i<array.length;i++){
            if(array[i]>Integer.MIN_VALUE && array[i]<first && array[i]<second){
                third = array[i];
            }
        }


        Map<String, Integer>map = new HashMap<>();
        map.put("FIRST", first);
        map.put("SECOND", second);
        map.put("THIRD", third);
        return map;

    }
}
