public class MoveZeroToEnd {

    public static int[] moveZeroToend(int[]intArray){
        int left = 0;
        int right = 1;
        int temp = 0;

        while(right <intArray.length){
            if(intArray[left] == 0 && intArray[right] !=0){
                temp = intArray[left];
                intArray[left] = intArray[right];
                intArray[right]= temp;
                left++;
                right++;
            }else{
                right++;
            }

        }

        for (int w: intArray
             ) {
            System.out.println(w);

        }
        return intArray;

    }

}
