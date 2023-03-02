public class ReverseStringUsingRecursion {

    public static String reverseString(String string){

        if(string == null || string.length() <= 1){
            return string;
        }
        return reverseString(string.substring(1))+ string.charAt(0);

    }
}
