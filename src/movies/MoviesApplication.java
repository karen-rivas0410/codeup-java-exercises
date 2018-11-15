package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {
    public static void movieApp() {
//        Scanner sc = new Scanner(System.in);
        Input input = new Input();
        boolean willRun = true;
        while (willRun) {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
        int num = input.getInt();
            Switch (num) {
            case 2:
                for (Movie movie : movieArray){
                    System.out.println(movie.getName);
                }


            }
        }
    }







    public static void main(String[] arg){
        System.out.println();
//        Give the user a list of options for viewing all the movies
//        or viewing movies by category.




    }
}
