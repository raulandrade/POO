package br.ufpb.exercicio06;

import java.util.*;

public interface InterfaceSistemaDeControle {

	public void adicionaPedido(Pedido p);
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codProduto);
	public void removePedido(long numPedido);
}
