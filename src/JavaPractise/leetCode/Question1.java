package src.JavaPractise.leetCode;

import java.util.Arrays;

public class Question1 {


    public static void main(String[] args){
        long startTime = System.nanoTime();

         System.out.println("Result for target 9: " + Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

         long endTime = System.nanoTime();
         long durationNano = (endTime - startTime);
        double durationMilli = durationNano / 1_000_000.0;
        
        System.out.println("\n--- Runtime Metrics ---");
        System.out.printf("Execution time: %.4f milliseconds%n", durationMilli);
     
}

 public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i< nums.length; i++){
            
            for(int j = 1; j< nums.length; j++){
                if(nums[i]+nums[j] == target){
                   int[] result = new int[]{i, j};
                    return result;
                }              
            }
           
        }
         return new int[] {};
    }
}
