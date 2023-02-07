import java.util.stream.Stream;

public class ReverseString {

    public static void reverseString(){
        String string = "Arrays";
        char [] chars = string.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        char temp = 0;

        if(string.length() < 1){
            throw new IllegalArgumentException("Invalid string");

        }
        while(start < end){
           temp = chars[start];
           chars[start] = chars[end];
           chars[end]= temp;
           start++;
           end--;

        }
        Stream.of(chars).forEach(System.out::println);

    }
}
