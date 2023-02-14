import java.util.Arrays;

public class WaveSort {

    public static int[] waveForm(int[] integers){
        int left = 0;
        int right = 1;
        int temp = 0;
        Arrays.sort(integers);
        while(right < integers.length){
            temp = integers[left];
            integers[left]= integers[right];
            integers[right]= temp;
            right+=2;
            left+=2;

        }
        for(int integer: integers){
            System.out.println(integer);
        }
        return integers;
    }
}
