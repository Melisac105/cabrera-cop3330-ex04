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
*/

import util.Output;
import util.UsrInput;

public class MadLibApp {

    public static void main(String[] args) {
        String noun = UsrInput.readInput("noun");
        String verb = UsrInput.readInput("verb");
        String adjective = UsrInput.readInput("adjective");
        String adverb = UsrInput.readInput("adverb");

        Output.printOutput(noun, verb, adjective, adverb);
    }
}
