import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContainerWithMostWater {

    public static int containerWithMostWater(int[]height) {
        int maxArea = 0;
        int firstPointer = 0;
        int secondPointer = height.length - 1;

        if(!isValidHeight(height)){
            throw new IllegalArgumentException("Invalid array height here ");
        }
        if(checkInvalidElements(height)< height.length){
            throw new IllegalArgumentException("Found invalid elements");
        }

        while (firstPointer < secondPointer) {
            if(height[firstPointer] < height[secondPointer]) {
                maxArea = Math.max(maxArea, height[firstPointer] * (secondPointer - firstPointer));
                firstPointer++;
            }else{
                maxArea = Math.max(maxArea , height[secondPointer] * (secondPointer - firstPointer));
                secondPointer--;
            }
        }
        return maxArea;
    }

    private static boolean isValidHeight(int[]height){
        return height.length >=2 && height.length < Math.pow(10, 4);
    }

    private static int checkInvalidElements(int[]height){
        List<Integer> list = Arrays.stream(height).boxed().collect(Collectors.toList());
        return (int)list.stream().filter(num-> num < Math.pow(10, 4)).count();
    }
}
