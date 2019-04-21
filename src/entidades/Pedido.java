package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.EstadoPedido;

public class Pedido {

	private Date momento ;
	private EstadoPedido estado;
	
	private Cliente cliente ;
	private List<Pedido> pedidos = new ArrayList<>() ;
	
	public Pedido() {
	}

	public Pedido(Date momento, EstadoPedido estado, Cliente cliente) {
		this.momento = momento;
		this.estado = estado;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public EstadoPedido getEstado() {
		return estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	
}
