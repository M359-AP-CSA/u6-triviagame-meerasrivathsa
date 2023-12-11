package lab;
import java.util.Scanner;
import java.io.*;

public class TriviaGame {
    // this class is like a Student class
    // all variables related to one game
    // ex. score, array of Questions objects
    // need a constructor
    // need a method that will open the text file, read all the data for one question,
    // add the question to the array, repeat until all questions are read

    public static Question[] questionArray;
    private int currentScore = 0;

    public TriviaGame(){
        this.questionArray = new Question[12];

    }
    public void readData() throws IOException, FileNotFoundException {

        Scanner inF = new Scanner (new File("questions.txt"));
        String question = inF.nextLine();
        String answerOne = inF.nextLine();
        String answerTwo = inF.nextLine();
        String answerThree = inF.nextLine();
        String answerFour = inF.nextLine();
        String correctAnswer = inF.nextLine();
        int pointValue = inF.nextInt();

        Question FirstQuestion = new Question(question, answerOne, answerTwo, answerThree, answerFour, correctAnswer, pointValue);
        System.out.println(FirstQuestion);
    }
    public void fillArray() throws IOException, FileNotFoundException{
        for (int i = 0; i < 12; i++){
            Scanner questionScanner = new Scanner(new File("questions.txt"));
            String question = questionScanner.nextLine();
            String answerOne = questionScanner.nextLine();
            String answerTwo = questionScanner.nextLine();
            String answerThree = questionScanner.nextLine();
            String answerFour = questionScanner.nextLine();
            String correctAnswer = questionScanner.nextLine();
            int pointValue = questionScanner.nextInt();
            if (questionScanner.hasNextLine()){
                questionScanner.nextLine();
            }
        }
    }
    public void printQuestions() throws IOException, FileNotFoundException{
        System.out.println(questionArray);
    }





}
