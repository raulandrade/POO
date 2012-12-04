package br.ufpb.exercicio06;

import java.io.*;
import java.util.*;


public class GravadorDePedidos {
		
	public List<Pedido> lePedidos() throws IOException{
		ObjectInputStream leitura = null;
				
		try{
			leitura = new ObjectInputStream(new FileInputStream("pedidos.txt"));
			return (List<Pedido>) leitura.readObject();	
		}catch (FileNotFoundException e){
			throw new IOException ("O Arquivo não encontrado!", e);			
		}catch(IOException e){
			throw e;
		}catch(ClassNotFoundException e){
			throw new IOException("A classe não foi encontrada!");
		}finally{
			if(leitura != null){
				leitura.close();
			}
		}
			
	}
	
	public void gravaPedidos (List<Pedido> pedidos) throws IOException{
		ObjectOutputStream retorno = null;
		try{
			retorno = new ObjectOutputStream(new FileOutputStream("pedidos.txt"));
			retorno.writeObject(pedidos);
		}catch (FileNotFoundException e){
			throw new IOException ("O Arquivo não encontrado!", e);			
		}catch(IOException e){
			throw e;
		}finally{
			if(retorno != null){
				retorno.close();
			}
		}
		
		
	}

}
