/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztime;

import java.util.Scanner;

/**
 * This class create a quiz with its question number and questions, and include
 * methods for adding question and giving the quiz.
 *
 * @author fuyun
 * @version 1.0
 * @since 17/09/2013
 */
public class Quiz {

    Question[] question;
    int maxComplexityLevel;
    int minComplexityLevel;
    int questionNumber;

    /**
     *
     * This variable keeps track of number of correct answers of the candidate
     */
    int correctAnswerNumber = 0;

    /**
     *
     * This variable keeps track of number of incorrect answers of the candidate
     */
    int incorrectAnswerNumber = 0;

    /**
     *
     * construct a Quiz;
     *
     * @param questionNumber number of questions in this quiz
     * @param question questions in this quiz
     */
    public Quiz(int questionNumber, Question[] question) {
        this.questionNumber = questionNumber;
        this.question = question;
    }

    /**
     *
     * add a question into the quiz
     *
     * @param q the question to be added
     * @param question the questions exist in this quiz
     */
    public void add(Question q, Question[] question) {
        question = new Question[question.length + 1];
        question[question.length] = q;
    }

    /**
     *
     * present all the questions in the quiz, record the answers of the
     * candidate, and give the final results
     */
    public void giveQuiz() {
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i].getQuestion() + "=");
            Scanner CandidateAnswer = new Scanner(System.in);
            String candidateAnswer = CandidateAnswer.nextLine();
            if (question[i].answerCorrect(candidateAnswer)) {
                correctAnswerNumber++;
            } else {
                incorrectAnswerNumber++;
            }
        }
        System.out.println("You have answered " + (correctAnswerNumber+incorrectAnswerNumber) + " questions.");
        System.out.println("You have answered " + correctAnswerNumber + " questions correctly.");
        System.out.println("You have answered " + incorrectAnswerNumber + " questions incorrectly.");
    }

    /**
     *
     * present all the questions with in the complexity levels, record the
     * answers of the candidate, and give the final results
     *
     * @param minComplexityLevel minimum complexity level of the questions in
     * the quiz
     * @param maxComplexityLevel maximum complexity level of the questions in
     * the quiz
     */
    public void giveQuiz(int minComplexityLevel, int maxComplexityLevel) {
        for (int i = 0; i < question.length; i++) {
            if (question[i].getComplexity() > minComplexityLevel - 1 && question[i].getComplexity() < maxComplexityLevel + 1) {
                System.out.println(question[i].getQuestion() + "=");
                Scanner CandidateAnswer = new Scanner(System.in);
                String candidateAnswer = CandidateAnswer.nextLine();
                if (question[i].answerCorrect(candidateAnswer)) {
                    correctAnswerNumber++;
                } else {
                    incorrectAnswerNumber++;
                }
            }
        }
        System.out.println("You have answered " + (correctAnswerNumber+incorrectAnswerNumber) + " questions.");
        System.out.println("You have answered " + correctAnswerNumber + " questions correctly.");
        System.out.println("You have answered " + incorrectAnswerNumber + " questions incorrectly.");
    }
}
