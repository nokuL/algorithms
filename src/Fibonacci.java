public class Fibonacci {

    public static int fibonacci(int n){
        //0 1 1 2 3 5
        //base case
        if(n == 0){
            return 0;
        }
        if(n == 1){
           // System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+n);
            return 1;
        }
        return fibonacci(n-2) + fibonacci(n-1);
    }
}
