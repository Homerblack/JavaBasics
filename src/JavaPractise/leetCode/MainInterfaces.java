package src.JavaPractise.leetCode;

public class MainInterfaces {
    
    public String star = "***********************************************************************************";
    public String hifun = "-----------------------------------------------------------------------------------";


    

    //check id the given integer is Palindrome or not  
    public  boolean isPalindrome(int x){

        ////check if the given number is less than 0 is less then zero return false 
        if (x < 0) {
            return false;
        }

        int reversed = 0;

        ////while loop until the given number becoms 0  
        while (x != 0) {
            /////digit is the reminder of the number 
            int digit = x % 10;

            /////digit is the reminder of the number 
            reversed = reversed * 10 + digit;
            x/=10;
        }


        return x == reversed;
    }
}
