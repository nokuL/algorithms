package arrays;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates(int [] array){
        //given an array
        // use one pointer , left
        //for each element
        //if arr[i] is not equal to the prev element
        //arr[left] = arr[i]
        //left++
        //return left

        int left = 1;
        for (int i = 1; i < array.length ; i++){
            if(array[i] != array[i-1]){
                array[left] = array[i];
                left++;
            }
        }
        return  left;

    }
}
