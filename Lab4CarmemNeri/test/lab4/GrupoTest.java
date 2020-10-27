package lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrupoTest {

	@Test
	void testHashCode() {
		Grupo grupo1 = new Grupo("Abelhinhas");
		Grupo grupo2 = new Grupo("Abelhinhas");
		Grupo grupo3 = new Grupo("Baratinhas");
		assertEquals(grupo1.hashCode(), grupo2.hashCode());
		assertNotEquals(grupo2.hashCode(), grupo3.hashCode());
	}

	@Test
	void testGrupo() {
		try {
			Grupo grupo = new Grupo("Abelhinhas");
		}catch(Exception e) {
			fail("Wrongly throws exception");
		}
		
		try {
			Grupo grupo = new Grupo(null);
		}catch(Exception e) {
			assertEquals(e.getClass(), new  NullPointerException().getClass());
		}
		
		try {
			Grupo grupo = new Grupo("");
		}catch(Exception e) {
			assertEquals(e.getClass(), new  IllegalArgumentException().getClass());
		}
	}

	@Test
	void testAddAluno() {
		Aluno aluno = new Aluno("123", "Joana", "Letras");
		Grupo grupo = new Grupo("Abelhinhas");
		grupo.addAluno(aluno);
		String result1 = grupo.listarAlunos();
		grupo.addAluno(aluno);
		String result2 = grupo.listarAlunos();
		assertEquals(result1, result2);
	}

	@Test
	void testListarAlunos() {
		Aluno aluno = new Aluno("123", "Joana", "Letras");
		Grupo grupo = new Grupo("Abelhinhas");
		grupo.addAluno(aluno);
		assertEquals(grupo.listarAlunos(), "Alunos do grupo Abelhinhas:\n" + 
				"* 123 - Joana - Letras");
	}

	@Test
	void testEqualsObject() {
		Grupo grupo1 = new Grupo("Abelhinhas");
		Grupo grupo2 = new Grupo("Abelhinhas");
		Grupo grupo3 = new Grupo("Baratinhas");
		assertTrue(grupo1.equals(grupo2));
		assertFalse(grupo2.equals(grupo3));

	}

}
