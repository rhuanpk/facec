package net.rhuanpk.sistema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pega o que tem no _buffer_ até a quebra de linha (\n):
        System.out.print("Digite uma linha: ");
        String linha = scanner.nextLine();
        System.out.println("Linha: " + linha);

        // Qualquer outra função next* que não tenha "\n" como delimitador,
        // irá consumir do _buffer_ somente o tipo de dado especificado.

        // Por exemplo, a função nextInt(), irá consumir do _buffer_ somente os valores inteiros.
        // A quebra de linha (gerada pelo enter) que é uma _String_, continuará no _buffer_.
        // Isso fará com que a próxima chamada de uma função next* que use "\n" como delimitador
        // tenha comportamento inesperado.

        // Para contornar isso, depois do uso de qualquer função next* que NÃO tenha "\n" como delimitador,
        // devemos limpar o _buffer_ fazendo uma chamada de nextLine() para que a quebra de linha seja consumida,
        // independente de ter ocorrido erro ou não.

        System.out.print("Digite uma frase: ");
        String palavra = scanner.next();
        System.out.println("Palavra: " + palavra);
        scanner.nextLine();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Número: " + numero);
        scanner.nextLine();

        System.out.print("Digite um número real: ");
        float fracao = scanner.nextFloat();
        System.out.println("Fração: " + fracao);
        scanner.nextLine();

        System.out.print("Digite \"true\" ou \"false\": ");
        boolean decisao = scanner.nextBoolean();
        System.out.println("Decisão: " + decisao);
        scanner.nextLine();
    }
}
