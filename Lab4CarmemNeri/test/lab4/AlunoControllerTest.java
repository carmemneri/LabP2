package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoControllerTest {
	

	
	private AlunoController alunoController;

	@BeforeEach
	public void criaAluno() {
		alunoController = new AlunoController();
	}

	@Test
	void testGetAluno() {
		alunoController.cadastraAluno("123", "Joana", "Computação");
		Aluno resultado1 = alunoController.getAluno("123");
		assertNotNull(resultado1);
		Aluno resultado2 = alunoController.getAluno("125");
		assertNull(resultado2);
	}

	@Test
	void testCadastraAluno() {
		String resultado = alunoController.cadastraAluno("123", "Joana", "Computação");
		assertEquals(resultado, "CADASTRO REALIZADO!");
		String resultado2 = alunoController.cadastraAluno("123", "Joana", "Computação");
		assertEquals(resultado2, "MATRÍCULA JÁ CADASTRADA!");	
	}

	@Test
	void testConsultarALuno() {
		alunoController.cadastraAluno("123", "Joana", "Computação");
		String resultado = alunoController.consultarALuno("123");
		assertEquals(resultado, "Aluno: 123 - Joana - Computação");
		String resultado2 = alunoController.consultarALuno("125");
		assertEquals(resultado2, "Aluno não cadastrado.");
	}

	@Test
	void testAddAlunoRespondeu() {
		alunoController.cadastraAluno("123", "Joana", "Computação");
		String resultado = alunoController.addAlunoRespondeu("123");
		assertEquals(resultado, "ALUNO REGISTRADO!");
		String resultado2 = alunoController.addAlunoRespondeu("126");
		assertEquals(resultado2, "Aluno não cadastrado.");
	}

	@Test
	void testListarAlunosResponderam() {
		alunoController.cadastraAluno("123", "Joana", "Computação");
		alunoController.addAlunoRespondeu("123");
		String resultado = alunoController.listarAlunosResponderam();
		assertEquals(resultado, "Alunos:\n" + 
				"1. 123 - Joana - Computação");
	}

}
