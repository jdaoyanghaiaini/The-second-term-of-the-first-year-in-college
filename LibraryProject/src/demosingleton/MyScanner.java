package demosingleton;

import java.util.Scanner;

public class MyScanner {
    private static final Scanner scanner = new Scanner(System.in);
    public static Scanner getScanner() {
        return scanner;
    }
}
