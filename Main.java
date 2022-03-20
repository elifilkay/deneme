import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static int studentCounter = 0;

    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);

                ArrayList<Integer> grades = new ArrayList<Integer>();

                boolean loopCheck = true;

                int minValue = 101;
                int maxValue = -1;
                int sum = 0;
                double avarage = 0;

                System.out.println("Welcome to grade calculation program...");

                while(true) {

                    System.out.println("Please enter the grade of the student:(if you want to leave please press -1) ");
                    int inputGrade = scanner.nextInt();

                    if (inputGrade == -1) {
                        System.out.println("Leaving....");
                        System.out.println(studentCounter + " is the amount of the grades which you entered");
                        break;
                    }

                    else if (inputGrade <= 100 && 0 <= inputGrade) {



                        grades.add(inputGrade);

                        studentCounter++;
                    }

                    else {
                        System.out.println("Invalid grade. Grades must be on interval from 0 to 100");
                        System.out.println("*****************");
                        continue;
                    }

                }

                if (!grades.isEmpty()) {

                    for (Integer a: grades) {


                        sum += a;

                        if (minValue > a) {
                            minValue = a;
                        }

                        if (maxValue < a) {
                            maxValue = a;
                        }


                    }

                    avarage = (double)sum/studentCounter;

                    System.out.println("Avarage is : " + avarage);
                    System.out.println("Max grade is : " + maxValue);
                    System.out.println("Min grade is: " + minValue);

                }



    }
}
