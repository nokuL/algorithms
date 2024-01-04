package arrays;

public class LastDuplicateElement {

    public static void duplicatecheck(int [] array){
        if(array.length == 0){
            throw new IllegalArgumentException("Invalid array length");
        }

        int n = array.length -1;

        while (n>0){
            if(array[n]== array[n-1]){
                System.out.println("Array elements {}"+ array[n]);
                System.out.println("Array index :"+ array[n-1]);
                return;
            }
            n--;
        }
        System.out.println("No duplicates found");


    }
}
