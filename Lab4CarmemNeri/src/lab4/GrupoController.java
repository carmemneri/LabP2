package lab4;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe controller que contém os métodos relacionados à classe Grupo. 
 * 
 * @author CarmemNeri
 *
 */
public class GrupoController {
	
	private Map<String, Grupo> grupos;
	
	
	/**
	 * Construtor de controller. Inicializa a estrutura de dados que armazena os grupos.
	 * 
	 */
	public GrupoController() {
		grupos = new HashMap<>();
	}
	
	/**
	 * Método responsável por cadastrar aluno e verificar se o aluno já foi cadastrado.
	 * @param nome Nome do grpo a ser cadastrado.
	 * @return Retorna uma String informando se o cadastro foi realizado ou se o grupo já havia sido cadastrado.
	 */
	public String cadastraGrupo(String nome) {
		this.verificaNome(nome);
		if(!grupos.containsKey(nome)) {
			grupos.put(nome, new Grupo(nome));
			return("CADASTRO REALIZADO!");
		} return("GRUPO JÁ CADASTRADO!");
	}
	
	/**
	 * Método responsável por alocar alunos cadastrados dentro de grupos já existentes.
	 * @param aluno O aluno a ser alocado.
	 * @param nome O nome do grupo onde o aluno será alocado.
	 * @return Retorna uma String informando se o aluno foi alocado, ou se o aluno não havia sido cadastrado anteriormente ou
	 * se o grupo não existe ainda.
	 */
	public String alocarAluno(Aluno aluno, String nome) {
		this.verificaNome(nome);
		if(grupos.containsKey(nome)) {
			if(aluno != null) {
				grupos.get(nome).addAluno(aluno);
				return("ALUNO ALOCADO!");
			} return("Aluno não cadastrado.");
		} return("Grupo não cadastrado.");
	}
	
	/**
	 * Método resposável por imprimir uma String com todos os alunos participantes de um grupo.
	 * @param nome O nome do grupo a ser impresso.
	 * @return Retorna uma String com a lista de todos os alunos participantes ou uma String informando que o grupo desejado não foi
	 * cadastrado anteriormente.
	 */
	public String imprimirGrupo(String nome) {
		this.verificaNome(nome);
		if(grupos.containsKey(nome)) {
			return(grupos.get(nome).listarAlunos());
		} return("Grupo não cadastrado.");
	}
	
	/**
	 * Método resposável por verificar se o nome do grupo não é nulo ou vazio.
	 * @param nome O nome do grupo a ser verificado.
	 */
	private void verificaNome(String nome) {
		if(nome == null) {
			throw new NullPointerException("Nome nulo!");
		}
		if(nome.trim().equals("")) {
			throw new IllegalArgumentException("Nome vazio!");
		}
	}
}
