package aplicacao;

import java.util.Date;

import entidades.Pedidos;
import entidades.enums.PedidoSituacao;

public class Programa {

	public static void main(String[] args) {
		
		Pedidos pedidos = new Pedidos(1080, new Date(), PedidoSituacao.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedidos);		
		
		PedidoSituacao os1 =  PedidoSituacao.ENTREGUE;
		
		PedidoSituacao os2 =  PedidoSituacao.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
		
		
		
	}

}
