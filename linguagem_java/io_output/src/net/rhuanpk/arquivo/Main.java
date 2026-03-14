package net.rhuanpk.arquivo;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("src/file.txt");
        //FileWriter writer = new FileWriter("src/file.txt", true);

        // A classe FileWriter ao tentar escrever num arquivo,
        // caso não exista, ela criará o arquivo automátcamente para você.

        // Se passamos para o construtor da classe somente o nome do arquivo,
        // toda vez que o programa é iniciado, o arquivo é marcado para ser sobreescrito,
        // ou seja, o conteúdo que já existia no arquivo será apagado.
        // Podemos passar como segundo argumento para o construtor da classe
        // um valor booleano que diz para as funções de escrita adicionarem um novo conteúdo
        // no final do arquivo ao invés de sobrescreve-lo.

        writer.write("RHUAN FERRER\n");
        writer.write("JOÃO MARIA\n");
        writer.write("MARIA JOÃO\n");

        // Quando não for mais necessário escrever no arquivo, devemos fecha-lo,
        // utilizando a sua função close() a fim de evitar vazamentos de memória:
        writer.close();
    }
}
