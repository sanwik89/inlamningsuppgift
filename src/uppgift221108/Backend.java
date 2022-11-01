package uppgift221108;

import java.util.ArrayList;
import java.util.Objects;


public class Backend {

    private final ArrayList<String> wordCount = new ArrayList<>();
    private String longestWord;

    private boolean userStopped = false;

    private boolean stringSeparation(String inputFromUser) {
        String[] arr = inputFromUser.split("\\W+");
        boolean result = false;
        for (String ss : arr) {
            if (ss.equalsIgnoreCase("Stop")) {
                userStopped = true;
                wordCount.add(ss);
                result = false;
                break;
            } else if (arr.length < 2) {

                break;

            } else {
                if (longestWord == null) {
                    longestWord = ss;
                } else if (ss.length() > longestWord.length()) {
                    longestWord = ss;
                }
                wordCount.add(ss);
                result = true;

            }
        }
        return result;
    }

    public int getWordCount() {
        return wordCount.size();

    }

    //lägger till ord i wordCount samt kollar om ordet är det längsta och sparar isf detta.
    public void userInput(String inputFromUser) {
        if (stringSeparation(inputFromUser)) {
            //do nothing
        } else if (userStopped) {
            wordCount.remove(wordCount.size() - 1);

        } else if (longestWord == null || longestWord.length() < inputFromUser.length()) {
            longestWord = inputFromUser;
            wordCount.add(inputFromUser);
        } else {
            wordCount.add(inputFromUser);
        }


    }

    public ArrayList<String> accessWordCount() {
        return wordCount;
    }

    public boolean getUserStopped() {
        return userStopped;
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
