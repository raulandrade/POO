package br.ufpb.sistemapedidos;
import java.util.*;

public class Pedido {
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	public Pedido( ){
		this(0);
	}
	
	public double getValorTotal(){
		double retorno = 0;
		for(ItemDePedido aux : itens){
			retorno += aux.getSubTotal();
		}
		return retorno;
		
	}
	
	public Pedido(long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
		this.cliente = new Cliente();
		this.itens = new ArrayList<ItemDePedido>();
	}

	public List<ItemDePedido> getItens() {
		return this.itens;
	}
	
	public void adicionaItem(ItemDePedido item){
		itens.add(item);
	}

	public long getNumeroDoPedido() {
		return numeroDoPedido;
	}

	public void setNumeroDoPedido(long numeroDoPedido) {
		this.numeroDoPedido = numeroDoPedido;
	}

	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}

}