import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        // mecanismo para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // criação de array com tamanho fixo
        int[] numeros = new int[5];
        // loop iterando sobre o tamanho do array
        for (int index = 0; index < numeros.length; index++) {
            // pede ao usuário para informar um número conforme o índice do loop
            System.out.print("Informe o número " + (index + 1) + ": ");
            // captura um valor do usuário e atribui no índice do array
            numeros[index] = scanner.nextInt();
        }

        // criação de variável para calcular a soma
        int soma = 0;
        // loop iterando sobre o tamanho do array
        for (int index = 0; index < numeros.length; index++) {
            // auto-soma o valor da variavel de some com cada valor do array
            soma += numeros[index];
        }

        // mensagem de encerramento do programa
        System.out.println("Soma dos valores: " + soma);
    }
}
