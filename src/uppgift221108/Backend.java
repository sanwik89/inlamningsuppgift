package uppgift221108;

import java.util.ArrayList;
import java.util.Objects;


public class Backend {

    ArrayList<String> wordCount = new ArrayList<>();
    String longestWord;

    public int getWordCount() {
        return wordCount.size();

    }

    //lägger till ord i wordCount samt kollar om ordet är det längsta och sprar isf detta.
    public void userInput(String inputFromUser) {
        wordCount.add(inputFromUser);

        if (inputFromUser.equalsIgnoreCase("stop")) {
            wordCount.remove(wordCount.size() - 1);
        } else if (longestWord == null) {
            longestWord = inputFromUser;
        } else if (inputFromUser.length() > longestWord.length()) {
            longestWord = inputFromUser;
        }

    }


    //hämtar det längsta ordet
    public String getLongestWord() {
        return Objects.requireNonNullElse(longestWord, "You didn't enter a word that registered yet!");
    }

    //returnerar antalet bokstäver i alla de ord som finns i wordCount
    public int getCharCount() {
        int result = 0;
        for (String s : wordCount) {
            result += s.length();
        }
        return result;
    }
}