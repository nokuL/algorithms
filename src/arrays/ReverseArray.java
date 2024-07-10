package arrays;


import java.util.stream.Stream;

public class ReverseArray {

    public static int [] reverseArray(int [] array){
        // program to reverse array in java

        if(array.length == 0){
            throw new IllegalArgumentException("Invalid array length");
        }

        int start = 0;
        int end = array.length -1;
        int temp = 0;

        while (start <= end){
            temp = array[end];
            array[end] = array[start];
            array[start] = temp;
            end --;
            start ++;
        }
        Stream.of(array).forEach((character)-> System.out.println(">>>>>>>>>>"+ character) );

        return array;

    }
}
