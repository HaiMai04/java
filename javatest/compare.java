package javatest
import java.util.Scanner;
public class compare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = input.nextInt();
        System.out.println("Nhap so b");
        int b = input.nextInt();
        if ( a == b) {
            System.out.printf("%d == %d\n", a, b);
        }
        else {
            System.out.printf("%d != %d\n", a, b);
        }
        if ( a > b) {
            System.out.printf("%d > %d\n", a, b);
        }
        else {
            System.out.printf("%d <= %d\n", a, b);
        }
        if (a >= b) {
            System.out.printf("%d >= %d\n", a, b);
        }
        else {
            System.out.printf("%d < %d\n", a, b);
        }
    }
}
