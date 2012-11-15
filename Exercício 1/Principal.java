package br.ufpb.sistemapedidos;
public class Principal {

	
	public static void main(String[] args) {
		ControleDePedidos controleDePedidos = new ControleDePedidos();
		
		Pedido p1 = new Pedido(01);
		Pedido p2 = new Pedido(02);
		
		Cliente cliente = new Cliente("José");
		
		p1.setCliente(cliente);
		p2.setCliente(cliente);
		
		controleDePedidos.adicionaPedido(p1);
		controleDePedidos.adicionaPedido(p2);
		
		int quantidadeDePedidosDoCliente = controleDePedidos.calculaQuantidadeDePedidosDoCliente("José");
		
		if(quantidadeDePedidosDoCliente == 2){
			System.out.println("Programa Correto");
			
		}else{
			
			System.out.println("Programa Incorreto");
		}	
		
		System.out.println(quantidadeDePedidosDoCliente);
		
		
	}

}
