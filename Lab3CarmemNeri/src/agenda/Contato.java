package agenda;

/**
 * Um acontato que irá ser criando possuindo vários atributos que o compõe. Os três telefones não precisam 
 * necessáriamente possuírem um número, quando o usuário não tiver um deve preencher com "0".
 * @author carmem
 *
 */

public class Contato {

	private String nome;
	private String sobrenome;
	private String tel1;
	private String tel2;
	private String tel3;
	private int prioritario;
	private int zap;
	
	/**
	 * Cria uma agenda.
	 * @param nome Nome do contado 
	 * @param sobrenome Sobrenome do contato 
	 * @param tel1 Telefone 1 do contato 
	 * @param tel2 Telefone 2 do contato
	 * @param tel3 Telefone 3 do contato 
	 * @param prioritario Telefone escolhido como prioritário 
	 * @param zap Telefone escolhido como zap
	 */
	public Contato(String nome, String sobrenome, String tel1, String tel2, String tel3, int prioritario, int zap) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tel1 = tel1;
		this.tel2 = tel2;
		this.tel3 = tel3;
		this.prioritario = prioritario;
		this.zap = zap;
	}

    /**
     * Acessa o nome de um contato específico.
     * @return O nome do contato.
     */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome de um contato específico.
	 * @param nome O nome a ser alterado.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
     * Acessa o sobrenome de um contato específico.
     * @return sobrenome.
     */
	
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Altera o sobrenome de um contato específico.
	 * @param sobrenome O sobrenome a ser alterado.
	 */
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
     * Acessa o telefone 1 de um contato específico.
     * @return Telefone 1.
     */
	public String getTel1() {
		return tel1;
	}

	/**
	 * Altera o telefone 1 de um contato específico.
	 * @param tel1 A string que sera associada ao telefone 1.
	 */
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}

	/**
     * Acessa o telefone 2 de um contato específico.
     * @return Telefone 2.
     */
	public String getTel2() {
		return tel2;
	}

	/**
	 * Altera o telefone 2 de um contato específico.
	 * @param tel2 A string que sera associada ao telefone 2.
	 */
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}

	/**
     * Acessa o telefone 3 de um contato específico.
     * @return Telefone 3.
     */
	public String getTel3() {
		return tel3;
	}

	/**
	 * Altera o telefone 3 de um contato específico.
	 * @param tel3 A string que sera associada ao telefone 3.
	 */
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}

	/**
     * Acessa o telefone prioritário de um contato específico, dependendo do int passado pelo usuário
     * irá retornar o telefone associado ou uma mensagem informando que não há nenhum cadastrado.
     * @return O telefone que foi selecionado para ser o prioritário, caso não haja nenhum retorna uma string
     * informando que não tem.
     */
	public String getPrioritario() {
		switch (prioritario) {
		case 1: 
			return tel1;
		case 2:
			return tel2;
		case 3:
			return tel3;
		default:
			return "Não tem";
		}
	}

	/**
	 * Altera o telefone prioritário de um contato específico.
	 * @param prioritario Identificador do telefone selecionado como prioritario.
	 */
	public void setPrioritario(int prioritario) {
		this.prioritario = prioritario;
				
	}

	/**
     * Acessa o telefone zap de um contato específico, dependendo do int passado pelo usuário
     * irá retornar o telefone associado ou uma mensagem informando que não há nenhum cadastrado.
     * @return O telefone que foi selecionado para ser o zap, caso não haja nenhum retorna uma string
     * informando que não tem.
     */
	public String getZap() {
		switch (zap) {
		case 1: 
			return tel1;
		case 2:
			return tel2;
		case 3:
			return tel3;
		default:
			return "Não tem";
		}
	}

	/**
	 * Altera o telefone zap de um contato específico.
	 * @param zap Identificador do telefone selecionado como zap.
	 */
	public void setZap(int zap) {
		this.zap = zap;
	}

	/**
	 * Retorna a String que representa o contato  pelo seu nome e sobrenome.
	 * @return a concatenação em String da identificação de um contato.
	 */
	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}
	
	
	
	
	
}
