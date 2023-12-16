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

        Scanner input = new Scanner(System.in);
        System.out.println("Hi welcome to trivia, what is your name?");
        String name = input.nextLine();
        System.out.println("Good luck " + name + ", your game is starting now!");
        game.fillArray();
        for (int i = 0; i < 12; i++){
            System.out.println(questionArray[i]);
            System.out.println("Enter answer:");
            String userAnswer = input.nextLine();

            game.answerCheck(userAnswer, i);
            System.out.println("Do you want to continue?");
            String continueGame = input.nextLine();
            game.continueCheck(continueGame);
            if (game.continueCheck(continueGame) == true){
                i += 0;
            }
            else{
                break;
            }



        }








    }
}
