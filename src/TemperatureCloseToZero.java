import java.util.Arrays;

public class TemperatureCloseToZero {

    public static int temperature(int[]temps) {
        if (temps.length == 0) {
            throw new IllegalArgumentException("Invalid length");
        }
        int closest = temps[0];
        for (int i = 1; i < temps.length; i++) {
            closest = Math.min(Math.abs(closest), Math.abs(temps[i]));
              if(temps[i]< 0 && temps[i]== (-1*closest)){
               closest = temps[i];
           }
           if(Math.abs(temps[i])== Math.abs(closest)){
               closest = Math.max(closest, temps[i]);
           }


        }
        return closest;


    }
}
