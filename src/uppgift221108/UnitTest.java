package uppgift221108;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class UnitTest {
    @Test
    public void wordCountCheck() {

        //Assemble

        Backend be = new Backend();
        be.userInput("test");
        be.userInput("test2");


        int expected;
        expected = 2;

        //Act
        int actual;
        actual = be.getWordCount();

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void printWordCheck() {

        //Assemble

        Backend be = new Backend();
        be.userInput("test");
        be.userInput("test2");
        be.userInput("stop");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("test");
        expected.add("test2");


        //Act
        ArrayList<String> actual;
        actual = be.wordCount;

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void saveLongestWord() {

        //Assemble

        Backend be = new Backend();
        be.userInput("test");
        be.userInput("test2");
        be.userInput("thelongestword");

        String expected = "thelongestword";


        //Act
        String actual;
        actual = be.getLongestWord();

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void printCharacterCount() {

        //Assemble

        Backend be = new Backend();
        be.userInput("test");
        be.userInput("test2");


        int expected = 9;


        //Act
        int actual;
        actual = be.getCharCount();

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void dontSaveStopInput() {

        //Assemble
        Backend be = new Backend();
        be.userInput("test");
        be.userInput("test2");
        be.userInput("stop");


        ArrayList<String> expected = new ArrayList<>();
        expected.add("test");
        expected.add("test2");


        //Act
        ArrayList<String> actual;
        actual = be.wordCount;


        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void firstInputStop() {

        //Assemble
        Backend be = new Backend();
        be.userInput("stop");


        ArrayList<String> expected = new ArrayList<>();


        //Act
        ArrayList<String> actual;
        actual = be.wordCount;


        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void StopLongestWord() {

        //Assemble
        Backend be = new Backend();
        be.userInput("stop");

        String expected = "You didn't enter a word that registered yet!";

        //Act
        String actual;
        actual = be.getLongestWord();


        //Assert
        Assertions.assertEquals(expected, actual);

    }


}
