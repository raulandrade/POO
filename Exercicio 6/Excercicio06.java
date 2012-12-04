package br.ufpb.exercicio06;

import java.util.*;

public class Excercicio06 {

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		ControleDePedidos gerenciaPedidos = new ControleDePedidos();
		int esc = 0;
		
		do{
			System.out.println("1- Adicionar pedido\n2- Remover pedido" +
					"\n3- Pesquisar pedido");
			esc = teclado.nextInt();
			
			switch(esc){
			
			case 1:
				System.out.println("Nome: ");
				String nome = teclado.next();
				System.out.println("Numero do pedido: ");
				long numPedido = teclado.nextLong();
				Pedido pedido = new Pedido(numPedido);
				pedido.setCliente(new Cliente (nome));
				System.out.println("Codigo do produto: ");
				String cod = teclado.next();
				System.out.println("Quantidade: ");
				int quant = teclado.nextInt();
				System.out.println("Valor unitário: ");
				double valorUnitario = teclado.nextDouble();
				ItemDePedido itensDePedido = new ItemDePedido(cod,quant,valorUnitario);
				gerenciaPedidos.adicionaPedido(pedido);
				pedido.adicionaItem(itensDePedido);
				break;
			
			case 2:
				System.out.println("Código do produto: ");
				Long codDoProduto = teclado.nextLong();
				gerenciaPedidos.removePedido(codDoProduto);
				break;

			case 3:
				System.out.println("Código do produto: ");
				String codigoProduto = teclado.next();
				List<Pedido> p = gerenciaPedidos.pesquisaPedidosIncluindoProduto(codigoProduto);
				for(Pedido retorno : p){
					System.out.println("Cliente: " + retorno.getCliente().getNome());		
					for(ItemDePedido it : retorno.getItens()){
						System.out.println("Quantidade: " + it.getQuantidade() + "\nValor unitário: " + it.getValorUnitario()+"\n");
					}
				}
				break;

			default:
				gerenciaPedidos.gravaPedido();
				break;
				
		}			
		}while(esc >=1 && esc <=3);
	}
}