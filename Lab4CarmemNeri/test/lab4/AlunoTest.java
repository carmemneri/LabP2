package lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class AlunoTest {

	@Test
	void testHashCode() {
		Aluno aluno1 = new Aluno("123", "Joana", "Letras");
		Aluno aluno2 = new Aluno("123", "Pedro", "Geografia");
		Aluno aluno3 = new Aluno("323", "Pedro", "Geografia");
		assertEquals(aluno1.hashCode(), aluno2.hashCode());
		assertNotEquals(aluno2.hashCode(), aluno3.hashCode());
	}

	
	@Test
	void testAluno() {
		
		try {
			Aluno aluno = new Aluno("123", "Joana", "Computação");
		}catch(Exception e) {
			fail("Wrongly throws exception");
		}
		
		try {
			Aluno aluno = new Aluno(null, "Joana", "Computação");
		}catch(Exception e) {
			assertEquals(e.getClass(), new  NullPointerException().getClass());
		}

		try {
			Aluno aluno = new Aluno("123", null, "Computação");
		}catch(Exception e) {
			assertEquals(e.getClass(), new  NullPointerException().getClass());
		}
		
		try {
			Aluno aluno = new Aluno("123", "Joana", null);
		}catch(Exception e) {
			assertEquals(e.getClass(), new  NullPointerException().getClass());
		}
		
		try {
			Aluno aluno = new Aluno("", "Joana", "Computação");
		}catch(Exception e) {
			assertEquals(e.getClass(), new  IllegalArgumentException().getClass());
		}

		try {
			Aluno aluno = new Aluno("123", "", "Computação");
		}catch(Exception e) {
			assertEquals(e.getClass(), new  IllegalArgumentException().getClass());
		}
		
		try {
			Aluno aluno = new Aluno("123", "Joana", "");
		}catch(Exception e) {
			assertEquals(e.getClass(), new  IllegalArgumentException().getClass());
		}
		
	}

	
	@Test
	void testToString() {
		Aluno aluno = new Aluno("123", "Joana", "Computação");
    	assertEquals( "123 - Joana - Computação", aluno.toString());

	}

	
	@Test
	void testEqualsObject() {
		Aluno aluno1 = new Aluno("123", "Joana", "Letras");
		Aluno aluno2 = new Aluno("123", "Pedro", "Geografia");
		Aluno aluno3 = new Aluno("323", "Pedro", "Geografia");
		assertTrue(aluno1.equals(aluno2));
		assertFalse(aluno2.equals(aluno3));
	}
}
