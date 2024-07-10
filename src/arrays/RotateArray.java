package arrays;

public class RotateArray {

    public static int[] rotateArray(int[] array, int d) {
        //first split the array into 2
        //split from zero to d-1
        //split from d to array.length -1
        //reverse 1st part
        //reverse 2nd part
        //reverse the whole arrayargt


        if(array==null || array.length == 0){
            throw new IllegalArgumentException("Invalid array length");
        }

        d %= array.length;

        reverseArray(array, 0, d - 1);
        reverseArray(array, d, array.length - 1);
        reverseArray(array, 0, array.length - 1);

        return array;


    }

    private static int[] reverseArray(int[] array, int start, int end) {
        //reverseing and array
        //have two pointers i.e left and right
        //left starts from start , right starts from end
        //have a temp variable
        //temp = array[right]
        //array[right] = array[left]
        //array[left] = temp
        //do this for all the eleemnts while left <= right

        if (array.length == 0) {
            throw new IllegalArgumentException("Invalid array length");
        }
        int left = start;
        int right = end;
        int temp = 0;
        while (left <= right) {
            temp = array[right];
            array[right] = array[left];
            array[left] = temp;

            right--;
            left++;
        }
        return array;


    }
}
