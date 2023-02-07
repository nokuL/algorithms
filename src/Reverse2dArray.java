import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reverse2dArray {

    public static void reverse2dArray(){
        int[][] array =  {{1,2},{3,4}};
        int start = 0;
        int end = array.length -1;
        int [] temp = new int[2];
        while(start < end){
            reverseArray(array[start]);
            reverseArray(array[end]);
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;

        }
        Stream.of(array).flatMapToInt(IntStream::of).forEach(System.out::println);
    }

    private static int[] reverseArray(int[] array){
        int start = 0;
        int end = array.length -1;
        int temp = 0;
        if(array.length < 1){
            System.out.println("Array too small");
        }
        while(start < end){
            temp = array[start];
            array[start]= array[end];
            array[end]= temp;
            start++;
            end--;
        }
        return array;
    }
}
