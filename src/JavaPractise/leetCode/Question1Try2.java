package src.JavaPractise.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Question1Try2 {
    
    public static void  main (String[] args){


        long startTime = System.nanoTime();

         System.out.println("Result for target 9: " + Arrays.toString(sumTwoNumbers(new int[]{2, 7, 11, 15}, 9)));

         long endTime = System.nanoTime();
         long durationNano = (endTime - startTime);
        double durationMilli = durationNano / 1_000_000.0;
        
        System.out.println("\n--- Runtime Metrics ---");
        System.out.printf("Execution time: %.4f milliseconds%n", durationMilli);

    }


    public static int[] sumTwoNumbers(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], i);
        }
         for(int i = 0; i< nums.length; i++){
            int remainder = target - nums[i];
            map.put(nums[i], i);
              if (map.containsKey(remainder) && map.get(remainder) != i) {
                return new int[] { i, map.get(remainder) };
            }
        }


        return new int[]{};
    }
}
