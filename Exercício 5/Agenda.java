import java.util.*;

public class Agenda implements AgendaIF{

	private List<Contato> agenda;

	public Agenda(){
		
		this.agenda = new ArrayList<Contato>();
	}
	
	public void adicionarContato(String nome, String telefone) {
		
		Contato contato = new Contato(nome,telefone);
		this.agenda.add(contato);
	}
	
	public void removerContato(String nomeContato) throws ContatoInexistenteException {
		boolean achou = false;
		for(Contato aux : this.agenda){
			if(aux.getNome().equals(nomeContato)){
				this.agenda.remove(aux);
				achou = true;
				break;
			}
		}

		if(achou){
			throw new ContatoInexistenteException("Contato não cadastrado: " + nomeContato);
		}
		
	}
	
	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException {
		for(Contato aux : this.agenda){
			if(aux.getNome().equals(nomeContato)){
				return aux;
			}
		}
		throw new ContatoInexistenteException("Contato não cadastrado: " + nomeContato);
	}	

}