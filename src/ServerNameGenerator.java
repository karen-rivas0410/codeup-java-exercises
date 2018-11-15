import java.util.Random;
import java.util.Scanner;

public class ServerNameGenerator {
//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the
//    combination and display the generated name to the user.

   private static String adj[] = {"angry", "bewildered", "clumsy", "defeated", "embarrassed", "fierce", "grumpy", "helpless", "itchy", "jealous"};

   private static String noun[] = {"Bees", "Apes", "Buffalo", "Donkeys", "Elk", "Jellyfish", "Leopards", "Lemurs", "Moles", "Turkeys"};

   private static String getRandomArr(String[] array) {
       String random = (array[new Random().nextInt(array.length)]);
//           String random = array(Math.random(array.length));
       return random;

   }

        public static int getRandom(int[] array) {
                int rnd = new Random().nextInt(array.length);
                return array[rnd];
        }


   public static String getNewArray(String[] array1, String[] array2) {
           String input1 = getRandomArr(array1);
           String input2 = getRandomArr(array2);
           String newString = input1 + input2;
           return newString;
   }

    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here is your server name: \n ");
        getNewArray(adj, noun);
        System.out.println(adj.length);
        System.out.println(noun.length);




    }
}
