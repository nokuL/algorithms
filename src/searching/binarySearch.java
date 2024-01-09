package searching;

public class binarySearch {

    public static boolean binarySearch(int [] array, int element, int start, int end){
        /* function to search element using binarysearch using recursion*/

        int mid = (start + end)/2;

        if(end > start){
            return false;
        }

        if(element == array[mid]){
            return true;
        } else if (element < array[mid]) {

            return binarySearch(array, element, start, mid -1 );

        }else{
           return binarySearch(array, element, mid + 1, end);
        }

    }
}
