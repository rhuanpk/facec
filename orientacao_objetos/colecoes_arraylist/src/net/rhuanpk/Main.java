package net.rhuanpk;

import net.rhuanpk.loja.Catalogo;
import net.rhuanpk.loja.Produto;

public class Main {
    public static void main(String[] args) {
        Catalogo eletronicos = new Catalogo();
        Produto teclado = new Produto("tb", "Teclado Branco", 250f);
        Produto mouse = new Produto("mp", "Mouse Preto", 150f);
        Produto fone = new Produto("hv", "Headset Vermelho", 200f);

        System.out.println("=== TODOS OS PRODUTOS ===");
        eletronicos.adicionar(teclado);
        eletronicos.adicionar(mouse);
        eletronicos.adicionar(fone);
        eletronicos.listar();

        System.out.println("=== REMOVENDO MOUSE ===");
        eletronicos.remover(mouse);
        eletronicos.listar();
    }
}
