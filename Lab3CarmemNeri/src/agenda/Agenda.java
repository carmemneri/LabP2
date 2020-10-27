package agenda;

/**
 * Uma agenda que mantém uma lista de contatos com posições. Podem existir 100 contatos. 
 * 
 * @author nazareno e carmem
 *
 */
public class Agenda {
	
	private static final int TAMANHO_AGENDA = 100;
	
	private Contato[] contatos;

	/**
	 * Cria uma agenda.
	 */
	public Agenda() {
		this.contatos = new Contato[TAMANHO_AGENDA];
	}
	
	/**
	 * Acessa a lista de contatos mantida.
	 * @return O array de contatos.
	 */
	public Contato[] getContatos() {
		return this.contatos.clone();
	}

	/**
	 * Acessa os dados de um contato específico.
	 * @param posicao Posição do contato na agenda.
	 * @return Dados do contato. Null se não há contato na posição.
	 */
	public Contato getContato(int posicao) {
		return contatos[posicao];
	}

	/**
	 * Cadastra um contato em uma posição. Um cadastro em uma posição que já existe sobrescreve o anterior. 
	 * @param posicao Posição do contato.
	 * @param nome Nome do contado 
	 * @param sobrenome Sobrenome do contato 
	 * @param tel1 Telefone 1 do contato 
	 * @param tel2 Telefone 2 do contato
	 * @param tel3 Telefone 3 do contato 
	 * @param prioritario Telefone escolhido como prioritário 
	 * @param zap Telefone escolhido como zap
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String tel1, String tel2, String tel3, int prioritario, int zap) {
		this.contatos[posicao-1] = new Contato(nome, sobrenome, tel1, tel2, tel3, prioritario, zap);
	}

}
