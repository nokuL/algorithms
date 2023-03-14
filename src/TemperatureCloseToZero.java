import java.util.stream.IntStream;

public class TemperatureCloseToZero {

    public static int temperature(int[]temps) {
        int closest = Integer.MAX_VALUE;
        if (temps.length == 0) {
            throw new IllegalArgumentException("Invalid length");
        }
        for(int i = 0 ; i < temps.length ; i++){
            if(Math.abs(temps[i]) < Math.abs(closest)){
                closest = temps[i];
            }
            boolean hasComplement = anyMatch(closest, temps);
            if(hasComplement){
                closest = Math.max(closest, (-1*closest));
            }

        }
        return closest;


    }

    public static boolean anyMatch(int integer , int[]ints)
    {
        return IntStream.of(ints).anyMatch(n-> (n *-1)==n);
    }
}
