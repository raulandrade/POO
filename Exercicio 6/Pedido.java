package br.ufpb.exercicio06;

import java.io.*;
import java.util.*;

public class Pedido implements Serializable{
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> pedidos;
	
	public Pedido(long numeroDePedido){
		
		this.numeroDoPedido = numeroDePedido;
		this.cliente = new Cliente();
		this.pedidos = new ArrayList<ItemDePedido>();
	}
	
	public List<ItemDePedido> getItens(){
		return this.pedidos;
	}
	
	public void adicionaItem(ItemDePedido item){
		this.pedidos.add(item);
	}
	
	public long getNumeroDoPedido(){
		return this.numeroDoPedido;
	}
	
	public void setNumeroDoPedido(long numeroDoPedido){
		this.numeroDoPedido = numeroDoPedido;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public void setCliente(Cliente c){
		this.cliente = c;
	}
}
