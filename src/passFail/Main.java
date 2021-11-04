package passFail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, phy, tur, che, mus;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mathematics result: ");
        math = inp.nextInt();

        System.out.print("Physics result: ");
        phy = inp.nextInt();

        System.out.print("Turkish result: ");
        tur = inp.nextInt();

        System.out.print("Chemistry result: ");
        che = inp.nextInt();

        System.out.print("Music result: ");
        mus = inp.nextInt();

        int[] results = {math, phy, tur, che, mus};
        double avgOfExams = average(results);
        if(avgOfExams<55) {
            System.out.println("You failed! Work harder please :)");
        }
        else {
            System.out.println("Well done! You passed. Keep up the good work!");
        }
        System.out.println("Your average: " + avgOfExams);
    }


    public static double average(int[] examResults) {
        double avg;
        double total = 0;
        int cnt=0;

        for (int number : examResults) {
            if (number>=0 && number<=100) {
               total += number;
               cnt += 1;
            }
            else {
                System.out.println("Invalid exam result!!! Exam result should be between 0 and 100!");
            }
        }
        if (total==0) {
            cnt=1;
        }
        avg = total / cnt;
        return avg;
    }

}

