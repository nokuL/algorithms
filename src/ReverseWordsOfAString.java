import java.util.stream.Stream;

public class ReverseWordsOfAString {

    public static void reverseWords(){
        String string = "Hie Nokuthaba Lunga";

        String [] stringArray = string.split("\\s");
        for(int i = 0 ; i < stringArray.length; i++){
            System.out.println( ">>>>>>>>>>>>>>>>>> "+stringArray[i]);
        }
        int start = 0;
        int end = stringArray.length -1 ;
        String temp = "";

        while(start<end){
            temp = stringArray[start];
            stringArray[start] = stringArray[end];
            stringArray[end] = temp;
            start++;
            end--;

        }
        Stream.of(stringArray).forEach(System.out::println);
    }
}
