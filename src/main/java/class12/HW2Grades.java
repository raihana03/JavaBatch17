package class12;

public class HW2Grades {
        /*
        Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A, score >80 - B, score >70 - C, score > 50 - D, anything else - F
         */
    int getGrade(int score) {
        if (score > 90) {
            System.out.println("Your grade is an A");
        } else if (score > 80 && score < 90) {
            System.out.println("Your grade is an B");
        } else if (score > 70 && score < 80) {
            System.out.println("Your grade is an C");
        } else if (score > 60 && score < 70) {
            System.out.println("Your grade is an D");
        } else {
            System.out.println("Your grade is an F");
        }
        return score;
    }}
