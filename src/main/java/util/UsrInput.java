package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String readInput(String type) {
        System.out.format("Enter a %s: ", type);
        return input.nextLine();
    }

}
