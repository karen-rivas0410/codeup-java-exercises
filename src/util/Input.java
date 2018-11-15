package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input() {
        this.scanner = scanner;  //this is the second way to do it, passing scanner in here and creating a new object for scanner in main method.
//        this.scanner = new Scanner(System.in);  ///do the other way bc you are using less memory and data///
    }
    public Scanner getScanner() {
        return this.scanner;
    }
    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }


     public String getString() {
        System.out.println("Enter a String: ");
        return this.scanner.nextLine();
     }

//     public boolean yesNo() {
        String userInput = getString();
//        if (this.scanner.equals("y")) {
//            System.out.println("Yes");
//        }else if (this.scanner.equals("n"))
//         return this.scanner.nextLine();
//     }
//
//     public int getInt(int min, int max) {
//        return
//     }
     public int getInt() {

     }
//
//     double getDouble(double min, double max) {
//
//     }
//    public double getDouble() {
//        retturn this.scanner.
//    }
//
}
