package agenda;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContatoTest {
	
	private Contato contatoBasico;

	@BeforeEach
	public void criaContato() {
		contatoBasico = new Contato("Matheus", "Gaudencio", "2101-0000", "99988-3434", "98877-9988", 3, 1);
	}

	@Test
	public void testToString() {
    	
    	assertEquals( "Matheus Gaudencio", contatoBasico.toString());
 
	}

	
	@Test
	void testContato() {
		
		assertEquals("Matheus", contatoBasico.getNome());
		assertEquals("Gaudencio", contatoBasico.getSobrenome());
		assertEquals("2101-0000", contatoBasico.getTel1());
		assertEquals("99988-3434", contatoBasico.getTel2());
		assertEquals("98877-9988", contatoBasico.getTel3());
		assertEquals("98877-9988", contatoBasico.getPrioritario());	
		assertEquals("2101-0000", contatoBasico.getZap());	
		
	}

	@Test
	void testSetNome() {
		
		assertEquals("Matheus", contatoBasico.getNome());
		contatoBasico.setNome("teste");
		assertEquals("teste", contatoBasico.getNome());
	}

	@Test
	void testSetSobrenome() {
		assertEquals("Gaudencio", contatoBasico.getSobrenome());
		contatoBasico.setSobrenome("teste");
		assertEquals("teste", contatoBasico.getSobrenome());
	}

	@Test
	void testSetTel1() {
		assertEquals("2101-0000", contatoBasico.getTel1());
		contatoBasico.setTel1("3396-1122");
		assertEquals("3396-1122", contatoBasico.getTel1());
	}

	@Test
	void testSetTel2() {
		assertEquals("99988-3434", contatoBasico.getTel2());
		contatoBasico.setTel2("3396-9999");
		assertEquals("3396-9999", contatoBasico.getTel2());
	}

	@Test
	void testSetTel3() {
		assertEquals("98877-9988", contatoBasico.getTel3());
		contatoBasico.setTel3("3396-6666");
		assertEquals("3396-6666", contatoBasico.getTel3());
	}

	@Test
	void testSetPrioritario() {
		contatoBasico.setPrioritario(1);
		assertEquals(contatoBasico.getPrioritario(), contatoBasico.getTel1());
		contatoBasico.setPrioritario(2);
		assertEquals(contatoBasico.getPrioritario(), contatoBasico.getTel2());
		contatoBasico.setPrioritario(3);
		assertEquals(contatoBasico.getPrioritario(), contatoBasico.getTel3());
		contatoBasico.setPrioritario(0);
		assertEquals(contatoBasico.getPrioritario(), "Não tem");
	}

	@Test
	void testSetZap() {
		contatoBasico.setZap(1);
		assertEquals(contatoBasico.getZap(), contatoBasico.getTel1());
		contatoBasico.setZap(2);
		assertEquals(contatoBasico.getZap(), contatoBasico.getTel2());
		contatoBasico.setZap(3);
		assertEquals(contatoBasico.getZap(), contatoBasico.getTel3());
		contatoBasico.setZap(0);
		assertEquals(contatoBasico.getZap(), "Não tem");
	
	}



}
