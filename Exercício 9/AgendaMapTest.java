
import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class AgendaMapTest {
	
	public AgendaMap agenda;
	
	@Test
	public void TestaAgenda() {

		agenda = new AgendaMap();
		
		try{
			agenda.adicionarContato("José", "888");
		}catch (ContatoExistenteException excecao){
			fail("O Contato adicionado já existe!");
		}
		
		try{
			assertEquals(agenda.pesquisaContato("José").getNome(), "José");
		} catch  (ContatoInexistenteException excecao){
			fail("Contato não cadastrado!");
		}
		
		
		try{
			agenda.removerContato("José");
		} catch (ContatoInexistenteException excecao1){
			fail("O Contato não existe!");
		
		}
		
		try{
			assertEquals(agenda.pesquisaContato("José").getNome(), "José");
			fail("Contato não cadastrado!");
		} catch  (ContatoInexistenteException excecao){
			
			
		}
		
		try{
			agenda.adicionarContato("Raul", "888");
			agenda.adicionarContato("Ayla", "732");
		} catch (ContatoExistenteException excecao){
			fail("O Contato adicionado já existe!");
		}
		
		Iterator <Contato> contatosOrdenados = agenda.getContatosOrdenados();
		assertTrue(contatosOrdenados.hasNext());
		
		Contato cont1 = contatosOrdenados.next();
		assertEquals("Ayla", cont1.getNome());
		assertEquals("732", cont1.getTelefone());
		
		assertTrue(contatosOrdenados.hasNext());
		Contato cont2 = contatosOrdenados.next();
		assertEquals("Raul", cont2.getNome());
		assertEquals("888", cont2.getTelefone());
		
	
		
	}
}
