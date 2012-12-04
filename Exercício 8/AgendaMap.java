package br.ufpb.exercicio08;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;


public class AgendaMap implements AgendaIF{
	
	private Map<String,Contato> contato;
	
	
	public AgendaMap(){
		contato = new HashMap();
	}
	
	public AgendaMap(HashMap<String,Contato> lista){
		contato = lista;
	}
	
	public void adicionarContato(String nome, String tel) throws ContatoExistenteException{
		if(contato.containsKey(nome)){
			throw new ContatoExistenteException("Contato Já cadastrado!");	
		}else{
			contato.put(nome, new Contato (nome,tel));
		}
	}

	public void removerContato(String nome) throws ContatoInexistenteException {
		if(this.contato.containsKey(nome)){
			contato.remove(nome);
			return ;
		}
	
		throw new ContatoInexistenteException("Contato não cadastrado: " + nome);	
	}

	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException {
		for(Contato aux : contato.values()){
			if(aux.getNome().equalsIgnoreCase(nomeContato)){
				return aux;
			}
		}
		throw new ContatoInexistenteException("Contato não cadastrado: " + nomeContato);

	}
	
	public Collection<Contato> getContatos(){
		Collection <Contato> retornaContatos = new ArrayList<Contato>();
		retornaContatos.addAll(this.contato.values());
		return retornaContatos;
	}

	public Iterator<Contato> getContatosOrdenados() {
		List<Contato> cont = new ArrayList<Contato>();
		cont.addAll(this.contato.values());
		Collections.sort(cont);			
		return cont.iterator();

	}
}
	