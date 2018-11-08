import jdk.nashorn.api.tree.StatementTree;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        Loop Basics
//          While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//        5 6 7 8 9 10 11 12 13 14 15
//
//      ///ANSWER////
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");   //use the print not the println cause it will go on one line//
//            i++;
//        }

//          Do While
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 5;
//        } while (i <= 100);
//        Alter your loop to count backwards by 5's from 100 to -10.
//
//      ////ANSWER////
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);


//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less
//        than 1,000,000. Output should equal:
//        2 4 16 256 65536

        ////ANSWER////
//        long num = 2; ///changes to double
//        do {
//            System.out.println(num);
//            num *= num;
//        }while (num < 1000000L);

//        System.out.println(Integer.MAX_VALUE); //a good way to find out the max and min for a certain variable like integer//
        ///OPTION 2//
//        double num  = 2;
//        do {
//            int num2 = (int)num;
//            System.out.println(num2);
//            num *= num;
//        }while (num <= 1000000);

//        Refactor the previous two exercises to use a for loop instead

        ////ANSWER////

//        for(int i = 5; i <= 15; i += 1) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i <= 100; i += 5) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i <= 1000000L; i *= i) {
//            System.out.println(i);
//        }



//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

// for (int i = 1; i <= 100; i += 1) {
////     System.out.println(i);
//     if (i % 3 == 0 && i % 5 == 0) {
//         System.out.println("FizzBuzz");
//     }else if ( i % 3 == 0) {
//         System.out.println("Fizz");
//     }else if (i % 5 == 0){
//         System.out.print("buzz");
//     }else {
//         System.out.println(i);
//     }
// }

//        Display a table of powers.
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//       number | squared | cubed
//       ------ | ------- | -----
//       1      | 1       | 1
//       2      | 4       | 8
//       3      | 9       | 27
//       4      | 16      | 64
//       5      | 25      | 125

//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter an Integer: ");
//        int userInput = sc.nextInt();

//        System.out.println("Enter a number you would like to go up to: ");
//
//        int i, numLimit, square, cube;
//        Scanner input = new Scanner(System.in);
//        numLimit = input.nextInt();
//
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------- | -----");
//
//        for(i = 1; i <= numLimit; i++){
//            square = i * i;
//            cube = i * i * i;
//            System.out.printf(" %-5d | %-6d  | %d\n", i, square, cube);
//        }
//
//        System.out.println("Would you like to continue? ");
//        Scanner input2 = new Scanner(System.in);
//        String more = input2.nextLine();
//        if (more.equalsIgnoreCase("yes")) {
//            System.out.println("Good Stuff!");
//        } else {
//            System.out.println("Too bad!");
//        }


//        Convert given number grades into letter grades.
//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0

        Scanner sc = new Scanner(System.in);

        String ifContinue;
        do {
            System.out.print("Enter a Numerical grade from 0 to 100: ");
            int num = Integer.parseInt(sc.nextLine());
            if ((num <= 100) && (num > 88)) {
                System.out.println("A");
            } else if ((num <= 87) && (num >= 80)) {
                System.out.println("B");
            } else if ((num <= 79) && (num >= 67)) {
                System.out.println("C");
            } else if ((num <= 66) && (num >= 60)) {
                System.out.println("D");
            } else if ((num <= 59) && (num >= 0)) {
                System.out.println("F");
            } else {
                System.out.print("Not a Valid Input");
            }

            System.out.print("Would you like to continue?");
            ifContinue = sc.nextLine();
        }
        while (ifContinue.equalsIgnoreCase("No");{
            System.out.print("Word");
        }




//        OPTION TO RUN AS A SWITCH STATEMENT//CANNOT CONVERT A INT TO A BOOLEAN OR VICE-VERSA
//        switch (num) {
//            case (num <= 100) && (num > 88): {
//                System.out.print()
//            }
//        }


    }
}
