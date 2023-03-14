import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {
        String string = "aabbbaaccc";
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>     " + CompressedString.compressedString(string).orElse("Invalid arguments"));
    }
}




