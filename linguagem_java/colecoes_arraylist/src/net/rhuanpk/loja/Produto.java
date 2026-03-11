package net.rhuanpk.loja;

public class Produto {
    private String sku;
    private String nome;
    private Float preco;

    public Produto(String sku, String nome, Float preco) {
        setSku(sku);
        setNome(nome);
        setPreco(preco);
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        if (sku == null || sku.isBlank()) {
            System.out.println("Erro ao definir SKU do produto: não pode ser vazio ou nulo!");
            return;
        }
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            System.out.println("Erro ao definir nome do produto: não pode ser vazio ou nulo!");
            return;
        }
        this.nome = nome;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        if (preco < 0) {
            System.out.println("Erro ao definir preço do produto: não pode ser vazio ou nulo!");
            return;
        }
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (" + sku + ") " + "R$ " + preco;
    }
}
