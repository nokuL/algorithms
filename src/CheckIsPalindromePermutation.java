import java.util.Arrays;

public class CheckIsPalindromePermutation {

    public static boolean isPermutation(String string1 , String string2){

        char[] chars1 = string1.toLowerCase().toCharArray();
        char[]chars2 = string2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);


    }
}
