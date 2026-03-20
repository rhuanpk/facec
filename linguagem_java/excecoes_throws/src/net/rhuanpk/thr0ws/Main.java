package net.rhuanpk.thr0ws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader arquivo = Arquivo.abrir("file.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Erro ao abrir arquivo: " + e.getMessage());
        }
    }
}
