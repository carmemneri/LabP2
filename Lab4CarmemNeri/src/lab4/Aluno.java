package lab4;

/**
 * Um aluno que irá ser criando possuindo vários atributos que o compõe. 
 * 
 * @author CarmemNeri
 *
 */
public class Aluno {

	private String matricula;
	private String nome;
	private String curso;

	
	/**
	 * Cria um aluno.
	 * @param matricula A matrícula que é a identificação de cada aluno.
	 * @param nome O nome do aluno.
	 * @param curso O curso do aluno.
	 */
	public Aluno(String matricula, String nome, String curso) {
		if(matricula == null) {
			throw new NullPointerException("Matricula nula!");
		}
		if(matricula.trim().equals("")) {
			throw new IllegalArgumentException("Matricula vazia!");
		}
		
		if(nome == null) {
			throw new NullPointerException("Nome nulo!");
		}
		if(nome.trim().equals("")) {
			throw new IllegalArgumentException("Nome vazio!");
		}
	
		if(curso == null) {
			throw new NullPointerException("Curso nulo!");
		}
		if(curso.trim().equals("")) {
			throw new IllegalArgumentException("Curso vazio!");
		}
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;
	}


	/**
	 * Retorna a String que representa o aluno pela sua matrícula, nome e curso.
	 * @return a concatenação em String da identificação de um aluno.
	 */
	@Override
	public String toString() {
		return matricula + " - " + nome + " - " + curso;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
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
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}
	
}
