package sortingNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = inp.nextInt();

        System.out.print("Enter second number: ");
        b = inp.nextInt();

        System.out.print("Enter third number: ");
        c = inp.nextInt();

        System.out.println("---Ascending sort--- ");

        if ((a <= b) && (a <= c)) {
            if (b < c) {
                System.out.println(a + " / " + b + " / " + c);
            }
            else {
                System.out.println(a + " / " + c + " / " + b);
            }
        }
        else if ((b <= a) && (b <= c)) {
            if (a < c) {
                System.out.println(b + " / " + a + " / " + c);
            }
            else {
                System.out.println(b + " / " + c + " / " + a);
            }
        }
        else {
            if (a < b) {
                System.out.println(c + " / " + a + "/ " + b);
            }
            else {
                System.out.println(c + " / " + b + " / " + a);
            }
        }
    }
}
