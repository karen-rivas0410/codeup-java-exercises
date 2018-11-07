import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f", pi);

        //different way as well using the format//
//        String piMessage = String.format("The value of pi is approx %.2f");
//        System.out.printf(piMessage);

//   This is the Output //The value of pi is approximately 3.14.

//        String name = "codeup";
//        System.out.format("Hello there, %s. Nice to see you.\n", name);


//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?
//            Nothing, it wont work
        Scanner sc = new Scanner(System.in);
//
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        System.out.println(userInput);
////        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
////        What happens if you enter less than 3 words?
////        What happens if you enter more than 3 words?
        System.out.print("Enter three words: ");
            String word1 = sc.next();
            String word2 = sc.next();
            String word3 = sc.next();
        System.out.printf("%s%n%s%n%s", word1, word2, word3);
        sc.nextLine();
////        Prompt a user to enter a sentence, then store that sentence in a String variable using the
////        .next method, then display that sentence back to the user.
////        do you capture all of the words?
////        Rewrite the above example using the .nextLine method.
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);
////        Prompt the user to enter values of length and width of a classroom at Codeup.
////        Use the .nextLine method to get user input and cast the resulting string to a numeric type.
////        Assume that the rooms are perfect rectangles.
////        Assume that the user will enter valid numeric data for length and width.
////        Display the area and perimeter of that classroom.
////        The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to
////        2 times the length plus 2 times the width.
////        Assume that the rooms are perfect rectangles.
////        Assume that the user will enter valid numeric data for length and width.
        System.out.print("Enter the length of the Classroom: ");
        int number1 = sc.nextInt(); ///rememeber that you can change a string to integer using the .parseInt
        int number2 = sc.nextInt();
        System.out.print("Enter the width of the Classroom: ");

//        BONUS //  need to change int to double to accept the decimal number//
//        System.out.print("Enter your first name : ")
//        String Answer = input.next();
//        System.out.println(Answer + " is your first name.");

    }
}
