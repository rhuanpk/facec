package net.rhuanpk.heranca;

public class Aluno extends Pessoa {
    private float nota;

    public void infos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
