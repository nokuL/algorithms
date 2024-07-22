package arrays.findMaximumNumber;

public class findMaxNumber {

    public static int findMaxNumber(int[]array){

        if(array == null){
            throw new IllegalArgumentException("Invalid array");
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i]> max){
                max = array[i];
            }
        }
        return max;

    }
}
