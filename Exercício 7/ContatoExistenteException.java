package br.ufpb.exercicio07;

public class ContatoExistenteException extends Exception {
	
	public ContatoExistenteException(){
		this("Contato j� cadastrado!");
		}
	
	public ContatoExistenteException(String descricao){
		super (descricao);
		}

}
