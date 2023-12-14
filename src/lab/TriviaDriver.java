package lab;
import java.util.Scanner;
import java.io.*;

import static lab.TriviaGame.questionArray;

public class TriviaDriver {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        // create a TriviaGame variable
        // Ex. TriviaGame game = newTriviaGame();
        // game.readData(); <-- fill in all data
        TriviaGame game = new TriviaGame();

        game.fillArray();


    }
}
0