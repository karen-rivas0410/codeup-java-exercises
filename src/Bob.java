import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//   Create a class named Bob with a main method for the following exercise.
//   Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//   Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//   He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//   He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//   He answers 'Whatever.' to anything else.
//   Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner sc = new Scanner(System.in);
        String askMore;

    do {
        System.out.println("Ask Bob a damn Question?");
        String response = sc.nextLine();
        if (response.endsWith("?")) {
            System.out.println("Sure");
        }else if (response.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (response.equals("")) {
            System.out.println("Fine. Be that way!");
        }else {
            System.out.println("Whatever");
        }
        System.out.println("Hello, wanna ask me another ?????");
        askMore = sc.nextLine();

    }while (askMore.equalsIgnoreCase("yes")); 
        System.out.println("Goodbye");









    }
}
