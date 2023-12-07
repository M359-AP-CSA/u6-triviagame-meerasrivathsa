package lab;

public class Question {
        private String question;
        private String answerChoices;
        private String correctAnswer;
        private int pointValue;

        public Question(String question, String answerChoices, String correctAnswer, int pointValue) {
                this.question = question;
                this.answerChoices = answerChoices;
                this.correctAnswer = correctAnswer;
                this.pointValue = pointValue;
        }

        public String toString(){
                String str = "";
                str += question + "\n" + answerChoices + "\n" + correctAnswer + pointValue;
                return str;
        }




        public String getQuestion() {
                return question;
        }

        public void setQuestion(String question) {
                this.question = question;
        }

        public String getAnswerChoices() {
                return answerChoices;
        }

        public void setAnswerChoices(String answerChoices) {
                this.answerChoices = answerChoices;
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
