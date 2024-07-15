package arrays.moveZerosToEnd;

public class MoveZerosTestData {

    public static int [] getValidArray(){
        return new int[] {4,0, 0, 3, 4};
    }

    public static int[] getInvalidArray(){
        return null;
    }

    public static int[] getArrayWithInvalidNum(){
        return new int[]{1, 2, 3, 400};
    }
    public static int[]getArrayWithOneNum(){
        return new int[]{1};
    }

    public static int [] getArrayWithoutZeros(){
        return new int[]{1, 2, 3};
    }
}
