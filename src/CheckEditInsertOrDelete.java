public class CheckEditInsertOrDelete {

    public static boolean countChanges(String firstString , String secondString){
        int count = 0;
        char [] firstArray = firstString.toCharArray();
        char [] secondArray = secondString.toCharArray();


        //for removed element
        if(secondArray.length < firstArray.length){
            for (int i = 0 ; i < secondArray.length; i++ ){
                if(secondArray[i] != firstArray[i]){
                    count++;
                }
            }
            //for added element
        } else if (secondArray.length > firstArray.length) {
            for (int i = 0; i< firstArray.length; i++){
                if(firstArray[i] != secondArray[i]){
                    count++;
                }
            }
            
        } else {
            for(int i =0; i< firstArray.length ; i++){
                if(firstArray[i]!= secondArray[i]){
                    count++;
                }
            }

        }

        return  0 <= count && count <=1;

    }
}
