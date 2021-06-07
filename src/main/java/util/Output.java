package util;

public class Output {

    static public void printOutput(String noun1, String verb1, String adjective1, String adverb1) {
        System.out.format("My %s %s has a friend that %s %s\n", adjective1, noun1, verb1, adverb1);
    }
}
