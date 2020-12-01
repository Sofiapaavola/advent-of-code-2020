import java.util.ArrayList;
import java.util.List;


public class Day_1 {

    public static List<Integer> findTwoIntSumToTarget(int[] input, int target) {
        List<Integer> nums = new ArrayList<>(2);
        for(int i = 0; i < input.length; i++) {
            for(int j = i+1; j < input.length; j++) {
                if(input[i] + input[j] == target) {
                    nums.add(input[i]);
                    nums.add(input[j]);
                    return nums;
                }
            }
        }
        return nums;
    }

    public static List<Integer> findThreeIntSumToTarget(int[] input, int target) {
        List<Integer> nums = new ArrayList<>(2);
        for(int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                for (int k = i + 1; k < input.length; k++) {
                    if (input[i] + input[j] + input[k] == target) {
                        nums.add(input[i]);
                        nums.add(input[j]);
                        nums.add(input[k]);
                        return nums;
                    }
                }
            }
        }
        return nums;
    }

}
