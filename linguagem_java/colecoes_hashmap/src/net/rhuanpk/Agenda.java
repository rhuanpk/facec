package net.rhuanpk;

import java.util.HashMap;

public class Agenda {
    private HashMap<String, Long> contatos;

    public Agenda() {
        contatos = new HashMap<>();
    }

    public void adicionar(String nome, Long telefone) {
        contatos.put(nome, telefone);
    }

    public Long buscar(String nome) {
        return contatos.get(nome);
    }

    public void listar() {
        //for (Map.Entry<String, Long> contato : contatos.entrySet()) {
        //    System.out.println(contato.getKey() + ": " + contato.getValue());
        //}
        for (String nome : contatos.keySet()) {
            System.out.println(nome + ": " + contatos.get(nome));
        }
    }

    public void remover(String nome) {
        contatos.remove(nome);
    }
}
