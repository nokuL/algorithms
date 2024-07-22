package arrays.findMostFrequentElement;

import java.util.HashMap;
import java.util.Map;

public class findMostFrequentElement {

    public static int findMostFrequentElement(int []array){
        //iterate through the array
        //if map has element, increment by 1
        //else enter in map and put 1
        //if map.get(maxelement) > maxcount, maxcount = map.get(maxelement), maxelement = element
        //return maxelement
        int maxElement = array[0];
        int count = 0;
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0; i< array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
            if(map.get(array[i]) > count){
                count = map.get(array[i]);
                maxElement = array[i];
            }
        }
        return maxElement;
    }
}
