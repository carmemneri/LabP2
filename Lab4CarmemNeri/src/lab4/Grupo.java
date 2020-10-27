package lab4;

import java.util.HashSet;
import java.util.Set;

/**
 * Um grupo que irá ser criando possuindo o atributo que o compõe e mantendo uma lista de alunos. Não possui número fixo de alunos. 
 * 
 * @author CarmemNeri
 *
 */
public class Grupo {
	
	private String nome;
	private Set<Aluno> alunos;
	
	/**
	 * Cria um grupo.
	 * @param nome O nome do grupo.
	 */
	public Grupo(String nome) {
		if(nome == null) {
			throw new NullPointerException("Nome nulo!");
		}
		if(nome.trim().equals("")) {
			throw new IllegalArgumentException("Nome vazio!");
		}
		this.nome = nome;
		alunos = new HashSet<>();
	}


	/**
	 * Adiciona um aluno a uma lista de um grupo já criado.
	 * @param aluno O objeto aluno selecionado.
	 */
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);	
	}


	/**
	 * Gera uma String que lista os alunos que compõem determinado grupo.
	 * A String retornada é formada por "Alunos do grupo" + nome do grupo + ":"
	 * e o toString de todos os alunos.
	 * @return Uma String formatada, que é a representação do grupo.
	 */
	public String listarAlunos() {
		String result = "Alunos do grupo " + nome + ":";
		for(Aluno aluno : alunos) {
			result += System.lineSeparator() + "* " + aluno.toString();
		}
		return result;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Grupo other = (Grupo) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
