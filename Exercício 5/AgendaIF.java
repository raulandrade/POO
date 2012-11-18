
public interface AgendaIF {

	public void adicionarContato(String nome,String tel);

	public void removerContato(String nome) throws ContatoInexistenteException;

	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException;
}

