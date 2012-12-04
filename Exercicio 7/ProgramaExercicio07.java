package br.ufpb.exercicio07;

import java.util.*;
import javax.swing.*;
import java.io.*;


public class ProgramaExercicio07 {
	
public static void main(String[] args) {
	
	int escAdd = 0;
	AgendaIF agendaTelefonica = null;
	GravadorDeContatos gravaContatos = new GravadorDeContatos();
	
	while(escAdd != 3){
		String escolhaAdd = JOptionPane.showInputDialog("1- Agenda List \n2- Agenda Map \n3- Sair");
		escAdd = Integer.parseInt(escolhaAdd);
		if(escAdd == 1 || escAdd == 2){
			int esc;
			
			if(escAdd == 1){
				
				try{
					agendaTelefonica = new Agenda(new LinkedList<Contato> (gravaContatos.leContatos()));
				} catch(IOException e){	
					agendaTelefonica = new Agenda();
				} catch(NullPointerException exc){
					agendaTelefonica = new Agenda();
				}
			}else {
				try{
					agendaTelefonica = new AgendaMap();
					List<Contato> listaMap = new LinkedList(gravaContatos.leContatos());
					Map<String,Contato> map = new HashMap<String,Contato>();
					for(Contato cont: listaMap){
						map.put(cont.getNome(),cont);
					}
					agendaTelefonica = new AgendaMap(new HashMap(map));				
				} catch(IOException e){
					agendaTelefonica = new AgendaMap();	
				} catch(NullPointerException exc){
					agendaTelefonica = new AgendaMap();
				}
			}
			
		do{	
			
			String escolha = JOptionPane.showInputDialog("1- Adicionar Contato\n2- Remover Contato\n3- Pesquisar Contato\n4- Sair do programa");
			esc = Integer.parseInt(escolha);
			
			switch (esc){
				
				case 1:
					try{
						agendaTelefonica.adicionarContato(JOptionPane.showInputDialog("Nome do Contato:"),JOptionPane.showInputDialog("Telefone do Contato:"));	
					} catch(ContatoExistenteException e){
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
						break;
					
				case 2:
					try {
						agendaTelefonica.removerContato(JOptionPane.showInputDialog("Qual contato deseja remover?"));
					} catch (ContatoInexistenteException e) {
							JOptionPane.showMessageDialog(null,e.getMessage());
					}catch(Exception e){
						JOptionPane.showMessageDialog(null,e.getMessage());
					}
					
					break;
					
				case 3:
					try{
						Contato c = agendaTelefonica.pesquisaContato(JOptionPane.showInputDialog("Qual contato deseja pesquisar?"));
						JOptionPane.showMessageDialog(null, "Nome do Contato: " + c.getNome() + "\nTelefone do Contato: " + c.getTelefone());
					} catch (ContatoInexistenteException e){
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				
				case 4:
					
					try{
						gravaContatos.GravaContatos(agendaTelefonica.getContatos());
					}
					catch(IOException e){
						JOptionPane.showMessageDialog (null,"A lista de contatos não foi salva!");
					}
					break;
			}
		} while (esc != 4);
		}
	}
	}

}


