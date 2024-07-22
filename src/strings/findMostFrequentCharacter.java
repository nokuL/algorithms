package strings;

import java.util.HashMap;
import java.util.Map;

public class findMostFrequentCharacter {

    public static char findMostFrequentChar(String str){
        //iterate chars array ,
        //if char is in map, increment by 1
        //else add it in map and put 1
        //if map.get(array[i]) > count, count =map.get(array[i], maxEl arr[i]
        int count = 0;
        char [] chars = str.toCharArray();
        char maxEl = chars[0];

        Map<Character, Integer>map = new HashMap<>();
        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);
            }else{
                map.put(chars[i], 1);
            }
            if(map.get(chars[i]) > count){
                count = map.get(chars[i]);
                maxEl = chars[i];

            }
        }

        return maxEl;
    }
}
