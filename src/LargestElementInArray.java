public class LargestElementInArray {

    public static int largestElement(int []array){
        //initialise two pointers
        //one from start , from end
        //compare items at each index, get max
        //start++, end--

        int end = array.length -1;
        int start = 0;
        int max = 0;
        while(end >= start){
            max = Math.max(Math.max(array[end], array[start]), max);
            end--;
            start++;

        }
        return max;


    }
}

