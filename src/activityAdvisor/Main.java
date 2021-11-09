package activityAdvisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp; //temperature

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temperature value. Thank you : ");
        temp = input.nextInt();

        while ( temp<5) {
            System.out.println("Let's go skiing!");
            break;
        }

        while (temp>=5 && temp <15) {
            System.out.println("Let's catch a movie!");
            break;
        }

        while (temp>=15 && temp <25) {
            System.out.println("Let's have a picnic!");
            break;
        }

        while (temp>=25) {
            System.out.println("Let's go swimming!");
            break;
        }

    }
}
