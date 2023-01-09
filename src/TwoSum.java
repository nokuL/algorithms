import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int [] array, int target){
        HashMap<Integer, Integer>hashMap = new HashMap<>();
        int complement = 0;
        int [] result_array = new int[2];
        for(int i =0 ; i < array.length ; i++){
            hashMap.put(array[i], i);

        }
        for(Integer integer :hashMap.keySet()){
            complement = target - integer;
            if(hashMap.containsKey(complement)){
                result_array[0]= hashMap.get(complement);
                result_array[1]=hashMap.get(integer);
                break;
            }

        }
       return result_array;

    }
}
