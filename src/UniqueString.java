import java.util.Arrays;

public class UniqueString {


    public static boolean uniqueString(String string){

        char [] chars = string.toCharArray();
        Arrays.sort(chars);
        for(int i = 0; i < chars.length-1; i++){
            if(chars[i] != chars[i +1]){
                continue;
            }else {
                return false;
            }

        }
        return true;

    }

}