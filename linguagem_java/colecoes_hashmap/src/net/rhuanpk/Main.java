package net.rhuanpk;

public class Main {
    public static void main(String[] args) {
        Agenda contatos = new Agenda();

        System.out.println("=== TODOS OS CONTATOS ===");
        contatos.adicionar("João", 11999998888L);
        contatos.adicionar("Maria", 11999997777L);
        contatos.adicionar("Rhuan", 44999514013L);
        contatos.listar();

        System.out.println("=== SEM JOÃO ===");
        contatos.remover("João");
        contatos.listar();
    }
}
