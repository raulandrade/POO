import java.util.*;


/**
 * Esta classe implementa a interface interfaceSistemaDeControle
 * @author Raul
 *
 */

public class ControleDePedidos implements interfaceSistemaDeControle {
	
	private List<Pedido> pedidos;
	
	/**
	 * Este contrudor inicializa a instancia com lista do tipo arrayList.
	 */
	
	public ControleDePedidos(){
		
		pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * Este m�todo recebe um objeto do tipo Pedido que ser� adicionado em um Arraylist pedidos.
	 * @param pedido Recebe um objeto do tipo pedido.
	 */
	
	public void adicionaPedido(Pedido pedido) {
		this.pedidos.add(pedido);
		
	}
	
	/**
	 * Este m�todo pesquisa pedidos usando o c�digo do produto passsado como par�metro e retorna um ArrayList do tipo Pedido
	 * contendo os pedidos encontrados.
	 * @param Recebe o c�digo do produto do tipo String.
	 * @return Retorna uma lista do tipo Pedido, contendo os pedidos encontrados.
	 */
	
	public List<Pedido> pesquisaDePedidosIncluindoProdutos(String codProduto) {
		List<Pedido> listaDeRetorno = new ArrayList<Pedido>();
		
		for(Pedido p : pedidos){
			for(ItemDePedido item: p.getItens()){
				if(item.getCodProduto().equals(codProduto)){
					listaDeRetorno.add(p);
				}
			}
		}
		
		return listaDeRetorno;
	}
	
	/**
	 * Este m�todo recebe o numero de um pedido como par�metro e o remove da lista.
	 * @param Recebe o numero do pedido do tipo long.
	 */
	
	public void removePedido(long numPedido) {
		
		for(Pedido pedido : this.pedidos){
			if(pedido.getNumeroDoPedido() == numPedido ){
				pedidos.remove(pedido);
			}
		}
		
	}

	/**
	 * Este m�todo calcula a quantidade de pedidos de um determinado cliente.
	 * @param Recebe o nome do cliente do tipo String.
	 * @return Retorna a quantidade de pedidos do cliente.
	 */
	
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		
		int quantidadeDePedidos = 0;
		
		for(Pedido pedido: pedidos){
		
			if(pedido.getCliente().getNome().equals(nomeCliente)){
				quantidadeDePedidos ++;
			}
		}
		
		return quantidadeDePedidos;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
}
