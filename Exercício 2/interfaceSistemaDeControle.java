import java.util.List;


/**
 * Essa interface cria sitemas de controle de pedidos
 * @author Raul
 *
 */
public interface interfaceSistemaDeControle {
	
	/**
	 * Este método adiciona pedidos.
	 * @param p este parâmetro recebe um objeto do tipo pedido.
	 */
	
	public void adicionaPedido(Pedido p);
	
	/**
	 * Este método pesquisa pedidos feitos usando o código do produto como parâmetro.
	 * @param codProduto É um objeto do tipo String que representa o codigo do protudo.
	 * @return Esse método retorna uma lista de produtos que possuem o mesmo código de produto passado como parâmetro.
	 */
	
	public List<Pedido> pesquisaDePedidosIncluindoProdutos(String codProduto);
	
	/**
	 * Esse metodo remove pedidos.
	 * @param numPedido É um objeto do tipo long, que recebe o número do pedido que será removido.
	 */
	public void removePedido(long numPedido);

}
