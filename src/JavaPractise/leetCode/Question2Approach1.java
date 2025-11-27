package src.JavaPractise.leetCode;

public class Question2Approach1 {

    public static void main(String[] args) {
    
int tar = Integer.MAX_VALUE - 5;

int par = tar/10;



System.out.println(par);

System.out.println(isPalindrome( 10));
        
    }

     public static boolean isPalindrome(int x) {
        
        int reverse = 0;
        int temp = Math.abs(x);

        while(temp != 0) {
            reverse = (reverse * 10 ) + (temp % 10);
            temp = temp/10;
            

        }
        System.out.println(reverse);
        System.out.println(x);
    if(reverse == x){
        return true;
    }else {
        return false;
    }
    
    }
};
