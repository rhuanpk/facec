package net.rhuanpk;

import java.util.HashMap;
import java.util.Map;

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
        //for (String nome : contatos.keySet()) {
        //    System.out.println(nome + ": " + contatos.get(nome));
        //}
        for (Map.Entry<String, Long> contato : contatos.entrySet()) {
            System.out.println(contato.getKey() + ": " + contato.getValue());
        }
    }

    public void remover(String nome) {
        contatos.remove(nome);
    }
}
