public class ContatoInexistenteException extends Exception{
	
	
	public ContatoInexistenteException(){
		this("Contato não cadastrado!");
	}
	
	public ContatoInexistenteException(String descricao){
		super (descricao);
		}
}