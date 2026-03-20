package net.rhuanpk.trycatch;

public class Main {
    public static void main(String[] args) {
        try {
            Integer result = 2 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Impossível dividir por 0!");
        } catch (NullPointerException | IllegalArgumentException e) {
            System.err.println("Ocorreu uma exceção: " + e.getMessage());
        }
    }
}
