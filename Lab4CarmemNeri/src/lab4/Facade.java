package lab4;

/**
 * Uma classe que funciona como fachada e interagem com alunoController e grupoController.
 * 
 * @author CarmemNeri
 *
 */
public class Facade {
	
	private AlunoController alunoController;
	private GrupoController grupoController;
	
	/**
	 * Construtor de fachada. Inicializa os controllers de aluno e grupo.
	 * 
	 */
	public Facade() {
		alunoController = new AlunoController();
		grupoController = new GrupoController();
	}
	
	
	public String cadastraAluno(String matricula, String nome, String curso) {
		return alunoController.cadastraAluno(matricula, nome, curso);
	}
	
	
	public String consultarALuno(String matricula) {
		return alunoController.consultarALuno(matricula);
	}
	
	
	public String cadastraGrupo(String nome) {
		return grupoController.cadastraGrupo(nome);
	}
	
	
	public String alocarAluno(String matricula, String nome) {
		return grupoController.alocarAluno(alunoController.getAluno(matricula), nome);
	}
	
	
	public String imprimirGrupo(String nome) {
		return grupoController.imprimirGrupo(nome);
	}
	
	
	public String addAlunoRespondeu(String matricula) {
		return alunoController.addAlunoRespondeu(matricula);
	}
	
	
	public String listarAlunosResponderam() {
		return alunoController.listarAlunosResponderam();
	}

}
