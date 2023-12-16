package lab;
import java.util.Scanner;
import java.io.*;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class TriviaGame {
    // this class is like a Student class
    // all variables related to one game
    // ex. score, array of Questions objects
    // need a constructor
    // need a method that will open the text file, read all the data for one question,
    // add the question to the array, repeat until all questions are read

    public static Question[] questionArray;
    private int currentScore = 0;
    private int currentCorrectAnswers = 0;
    private int currentIncorrectAnswers = 0;
    private int currentStreak = 0;
    public static int i = 0;
    private int currentPoints;
    private double correctPercentage;



    public TriviaGame(){
        this.questionArray = new Question[12];

    }
    public <questionArray> void fillArray() throws IOException, FileNotFoundException{
        Scanner questionScanner = new Scanner(new File("questions.txt"));

        for (int i = 0; i < 12; i++){
            String question = questionScanner.nextLine();
            String answerOne = questionScanner.nextLine();
            String answerTwo = questionScanner.nextLine();
            String answerThree = questionScanner.nextLine();
            String answerFour = questionScanner.nextLine();
            String correctAnswer = questionScanner.nextLine();
            int pointValue = questionScanner.nextInt();
            if (questionScanner.hasNextLine()) {
                questionScanner.nextLine();
            }

            Question newQuestion = new Question(question, answerOne, answerTwo, answerThree, answerFour, correctAnswer, pointValue);

            questionArray[i] = newQuestion;
           List<Question> list = new ArrayList<>(Arrays.asList(questionArray));
            Collections.shuffle(list);
            questionArray = list.toArray(new Question[0]);
        }



    }
    //public static void shuffleQuestions(){




    public void answerCheck(String userAnswer, int i){
        if(userAnswer.equalsIgnoreCase(questionArray[i].getCorrectAnswer())){
            System.out.println("That is the right answer!");
            currentScore+= 10;
            currentCorrectAnswers++;
            currentStreak++;
            currentPoints = currentCorrectAnswers * 10;




        }
        else {
            System.out.println("That is not correct");
            currentIncorrectAnswers++;
            currentStreak = 0;
            currentPoints = currentCorrectAnswers * 10;
        }

        System.out.println("Current Score: " + currentScore);
        System.out.println("Correct Answers: " + currentCorrectAnswers);
        System.out.println("Incorrect Answers: " + currentIncorrectAnswers);
        System.out.println("Current Answer Streak: " + currentStreak);
        System.out.println("\n");
    }
    public boolean continueCheck(String continueGame){
        if (continueGame.equalsIgnoreCase("yes")){
            return true;
        }
        else{

            System.out.println("Final Game Stats:" + "\n" + "Total Points Earned: " + currentPoints + "\n" + "Points Gained " + currentCorrectAnswers +
                    "\n" + "Points Lost: " + currentIncorrectAnswers + "\n" + "Percent of correct answers:" + correctPercentage);
            return false;

        }
    }







}
