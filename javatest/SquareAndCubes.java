package javatest;

public class SquareAndCubes {
    public static void main(String[] agrs) {
        System.out.printf("%-8s %-8s %-8s\n", "number", "square", "cube");
        for( int number = 0; number <= 10; number++) {
            int square = number * number;
            int cube = square * number;
            System.out.printf("%-8d %-8d %-8d\n", number, square, cube);
        }
    }

    }
