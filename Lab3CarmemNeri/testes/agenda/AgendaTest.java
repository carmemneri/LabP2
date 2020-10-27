package agenda;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgendaTest {
		

	@Test
	void testGetContatos() {
		Agenda agenda = new Agenda();
		Contato[] contatos = agenda.getContatos();
		agenda.cadastraContato(5, "Carmem", "Neri", "3366-9988", "2255-8877", "1144-7788", 1, 3);
		Contato[] novoContatos = agenda.getContatos();
		assertNotEquals(contatos, novoContatos);
		
	}

	@Test
	void testGetContato() {
		Agenda agenda = new Agenda();
		agenda.cadastraContato(5, "Carmem", "Neri", "3366-9988", "2255-8877", "1144-7788", 1, 3);
		Contato[] contatos = agenda.getContatos();
		assertEquals(contatos[4], agenda.getContato(4));
		assertEquals(null, agenda.getContato(5));
		
	}

	@Test
	void testCadastraContato() {
		Agenda agenda = new Agenda();
		agenda.cadastraContato(5, "Carmem", "Neri", "3366-9988", "2255-8877", "1144-7788", 1, 3);
		Contato[] contatos = agenda.getContatos();
		assertEquals(contatos[4].getNome(), "Carmem");
		assertEquals(contatos[4].getSobrenome(), "Neri");
		assertEquals(contatos[4].getTel1(), "3366-9988");
		assertEquals(contatos[4].getTel2(), "2255-8877");
		assertEquals(contatos[4].getTel3(), "1144-7788");
		assertEquals(contatos[4].getPrioritario(), "3366-9988");
		assertEquals(contatos[4].getZap(), "1144-7788");
		
	}


}
