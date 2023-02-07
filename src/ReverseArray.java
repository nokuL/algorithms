import java.util.Arrays;

public class ReverseArray {

    public static void reverseArray(){
        int [] array = new int[]{1,2,3,4,5,6,7};
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

        Arrays.stream(array).forEach(System.out::println);
    }
}
