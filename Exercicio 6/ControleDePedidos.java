package br.ufpb.exercicio06;

import java.io.*;
import java.util.*;


public class ControleDePedidos implements InterfaceSistemaDeControle{

	private List<Pedido> pedidos;
	private GravadorDePedidos gravaPedidos;
	
	public ControleDePedidos(){
		this.gravaPedidos = new GravadorDePedidos();
		try {
			this.pedidos = this.gravaPedidos.lePedidos();
		} catch (IOException e) {
			this.pedidos = new ArrayList<Pedido>();
		}
	}
	
	public void adicionaPedido(Pedido pedido) {
		this.pedidos.add(pedido);
		gravaPedido();
	}
		
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codProduto) {
		List <Pedido> rerornoDePedidos = new ArrayList<Pedido>();
		for (Pedido p: this.pedidos){
			List<ItemDePedido> itens = p.getItens();
			for (ItemDePedido it: itens){
				if (it.getCodProduto().equals(codProduto)){
					rerornoDePedidos.add(p);
					}
				}
			}
			return rerornoDePedidos;
	}
	
	public void removePedido(long numPedido) {
		
		for(Pedido pedido : this.pedidos){
			if(pedido.getNumeroDoPedido() == numPedido ){
				this.pedidos.remove(pedido);
				gravaPedido();
			}
		}
		
	}
	
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		
		int qntPedidos = 0;
		
		for(Pedido pedido: pedidos){
		
			if(pedido.getCliente().getNome().equals(nomeCliente)){
				qntPedidos ++;
			}
		}
		return qntPedidos;
	}
	
	public void gravaPedido(){
		try {
			this.gravaPedidos.gravaPedidos(this.pedidos);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}


	

	
}
