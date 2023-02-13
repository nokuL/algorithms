public class ReverseInteger {
    public static void reverseInteger(int x){
        //int x = -1321;
        int start =0;
        int end;
        char temp;
        boolean isNegative = false;
        String integer_string = String.valueOf(x);
        if(x < 0){
            integer_string = integer_string.substring(1);
            isNegative = true;
        }
        char [] chars = integer_string.toCharArray();
        end = chars.length -1;
        while(start < end){
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        String result = String.valueOf(chars);
        Integer integer = Integer.valueOf(result);
        if(isNegative){
            integer = integer * -1;
        }
        System.out.println(integer);
        return;



    }
}
