package pessoa;

import java.util.ArrayList;
import java.util.Arrays;

import interfaces.Acoes;

public abstract class Pessoa implements Acoes {

	public static final String tipoAluno = "ALUNO";
	public static final String tipoProfessor = "PROFESSOR";
	public static final ArrayList<String> tiposPessoas = new ArrayList<>(Arrays.asList(tipoAluno, tipoProfessor));

	private static int lastId;

	private int id;
	private String tipo;

	protected String nome;
	protected int idade;
	protected ArrayList<String> cursos;

	public Pessoa() {
		setId();
		setTipo(null);
		setProtectedDefault();
	}

	public Pessoa(String tipo) {
		setId();
		setTipo(tipo);
		setProtectedDefault();
	}

	public Pessoa(String tipo, String nome, int idade, ArrayList<String> cursos) {
		setId();
		setTipo(tipo);
		setNome(nome);
		setIdade(idade);
		setCursos(cursos);
	}

	private void setProtectedDefault() {
		setNome(null);
		setIdade(0);
		setCursos(null);
	}

	@Override
	public void printInfos() {
		System.out.println("ID: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Cursos: " + getCursos());
	}

	public int getId() {
		return id;
	}

	private void setId() {
		id = ++lastId;
	}

	public String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		if (tipo == null || !tiposPessoas.contains(tipo))
			tipo = "N/A";
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isEmpty() || nome.isBlank())
			nome = "N/A";
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			idade = 0;
		} else if (idade > 150) {
			idade = 150;
		}
		this.idade = idade;
	}

	public ArrayList<String> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<String> cursos) {
		if (this.cursos == null)
			this.cursos = new ArrayList<String>();
		if (cursos == null)
			return;
		cursos.forEach(curso -> {
			if (curso.isEmpty() || curso.isBlank())
				curso = "N/A";
			this.cursos.add(curso);
		});
	}

	public void appendCursos(ArrayList<String> cursos) {
		for (int index = 0; index < cursos.size(); index++) {
			String curso = cursos.get(index);
			if (curso == null || curso.isEmpty() || curso.isBlank())
				cursos.set(index, "N/A");
		}
		this.cursos.addAll(cursos);
	}

}
