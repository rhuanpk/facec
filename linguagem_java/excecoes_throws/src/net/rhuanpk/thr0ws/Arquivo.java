package net.rhuanpk.thr0ws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Arquivo {
    public static FileReader abrir(String arquivo) throws FileNotFoundException {
        return new FileReader(arquivo);
    }
}
