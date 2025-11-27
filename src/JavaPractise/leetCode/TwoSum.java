package src.JavaPractise.leetCode;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        
        String star = "***********************************************************************************";
        String hifun = "-----------------------------------------------------------------------------------";


        ///athis is to print 
        System.out.println(star);
        System.out.println("System to print Two sum");
        System.out.println(star);
    
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(hifun);

        int[] result = sumTwo(nums, target);

        for (int i : result) {
            System.out.println(i);
        }
        System.out.println(hifun);

    }


//// i checked 3 test and it was all fine 
    public static int[] twoSum(int[] nums, int target ){

        if (nums.length < 0){
            return null;
        }

        int[] answer = new int[2];

        for(int i = 0;i < nums.length; i++){
            for(int j = i+1; j < nums.length ;j++){
                if(nums[i]+nums[j] == target){
                     answer[0] = i ;
                     answer[1] = j ;
                     return answer;
                }

            }
        }

        return answer;
    }


////here isthe map verison 

    public static int[] sumTwo(int[] nums, int target){

         int[] answer = new int[2];

         HashMap<Integer,Integer> map = new HashMap<>();

         for(int i = 0;i < nums.length; i++){
            int remaining = target - nums[i];

            if (map.containsKey(remaining)) {
                return new int[] {
                    map.get(remaining),i
                };

            }

            map.put(nums[i], i);

         }
        return answer;
    }

}
