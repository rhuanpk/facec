package net.rhuanpk.arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/file.txt");
        Scanner reader = new Scanner(file);

        // Passando o arquivo para scanner, ele carrega o arquivo no _buffer_.
        // A função hasNextLine() verifica se há alguma _String_ no _buffer_ (mas consome).
        // Caso tenha a linha, a função retorna _true_ e o _loop_ continua.
        // Dentro do _loop_ a linha é finalmente consumida pelo nextLine().

        while (reader.hasNextLine()) {
            String linha = reader.nextLine();
            System.out.println("Linha: " + linha);
        }
    }
}
