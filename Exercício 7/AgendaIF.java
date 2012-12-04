package br.ufpb.exercicio07;

import java.io.*;
import java.util.*;


public interface AgendaIF {

	public void adicionarContato(String nome,String tel) throws ContatoExistenteException;
	public void removerContato(String nome) throws ContatoInexistenteException, IOException;
	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException;
	public Collection<Contato> getContatos();
}
