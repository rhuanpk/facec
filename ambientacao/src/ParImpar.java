import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // mecanismo para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // mensagem de instrução para o usuário
        System.out.print("Informe um número: ");
        // captura um valor inteiro e atribui na variável
        int numero = scanner.nextInt();

        // estrutura condicional
        if (numero >= 0) {
            // bloco verdadeiro
            System.out.println("Este número é positivo!");
        } else {
            // bloco falso
            System.out.println("Este número é negativo!");
        }
    }
}
