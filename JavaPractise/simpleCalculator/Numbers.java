package JavaPractise.simpleCalculator;

public class Numbers {

    ///this is the item for the class 
    /// 
    private String operator;
    private int number1;
    private int number2;

    Numbers(String operator, int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    // getter for operator
    public String getOperator() {
        return operator;
    }

    // setter for operator

    public void setOperator(String operator) {
        this.operator = operator;
    }

    // getter for number1
    public int getNumber1() {
        return number1;
    }

    // setter for number2
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    // getter for number1
    public int getNumber2() {
        return number2;
    }

    // setter for number 2
    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int calculate(String operator, int number1, int number2) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "/":
                return number1 / number2;
            case "*":
                return number1 * number2;
            default:
                return 0;
        }

    }

   
}


    