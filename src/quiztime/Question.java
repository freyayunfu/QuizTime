/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztime;

/**
 * This class create a question with its question, answer, complexityLevel, and
 * include methods for getting question, getting answer, getting
 * complexityLevel, setting complexityLevel, checking whether the candidate
 * answer matches the answer.
 *
 * @author fuyun
 * @version 1.0
 * @since 17/09/2013
 */
public class Question {

    private String question, answer;
    private int complexityLevel;

    /**
     *
     * construct a Question;
     *
     * @param query query of the question
     * @param result answer of the question
     * @param complexityLevel complexityLevel of the question
     *
     */
    public Question(String query, String result, int complexityLevel) {
        question = query;
        answer = result;
        this.complexityLevel = complexityLevel;
    }

    /**
     *
     * set complexityLevel of the question
     *
     * @param level complexityLevel
     */
    public void setComplexity(int level) {
        complexityLevel = level;
    }

    /**
     *
     * get complexityLevel of the question
     *
     * @return complexityLevel
     */
    public int getComplexity() {
        return complexityLevel;
    }

    /**
     *
     * get the question
     *
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     *
     * get the answer of question
     *
     * @return answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     *
     * judge whether the candidate answered correctly
     *
     * @param candidateAnswer answer of the candidate
     * @return true if the candidate answer matches the answer, otherwise false
     */
    public boolean answerCorrect(String candidateAnswer) {
        return answer.equals(candidateAnswer);
    }

    /**
     *
     * get the question (and its answer)
     *
     * @return this question (and its answer) as a string.
     */
    @Override
    public String toString() {
        return question + "\n" + answer;
    }
}
