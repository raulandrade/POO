package br.ufpb.exercicio07;

import java.util.*;

public class Agenda implements AgendaIF{

	private List<Contato> contatos;
	
	public Agenda(){
		this.contatos = new LinkedList<Contato>();
	}
	
	public Agenda(LinkedList<Contato> lista){
		this.contatos = lista;
	}
	
	public void adicionarContato(String nome, String telefone) throws ContatoExistenteException {
		
		for(Contato c : contatos){
			if(c.getNome().equals(nome)){
				throw new ContatoExistenteException("Contato Já cadastrado!");
			}
		}
		contatos.add(new Contato(nome,telefone));
	} 
			

	public void removerContato(String nomeContato) throws ContatoInexistenteException {
		for(Contato c : contatos){
			if(c.getNome().equals(nomeContato)){
				contatos.remove(c);
				return ;
			}
		}
		throw new ContatoInexistenteException("Contato não cadastrado: " + nomeContato);
		
	}
	
	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException {
		for(Contato aux : contatos){
			if(aux.getNome().equals(nomeContato)){
				return aux;
			}
		}
		throw new ContatoInexistenteException("Contato não cadastrado: " + nomeContato);
	}	
	
	public Collection<Contato> getContatos(){
		return this.contatos;
	}

}