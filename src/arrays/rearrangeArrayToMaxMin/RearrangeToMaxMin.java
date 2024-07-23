package arrays.rearrangeArrayToMaxMin;

public class RearrangeToMaxMin {

    public static int [] rearrange(int[] array){
        int max = array.length -1;
        int min = 0;
        int maxEl = array[array.length -1] + 1;

        for(int i = 0; i<array.length; i++){
            if(i%2==0){
                array[i] = array[i] + (array[max] % maxEl) * maxEl;
                max--;
            }else{
                array[i] = array[i] + (array[min] % maxEl) * maxEl;
                min++;

            }
        }
        for(int i = 0; i<array.length; i++){
            array[i] = array[i]/ maxEl;
        }
    return array;

    }
}
