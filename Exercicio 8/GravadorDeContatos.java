package br.ufpb.exercicio08;

import java.io.*;
import java.util.*;

public class GravadorDeContatos {
	
	public Collection<Contato> leContatos() throws IOException{
		ObjectInputStream leitura = null;
		
		try{
			leitura = new ObjectInputStream(new FileInputStream("contato.txt"));
			return (Collection<Contato>) leitura.readObject();	
		}catch (FileNotFoundException e){
			throw new IOException ("O arquivo não foi encontrado!", e);			
		}catch(IOException e){
			throw e;
		}catch(ClassNotFoundException e){
			throw new IOException(" A classe não foi encontrada!", e);
		}finally{
			if(leitura != null){
				leitura.close();
			}
		}
		
	}
	
	public void GravaContatos (Collection<Contato> contato) throws IOException{
		ObjectOutputStream retorno = null;
		try{
			retorno = new ObjectOutputStream(new FileOutputStream("contato.txt"));
			retorno.writeObject(contato);
		}catch (FileNotFoundException e){
			throw new IOException ("O arquivo não foi encontrado!", e);			
		}catch(IOException e){
			throw e;
		}finally{
			if(retorno != null){
				retorno.close();
			}
		}
		
		
	}
	
	
}

