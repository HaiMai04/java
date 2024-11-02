package javatest;
import java.util.Scanner;

public class product3in {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = input.nextInt();
        System.out.println("Nhap so b");
        int b = input.nextInt();
        System.out.println("Nhap so c");
        int c = input.nextInt();
        System.out.printf("Product is: %d", a * b * c);
    }   
        }

