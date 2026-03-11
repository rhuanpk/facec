package net.rhuanpk.loja;

import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Produto> produtos;

    public Catalogo() {
        produtos = new ArrayList<>();
    }

    public Catalogo(ArrayList<Produto> produtos) {
        this.produtos = new ArrayList<>();
        for (Produto produto : produtos) {
            adicionar(produto);
        }
    }

    public void adicionar(Produto produto) {
        if (produto == null) {
            System.out.println("Erro ao adicionar produto no catálogo: produto não pode ser nulo!");
            return;
        }
        produtos.add(produto);
    }

    public void listar() {
        for (int index = 0; index < produtos.size(); index++) {
            System.out.println(produtos.get(index));
        }
    }

    public void remover(Produto produto) {
        produtos.remove(produto);
    }
}
