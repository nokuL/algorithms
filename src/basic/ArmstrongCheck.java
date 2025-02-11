package basic;

public class ArmstrongCheck {

    public static boolean armStringCheck(int num){
        int sum = 0;
        int temp = num;
        int length = String.valueOf(num).length();
        while (temp>0){
            int remainder = temp % 10;
            sum+= Math.pow(remainder, length);
            temp = Math.abs(temp / 10);

        }
        return  sum == num;
    }
}
