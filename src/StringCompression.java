public class StringCompression {

    public static String compress(String string){

        //declare a counter
        //loop through string , if charAt(i +1 ) != charAt(i) , counter = 0 || (i+1) >= string.length()
        //else counter++;

        if(string == null || string.length() ==0){
            throw new IllegalArgumentException("String should not be null");

        }

        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0 ; i < string.length() ; i++){
            if(i + 1 >= string.length() || string.charAt(i) != string.charAt(i + 1)){
                stringBuilder.append(counter);
                stringBuilder.append(string.charAt(i));
                counter = 0;
            }else{
                counter++;
            }

        }
         return string.length() <= stringBuilder.length() ? string : stringBuilder.toString();
    }
}
