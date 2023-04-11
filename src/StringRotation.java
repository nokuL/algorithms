public class StringRotation {

    public static boolean isRotation(String string1 , String string2){
        boolean isRotationVar = false;
       String resString = string1+ string1;
       if(string2.length() == string1.length() ){
           return resString.contains(string2);
       }
        return false;
    }
}
