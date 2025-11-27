package src.JavaPractise.leetCode;

public class ValidParentheses {


    public static void main(String[] args) {
        
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Valid Parentheses");
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String value = "()";

        int valuelength = value.length();

        if(valuelength % 2 != 0 || String.valueOf(value.charAt(0)).equals(")") || String.valueOf(value.charAt(0)).equals("}") || String.valueOf(value.charAt(0)).equals("]")){
            System.out.println("FALSE");
        }else {
            

        }


    }
}
