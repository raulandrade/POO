public class ContatoInexistenteException extends Exception{
	
	
	public ContatoInexistenteException(){
		this("Contato n�o cadastrado!");
	}
	
	public ContatoInexistenteException(String descricao){
		super (descricao);
		}
}