package br.ufpb.sistemapedidos;
public class ItemDePedido  {
	
	private String codProduto;
	private int quantidade;
	private double valorUnitario;
	
	public ItemDePedido(){
		this("0",0,0.0);
	}

	public ItemDePedido(String codProduto, int quantidade, double valorUnitario) {
		this.codProduto = codProduto;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
	}
	
	public double getSubTotal(){
		return this.quantidade * this.valorUnitario; 
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int qunatidade) {
		this.quantidade = qunatidade;
	}

	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProdutp) {
		this.codProduto = codProdutp;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public String toString() {
		return "ItemDePedido [quantidade=" + quantidade + ", codProduto="
				+ codProduto + ", valorUnitario=" + valorUnitario + "]";
	}
	
	

}
