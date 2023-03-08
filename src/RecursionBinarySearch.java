import java.util.Arrays;

public class RecursionBinarySearch {

    public static int binarySearch(int[] array, int x, int left, int right){
        //given an array of numbers, first sort
        //calculate the mid-index of the array (right + left )/2
        //if x < mid-index
        //call binarySearch with left, (right = midINdex -1), x, array
        //else call binarySearch with right , (left = midIndex +1 ), x , array
        //baseCase (if (array[left] != x && left == 0) || (array[right]!=x && right == array.length)


        Arrays.sort(array);
        int mid = (left + right)/ 2;

        if(left > right){
            return -1;
        }
        if(x == array[mid]){
          return   mid;
        }
        if(x < array[mid]){
            return binarySearch(array, x, left , mid -1);
        }
            return binarySearch(array, x, mid+1, right);


    }

}
