package javatest
import java.util.Scanner;
public class tachso {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("nhap so ");
    int x = input.nextInt();
    if( 10000 <= x && x <= 99999) {
        int a = x % 10;
        int b = (x % 100) / 10;
        int c = (x / 100) % 10;
        int d = (x / 1000) % 10;
        int e = (x / 10000);
        System.out.printf("%d %d %d %d %d", e, d, c, b, a);
    }
    else {
        System.out.println("khong phai so co 5 chu so");       
    } 
    
    }
}
