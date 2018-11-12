import java.util.Scanner;

public class HighLow {


    public static void main(String[] args) {

        highLowGame(randomNum());

    }

//    Game Development 101
//    Welcome to the world of game development!
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//    The specs for the game are:
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number
//    All user inputs are validated
//    If user's guess is less than the number, it outputs "HIGHER"
//    If user's guess is more than the number, it outputs "LOWER"
//    If a user guesses the number, the game should declare "GOOD GUESS!"

    public static int highLowGame(int random) {
        Scanner sc = new Scanner(System.in);
        int guess;
        int numOfTries = 0;
        boolean win = false;

        while (win == false) {
        System.out.print("Guess a number between 1 and 100: ");
        guess = sc.nextInt();
        numOfTries ++;
        if (guess < random) {
            System.out.println("Higher! ");
            return highLowGame(random);
        }else if (guess > random) {
            System.out.println("Lower ");
            return highLowGame(random);
        }else if (guess == random) {
            System.out.print("GOOD GUESS!!! YOU ARE PSYCHIC");
            win = true;
        }
        return 0;
        }
        return;
    }

    public static int randomNum () {
        int random = (int) (Math.random() * 100 + 1);
//        System.out.print(random);
        return random;

    }







}
