package util;

import java.util.Scanner;

public class InputTest {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in); //CREATING THE SCANNER OBJECT HERE BC
        Input in = new Input();
        System.out.println(in.getString());
    }
}