/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztime;

import java.util.Scanner;

/**
 *
 * This class populates the quiz, presents it, and print the final results.
 *
 * @author yunfu
 * @version 1.0
 * @since 17/09/2013
 */
public class QuizTime {

    /**
     * This method populates the quiz, presents it, and print the final results.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Question[] question = new Question[]{
            new Question("1+1", "2", 1),
            new Question("2+2", "4", 1),
            new Question("3+3", "6", 1),
            new Question("4+4", "8", 1),
            new Question("5+5", "10", 1),
            new Question("1-1", "0", 2),
            new Question("2-1", "1", 2),
            new Question("3-1", "2", 2),
            new Question("4-1", "3", 2),
            new Question("5-1", "4", 2),
            new Question("1*1", "1", 3),
            new Question("2*2", "4", 3),
            new Question("3*3", "9", 3),
            new Question("4*4", "16", 3),
            new Question("5*5", "25", 3),
            new Question("1/1", "1", 4),
            new Question("2/1", "2", 4),
            new Question("3/1", "3", 4),
            new Question("4/2", "2", 4),
            new Question("5/5", "1", 4),
            new Question("1*2*3", "6", 5),
            new Question("2*3*4", "24", 5),
            new Question("3*4*5", "60", 5),
            new Question("4*5*6", "120", 5),
            new Question("5*6*7", "210", 5)};

        Quiz quiz = new Quiz(question.length, question);

        System.out.println("Do you want to set the complexity level of the quiz? (Please enter yes or no)");
        Scanner SetOrNot = new Scanner(System.in);
        String setOrNot = SetOrNot.nextLine();

        if (setOrNot.equals("Yes") | setOrNot.equals("YES") | setOrNot.equals("yes")) {
            do {
                System.out.println("Enter the maximum complexity level. (from 1 level to 5 level)");
                Scanner MaxLevel = new Scanner(System.in);
                String maxLevel = MaxLevel.nextLine();
                int max = Integer.parseInt(maxLevel);

                System.out.println("Enter the minimum complexity level. (from 1 level to 5 level)");
                Scanner MinLevel = new Scanner(System.in);
                String minLevel = MinLevel.nextLine();
                int min = Integer.parseInt(minLevel);

                if (max == 1 | max == 2 | max == 3 | max == 4 | max == 5 & min == 1 | min == 2 | min == 3 | min == 4 | min == 5 && max > min) {
                    System.out.println("Set the complexity level successfully.");
                    quiz.giveQuiz(min, max);
                    break;
                } else {
                    System.out.println("Enter the complexity level again.");
                }

            } while (true);
        }

        if (setOrNot.equals("No") | setOrNot.equals("NO") | setOrNot.equals("no")) {
            System.out.println("Here are all of the questions in the quiz.");
            quiz.giveQuiz();
        }
    }
}
