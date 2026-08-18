import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // mecanismo para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // mensagem de instrução para o usuário
        System.out.print("Informe a tabuada: ");
        // captura um valor inteiro e atribui na variável
        int tabuada = scanner.nextInt();

        // estrutura laço de repetição
        for (int index = 1; index <= 10; index++) {
            System.out.println(tabuada + " x " + index + " = " + (tabuada * index));
        }
    }
}
