package lab;

public class Question {
        // like Course Class
        // all data related to ONE question
        // private vars
        // constructor
        //get/set
        /// toString
        // and more
        private String question;
        private String answerOne;
        private String answerTwo;
        private String answerThree;
        private String answerFour;
        private String correctAnswer;
        private int pointValue;

        public Question(String question, String answerOne, String answerTwo, String answerThree, String answerFour, String correctAnswer, int pointValue) {
                this.question = question;
                this.answerOne = answerOne;
                this.answerTwo = answerTwo;
                this.answerThree = answerThree;
                this.answerFour = answerFour;
               this.correctAnswer = correctAnswer;
                this.pointValue = pointValue;
        }

        public String toString(){
                String str = "";
                str += question + "\n" + answerOne + "\n" + answerTwo + "\n"+ answerThree + "\n" + answerFour + "\n" + correctAnswer + "\n" + pointValue;
                return str;
        }


        public String getQuestion() {
                return question;
        }

        public void setQuestion(String question) {
                this.question = question;
        }

        public String getAnswerOne() {
                return answerOne;
        }

        public void setAnswerOne(String answerOne) {
                this.answerOne = answerOne;
        }

        public String getAnswerTwo() {
                return answerTwo;
        }

        public void setAnswerTwo(String answerTwo) {
                this.answerTwo = answerTwo;
        }

        public String getAnswerThree() {
                return answerThree;
        }

        public void setAnswerThree(String answerThree) {
                this.answerThree = answerThree;
        }

        public String getAnswerFour() {
                return answerFour;
        }

        public void setAnswerFour(String answerFour) {
                this.answerFour = answerFour;
        }

        public String getCorrectAnswer() {
                return correctAnswer;
        }

        public void setCorrectAnswer(String correctAnswer) {
                this.correctAnswer = correctAnswer;
        }

        public int getPointValue() {
                return pointValue;
        }

        public void setPointValue(int pointValue) {
                this.pointValue = pointValue;
        }
}
