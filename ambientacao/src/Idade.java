import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // mecanismo para ler entrada do usuário
        final int ANO_ATUAL = 2026; // variável do tipo constante

        System.out.print("Informe seu ano de nascimento: "); // mensagem de instrução para o usuário
        int idade = scanner.nextInt(); // captura um valor inteiro e atribui na variável

        System.out.println("Sua idade é " + (ANO_ATUAL - idade) + "!"); // mensagem de encerramento do programa
    }
}
