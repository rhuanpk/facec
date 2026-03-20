package net.rhuanpk.trywithresources;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Integer integer = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Error ao ler número inteiro: " + e.getMessage());
        }
    }
}
