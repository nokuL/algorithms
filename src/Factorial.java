public class Factorial {

    public static int factorial(int number){
        //e.g 3! = 1*2*3
        //2! = 1*2
        //1! = 1
        //fact(n-1)*n

        if(number==0){
            return 1;
        }else{
            return factorial(number -1)* number;
        }


    }
}
