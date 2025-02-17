package arrays;

public class MaximumProfit {

    public static int maxProfit(int [] array){
        //given an arry
        //use two pinters, left and right
        //while right < prices.length element, if left price is less than right price
        //calculate profit
        //compare with currProfit and set the largest
        //else (if right is smaller than left)  left = right , because we have found a new low number
        //increment right


        int currProfit = 0;
        int left = 0;
        int right = 1;
        while (right < array.length){
            if(array[left] < array[right]){
                int profit = array[right] - array[left];
                currProfit = Math.max(currProfit, profit);
            }
            right ++;
        }

        return currProfit;

    }
}
