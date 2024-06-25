public class RemoveDupicates {

    public static int removeDuplicates(int[]array){
        int left = 0;
        int right = 1;
        int count =0;

        while(right < array.length){
            if(array[left]!=array[right]){
                left++;
                array[left] = array[right];
                count++;
            }
            right++;

        }


        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }

        // Print the unique elements
        for (int n : result) {
            System.out.println(n);
        }

        return count;

    }
}
