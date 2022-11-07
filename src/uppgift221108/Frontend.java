package uppgift221108;


import java.util.Scanner;

public class Frontend {
    static Backend be = new Backend();
    static Frontend fe = new Frontend();
    Scanner sc = new Scanner(System.in);
    String userInput;


    public void printWords() {
        for (int i = 0; i < be.accessWordCount().size(); i++) {
            System.out.print(be.accessWordCount().get(i) + " ");
        }
    }

    public void askForInput() {

        System.out.println("**TO END THE PROGRAM WRITE \"STOP\" and hit enter");
        System.out.println("Enter a word / Sentence");
        fe.userInput = sc.nextLine();
        be.userInput(fe.userInput);

    }

    public static void main(String[] args) {
        fe.askForInput();
        //körs så länge användaren inte skriver ordet stop.
        while (!be.getUserStopped()) {
            fe.askForInput();
        }

        System.out.println("You wrote the following words: ");
        fe.printWords();
        System.out.println("\n\nWhich is a total of " + be.getCharCount() + " characters!");
        System.out.println("The longest word you wrote was: ");
        System.out.println(be.getLongestWord());
        System.out.println("You wrote a total of: " + be.getWordCount() + " words!");
        System.out.println("You did so in: " + be.getRows() + " rows!");

    }


}
