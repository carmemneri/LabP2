package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GrupoControllerTest {

	private GrupoController grupoController;
	
	@BeforeEach
	public void criaGrupo() {
		grupoController = new GrupoController();
	}

	@Test
	void testCadastraGrupo() {
		String resultado = grupoController.cadastraGrupo("Abelhinhas");
		assertEquals(resultado, "CADASTRO REALIZADO!");
		String resultado2 = grupoController.cadastraGrupo("Abelhinhas");
		assertEquals(resultado2, "GRUPO JÁ CADASTRADO!");	
	}

	@Test
	void testAlocarAluno() {
		Aluno aluno = new Aluno("123", "Joana", "Computação");
		grupoController.cadastraGrupo("Abelhinhas");
		String resultado = grupoController.alocarAluno(aluno, "Abelhinhas");
		assertEquals(resultado, "ALUNO ALOCADO!");
		String resultado2 = grupoController.alocarAluno(null, "Abelhinhas");
		assertEquals(resultado2, "Aluno não cadastrado.");
		String resultado3 = grupoController.alocarAluno(aluno, "Baratinhas");
		assertEquals(resultado3, "Grupo não cadastrado.");
	}
	
	@Test
	void testImprimirGrupo() {
		Aluno aluno = new Aluno("123", "Joana", "Computação");
		grupoController.cadastraGrupo("Abelhinhas");
		grupoController.alocarAluno(aluno, "Abelhinhas");
		String resultado = grupoController.imprimirGrupo("Abelhinhas");
		assertEquals(resultado, "Alunos do grupo Abelhinhas:\n" + 
				"* 123 - Joana - Computação");
		String resultado2 = grupoController.imprimirGrupo("Baratinhas");
		assertEquals(resultado2, "Grupo não cadastrado.");
	}

}
