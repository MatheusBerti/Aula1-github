package entidades;

import java.util.Date;

import entidades.enums.PedidoSituacao;

public class Pedidos {
	
	private Integer id;
	private Date dataPedido;
	private PedidoSituacao situacao;

	
	public Pedidos() {
		
	}

	public Pedidos(Integer id, Date dataPedido, PedidoSituacao situacao) {
		this.id = id;
		this.dataPedido = dataPedido;
		this.situacao = situacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public PedidoSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(PedidoSituacao situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", dataPedido=" + dataPedido + ", situacao=" + situacao + "]";
	}
	
	
	
	
	
	
}
