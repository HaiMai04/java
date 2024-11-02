package javatest
import java.util.Scanner;
public class sum {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a");
        int a = input.nextInt();
        System.out.println("Nhap so b");
        int b = input.nextInt();
        int sum = a + b;
        System.out.printf("Tong cua 2 so la %d", sum);
    }
}
