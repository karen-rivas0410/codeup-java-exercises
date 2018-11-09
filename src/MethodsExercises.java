public class MethodsExercises {

    public static void main(String[] args) {
//        Basic Arithmetic
//        Create four separate methods. Each will perform an arithmetic operation:
//        Each function needs to take two parameters/arguments so that the operation can be performed.
//        Test your functions and verify the output.
//        Add a modulus function that finds the modulus of two numbers.
//        System.out.print(returnAdd(4));
//        System.out.print(returnSub(6));
//        System.out.print(returnDiv(6));
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
    }

//        Addition
        public static int returnAdd(int num) {
            return num + num;
        }
//        Subtraction
        public static int returnSub(int num) {
            return num - 1;
        }
//        Multiplication
        public static int returnMult(int num) {
            return num * num;
        }
//        Division
        public static int returnDiv(int num) {  //cannot divide by zero ERROR////
            return num / 0;
        }

//    Create a method that validates that user input is in a certain range
//    The method signature should look like this:
        public static int getInteger(int min, int max);
//    and is used like this:





}
