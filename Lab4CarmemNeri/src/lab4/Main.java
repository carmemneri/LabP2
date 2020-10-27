package lab4;

import java.util.Scanner;

/**
 * Interface para manipular um controle de alunos.
 * 
 * @author CarmemNeri
 *
 */

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Facade facade = new Facade();
		
		while (true) {
			String escolha = menu(scanner);
			comando(escolha, facade, scanner);
		}
	}
	
	
	/**
	 * Exibe o menu e captura a escolha do/a usuário/a.
	 * 
	 * @param scanner Para captura da opção do usuário.
	 * @return O comando escolhido.
	 */	
	private static String menu(Scanner scanner) {
		System.out.print(System.lineSeparator() + 
						"---" + System.lineSeparator() +
						"MENU" + System.lineSeparator() +
						"(C)adastrar Aluno" + System.lineSeparator() +
						"(E)xibir Aluno" + System.lineSeparator() +
						"(N)ovo Grupo" + System.lineSeparator() +
						"(A)locar Aluno no Grupo e Imprimir Grupos" + System.lineSeparator() +
						"(R)egistrar Aluno que Respondeu" + System.lineSeparator() +
						"(I)mprir Alunos que Responderam" + System.lineSeparator() +
						"(O)ra, vamos fechar o progama" + System.lineSeparator() +
						System.lineSeparator() + 
						"Opção> ");
		return scanner.nextLine().toUpperCase();
	}
	
	 
	/**
	 * Interpreta a opção escolhida por quem está usando o sistema.
	 * 
	 * @param opcao   Opção digitada.
	 * @param facade  A fachada que irá invocar os métodos necessários.
	 * @param scanner Objeto scanner para o caso do comando precisar de mais input.
	 */
	private static void comando(String opcao, Facade facade, Scanner scanner) {
		try {
			switch (opcao.toLowerCase()) {
			case "c":
				cadastraAluno(facade, scanner);
				break;
			case "e":
				exibirAluno(facade, scanner);
				break;
			case "n":
				novoGrupo(facade, scanner);
				break;
			case "a":
				alocarAluno(facade, scanner);
				break;
			case "r":
				registrarALuno(facade,scanner);
				break;
			case "i":
				imprimeAlunos(facade, scanner);
				break;
			case "o":
				fecharPrograma();
				break;
			default:
				System.out.println("Opção inválida!");
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Erro de entrada " + e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro geral " + e.getMessage());
		}
	}

	
	/**
	 * Sai da aplicação.
	 */
	private static void fecharPrograma() {
		System.exit(0);		
	}

	
	private static void imprimeAlunos(Facade facade, Scanner scanner) {
		System.out.print(facade.listarAlunosResponderam());		
	}

	
	private static void registrarALuno(Facade facade, Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine(); 
		
		System.out.print(facade.addAlunoRespondeu(matricula));	
	}


	/**
	 * Interpreta quais das duas opções disponíveis será escolhida quando o usuário seleciona esse caso no menu principal.
	 * 
	 * @param facade  A fachada que irá invocar os métodos necessários.
	 * @param scanner Objeto scanner para o caso do comando precisar de mais input.
	 */
	private static void alocarAluno(Facade facade, Scanner scanner) {
		System.out.print("(A)locar Aluno ou (I)mprimir Grupo? ");
		String escolha = scanner.nextLine();
		switch (escolha.toLowerCase()) {
		case "a":
			alocar(facade, scanner);
			break;
		case "i":
			imprimir(facade, scanner);
			break;
		default:
			System.out.println("Opção inválida!");
		}		
	}

	
	/**
	 * Imprime os detalhes do grupo selecionado. 
	 * 
	 * @param facade A fachada que irá invocar os métodos necessários.
	 * @param scanner Scanner para capturar qual o nome do grupo desejado.
	 */
	private static void imprimir(Facade facade, Scanner scanner) {
		System.out.print("Grupo: ");
		String nome = scanner.nextLine(); 
		
		System.out.println();
		System.out.println(facade.imprimirGrupo(nome));		
	}


	/**
	 * Aloca um aluno em um grupo escolhido. 
	 * 
	 * @param facade A fachada que irá invocar os métodos necessários.
	 * @param scanner Scanner para pedir informações do aluno e do grupo que será alocado.
	 */
	private static void alocar(Facade facade, Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine(); 
		System.out.print("Grupo: ");
		String nome = scanner.nextLine();
		
		System.out.println(facade.alocarAluno(matricula, nome));	
		
	}

	
	/**
	 * Cadastra um grupo no controle. 
	 * 
	 * @param facade A fachada que irá invocar os métodos necessários.
	 * @param scanner Scanner para pedir informações do grupo que será cadastrado.
	 */
	private static void novoGrupo(Facade facade, Scanner scanner) {
		System.out.print("Grupo: ");
		String nome = scanner.nextLine(); 
		
		System.out.print(facade.cadastraGrupo(nome));			
	}

	
	/**
	 * Imprime os detalhes de um dos alunos do controle. 
	 * 
	 * @param facade A fachada que irá invocar os métodos necessários.
	 * @param scanner Scanner para capturar qual aluno.
	 */
	private static void exibirAluno(Facade facade, Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine(); 
		
		System.out.print(facade.consultarALuno(matricula));			
	}

	
	/**
	 * Cadastra um aluno no controle. 
	 * 
	 * @param facade A fachada que irá invocar os métodos necessários.
	 * @param scanner Scanner para pedir informações do aluno.
	 */
	private static void cadastraAluno(Facade facade, Scanner scanner) {
		System.out.print("Matrícula: ");
		String matricula = scanner.nextLine(); 
		System.out.print("Nome: ");
		String nome = scanner.nextLine(); 
		System.out.print("Curso: ");
		String curso = scanner.nextLine();
		
		System.out.print(facade.cadastraAluno(matricula, nome, curso));	
	}
	
}
