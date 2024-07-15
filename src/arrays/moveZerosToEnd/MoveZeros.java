package arrays.moveZerosToEnd;

import java.util.Arrays;

public class MoveZeros {


    public static int [] moveZeros(int[]array){
        //{4, 0, 0, 3, 4}
        //have 2 pointers i.e left and right
        //left = 0 , right = 1
        //while right < array.length
        //if arr[left] == 0 && arr[right] !== 0, swap, left++
        //if arr[left] != 0 && arr[right] != 0
        //if arr[left] == 0 && arr[right] == 0, right++
        //if arr[left] != 0 && arr[right] == 0, left++

        int left = 0;
        int right = 1;
        int temp;

        if(array == null || !checkAnyZeros(array) || checkAnyBIgNum(array) ){
            throw new IllegalArgumentException("Invalid argument");
        }
        if(array.length == 1){
            return array;
        }
       while(right < array.length){
           if(array[left] == 0 && array[right]!= 0 ){
               temp = array[left];
               array[left] = array[right];
               array[right] = temp;
           }else if(array[left] != 0 &&  array[right] != 0){
               right++;
               right++;
           }else if(array[left]== 0 && array[right] == 0){
               right++;
           }else if (array[left] != 0 && array[right]==0 ){
               left++;
           }
       }

        return array;
    }

    public static boolean checkAnyZeros(int[]array){
       return Arrays.stream(array).anyMatch((num)->num == 0);
    }

    public static boolean checkAnyBIgNum(int[]array){
        return Arrays.stream(array).anyMatch((num)->num > 100);
    }
}
