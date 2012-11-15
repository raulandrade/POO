package br.ufpb.sistemapedidos;
public class Cliente {
	
	private String nome;
	
	public Cliente(){
		this(" ");
	}
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
