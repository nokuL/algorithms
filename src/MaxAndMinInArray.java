public class MaxAndMinInArray {

    public static void maxAndMin(int[]array){

        int end = array.length -1;
        int start = 0;
        int max = array[start];
        int min = array[start];

        while (end >= start){
            max = Math.max(Math.max(array[start], array[end]), max);
            min = Math.min(Math.min(array[start], array[end]), min);
            start++;
            end--;
        }
        System.out.println("MAX :"+max + "Min :"+ min);

    }
}

