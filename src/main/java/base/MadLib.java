/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 Melissa Cabrera

Exercise 4 - Mad Lib
Mad libs are a simple game where you create a story template with blanks for words. You, or another player, then construct a list of words and place them into the story, creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb, and an adjective and injects those into a story that you create.

Example Output

Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints

Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.

Challenges

Add more inputs to the program to expand the story.
Implement a branching story, where the answers to questions determine how the story is constructed.
*/

package base;

import java.util.Scanner;

public class MadLib {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MadLib myGame = new MadLib();

        String noun = myGame.nounInput();
        String verb = myGame.verbInput();
        String adjective = myGame.adjectiveInput();
        String adverb = myGame.adverbInput();
        myGame.output(noun, verb, adjective, adverb);
    }

    public String nounInput() {
        System.out.print("Enter a noun: ");
        return input.nextLine();
    }

    public String verbInput() {
        System.out.print("Enter a verb: ");
        return input.nextLine();
    }

    public String adjectiveInput() {
        System.out.print("Enter a adjective: ");
        return input.nextLine();
    }

    public String adverbInput() {
        System.out.print("Enter a adverb: ");
        return input.nextLine();
    }

    public void output(String noun1, String verb1, String adjective1, String adverb1) {
        System.out.println(String.format("My %s %s has a friend that %s %s\n", adjective1, noun1, verb1, adverb1));
    }
}
