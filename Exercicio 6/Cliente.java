package br.ufpb.exercicio06;

import java.io.*;

public class Cliente implements Serializable{

	private String nome;
	
	public Cliente(){
		this("");
	}
	public Cliente(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
}