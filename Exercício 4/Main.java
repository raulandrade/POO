package br.ufpb.sistemapedidos;
import java.util.*;
public class Main {
	
	public static void main (String args[]){
		String codigo = "";
		Scanner teclado = new Scanner(System.in);
		Pedido p1 = new Pedido(1);

		while(!(codigo.equals("0"))){
			codigo = teclado.nextLine();
			if(!(codigo.equals("0"))){
				String quantidade = teclado.nextLine();
				String valorUnitario = teclado.nextLine();
				ItemDePedido it = new ItemDePedido(codigo, Integer.parseInt(quantidade),Double.parseDouble(valorUnitario));
				p1.adicionaItem(it);
			}
		}
		System.out.println("Valor Total:R$"+ p1.getValorTotal());
	}
}
