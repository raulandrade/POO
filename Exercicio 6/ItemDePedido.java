package br.ufpb.exercicio06;

import java.io.*;

public class ItemDePedido implements Serializable{
	
	private String codProduto;
	private int quantidade;
	private double valorUnitario;
	
	public ItemDePedido(String codProduto,int quantidade,double valorUnitario){
		this.codProduto = codProduto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	public String getCodProduto(){
		return this.codProduto;
	}
	public void setCodProduto(String codProduto){
		this.codProduto = codProduto;
	}
	public double getValorUnitario(){
		return this.valorUnitario;
	}
	public void setValorUnitario(double valorUnitario){
		this.valorUnitario = valorUnitario;
	}
}
