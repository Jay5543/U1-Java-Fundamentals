public class L3 {

    //add the main method header below.

    /*
    Literal a Value that was written in the code
    An expression is a value using veriables or operators

    A magic number is a magic value that doesnt relate to the program or solution
    Try to avoid MAGIC numbers
     */
    //add the main method header below.

    public static void main(String[] args) {
        int literalValue = 5;
        int expression = 5+6;
        int expression2 = literalValue + 6;
        int expression3 = literalValue + literalValue;

        //Example of Literal Values
        double literalValue2 = 26.4;
        boolean literalValue3 = false;
        String literalValue4 = "people";

        //Examole of Expression - the result of the expresion must matchg the data type
        double expression4 = 2.4+3.3;
        boolean expression5 = 5>6;

       // int badExample = 5.4-0.4;

        //String expression is called String CONCATENATION. you can combine strings using the + sign

        String expression6 = "A full house full of " + literalValue4;
                System.out.println(expression6);




                String message1 = "The store has ";
                String message2 = " apples in stock.";
                int numApples = 20;

                System.out.println("The store has 20 apples in stock.");
                System.out.println("The store has " + numApples + " apples in stock");
                System.out.println(message1 + numApples + message2);


    }
}
