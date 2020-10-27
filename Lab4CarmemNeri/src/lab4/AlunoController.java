package lab4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe controller que contém os métodos relacionados à classe Aluno. 
 * 
 * @author CarmemNeri
 *
 */
public class AlunoController {
	
	private Map<String, Aluno> alunos;
	private List<Aluno> alunosResponderam;
	
	/**
	 * Construtor de controller. Inicializa a estrutura de dados que armazena os alunos.
	 * 
	 */
	public AlunoController() {
		alunos = new HashMap<>();
		alunosResponderam = new ArrayList<>();
	}
	
	/**
	 * Retorna um aluno caso a matŕicula seja válida ou nula em caso contrário.
	 * @param matricula A matrícula que identifica o aluno.
	 * @return Retorna um objeto do tipo aluno quando a matrícula é válida ou null caso contrário.
	 */
	public Aluno getAluno(String matricula) {
		this.verificaMatricula(matricula);
		if(alunos.containsKey(matricula)) {
			return alunos.get(matricula);
		} return null;
	}
	
	/**
	 * Método responsável por cadastrar um aluno e verificar se o cadastro já foi realizado.
	 * @param matricula A matrícula do aluno.
	 * @param nome O nome do aluno.
	 * @param curso O curso do aluno.
	 * @return Retorna uma String informando se o cadastro foi realizado ou se o aluno já havia sido
	 * cadastrado anteriormente.
	 */
	public String cadastraAluno(String matricula, String nome, String curso) {
		this.verificaMatricula(matricula);
		this.verificaNome(nome);
		this.verificaCurso(curso);
		if(!alunos.containsKey(matricula)) {
			alunos.put(matricula, new Aluno(matricula, nome, curso));
			return("CADASTRO REALIZADO!");
		} return("MATRÍCULA JÁ CADASTRADA!");
	}
	
	/**
	 * Método responsável por consultar o cadastro de um aluno. 
	 * @param matricula A matrícula do aluno.
	 * @return Retorna uma String com as informações do aluno ou uam String infromando que o aluno
	 * não foi cadastrado anteriormente.
	 */
	public String consultarALuno(String matricula) {
		this.verificaMatricula(matricula);
		if(alunos.containsKey(matricula)) {
			return("Aluno: " + this.getAluno(matricula).toString());
		} return("Aluno não cadastrado.");
	}
	
	/**
	 * Médtodo responsável por adicionar a uma lista os alunos que responderam questões.
	 * @param matricula A matrícula do aluno.
	 * @return Retorna uma String informando que o aluno foi registrado ou que o aluno não
	 * havia sido cadastrado anteriormente.
	 */
	public String addAlunoRespondeu(String matricula) {
		this.verificaMatricula(matricula);
		if(alunos.containsKey(matricula)) {
			alunosResponderam.add(this.getAluno(matricula));
			return("ALUNO REGISTRADO!");
		} return("Aluno não cadastrado.");
	}
	
	/**
	 * Método resposável por imprimir uma String com todos os alunos que responderam quastões.
	 * @return Retorna uma String com todos os alunos e suas informações.
	 */
	public String listarAlunosResponderam() {
		String result = "Alunos:";
		int i = 1;
		for(Aluno aluno : alunosResponderam) {
			result += System.lineSeparator() + i + ". " + aluno.toString();
			i++;
		}
		return result;
	}
	
	/**
	 * Método resposável por verificar se a matrícula do aluno não é nulo ou vazia.
	 * @param matricula A matrícula do aluno a ser verificada.
	 */
	private void verificaMatricula(String matricula) {
		if(matricula == null) {
			throw new NullPointerException("Matricula nula!");
		}
		if(matricula.trim().equals("")) {
			throw new IllegalArgumentException("Matricula vazia!");
		}
	}
	
	/**
	 * Método resposável por verificar se o nome do aluno não é nulo ou vazio.
	 * @param nome O nome do aluno a ser verificado.
	 */
	private void verificaNome(String nome) {
		if(nome == null) {
			throw new NullPointerException("Nome nulo!");
		}
		if(nome.trim().equals("")) {
			throw new IllegalArgumentException("Nome vazio!");
		}
	}
	
	/**
	 * Método resposável por verificar se o curso do aluno não é nulo ou vazio.
	 * @param curso O curso do aluno a ser verificado.
	 */
	private void verificaCurso(String curso) {
		if(curso == null) {
			throw new NullPointerException("Curso nulo!");
		}
		if(curso.trim().equals("")) {
			throw new IllegalArgumentException("Curso vazio!");
		}
	}
}
