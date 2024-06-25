import java.util.Comparator;


public class Main  implements Comparator<String>{

 static int x;
 static  double y;

    public static final void main(String[]args) {
        int []array = {1, 3, 4, 4, 7};
      RemoveDupicates.removeDuplicates(array);


    }


    @Override
    public int compare(String o, String t1) {
        return 0;
    }
}






