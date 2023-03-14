import java.util.Optional;

public class CompressedString {

    public static Optional<String> compressedString(String string){

        if(string == null || string.length()==0){
            return Optional.empty();
        }
      int counter = 0;
      StringBuilder stringBuilder = new StringBuilder();
      char [] chars = string.toCharArray();
      for(int i =0; i <= chars.length-1; i++){
          counter++;
          if(i+1 == chars.length || chars[i+1] != chars[i]){
              stringBuilder.append(chars[i]);
              stringBuilder.append(counter);
              counter =0;
          }
      }
      return Optional.of(stringBuilder.toString());
    }
}
