package net.rhuanpk.trycatchfinally;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Integer integer = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Error ao ler número inteiro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
