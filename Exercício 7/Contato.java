package br.ufpb.exercicio07;

import java.io.*;

public class Contato implements Serializable {

	public String nome;
	public String telefone;

	public Contato(){
		this("","");
	}
	
	public Contato(String nome,String telefone){
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
}