import java.util.List;


/**
 * Essa interface cria sitemas de controle de pedidos
 * @author Raul
 *
 */
public interface interfaceSistemaDeControle {
	
	/**
	 * Este m�todo adiciona pedidos.
	 * @param p este par�metro recebe um objeto do tipo pedido.
	 */
	
	public void adicionaPedido(Pedido p);
	
	/**
	 * Este m�todo pesquisa pedidos feitos usando o c�digo do produto como par�metro.
	 * @param codProduto � um objeto do tipo String que representa o codigo do protudo.
	 * @return Esse m�todo retorna uma lista de produtos que possuem o mesmo c�digo de produto passado como par�metro.
	 */
	
	public List<Pedido> pesquisaDePedidosIncluindoProdutos(String codProduto);
	
	/**
	 * Esse metodo remove pedidos.
	 * @param numPedido � um objeto do tipo long, que recebe o n�mero do pedido que ser� removido.
	 */
	public void removePedido(long numPedido);

}
