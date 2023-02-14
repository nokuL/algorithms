public class RemoveDupicates {

    public static int removeDuplicates(int[]array){
        int left = 0;
        int right = 1;
        int temp =0;

        while(right < array.length){
            if(array[left]!=array[right]){
                left++;
                array[left] = array[right];
            }
            right++;

        }
        for (int n: array){
            System.out.println(n);
        }
        return left+1;

    }
}
