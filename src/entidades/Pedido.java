package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.EstadoPedido;

public class Pedido {

	private Date momento ;
	private EstadoPedido estado;
	
	private Cliente cliente ;
	private List<SepararItem> itens = new ArrayList<>() ;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss") ;
	
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

	public List<SepararItem> getItens() {
		return itens;
	}

	public void adcItem(SepararItem item) {
		itens.add(item) ;
	}
	
	public void removeItem(SepararItem item) {
		itens.remove(item) ;
	}
	
	public double total() {
		double total = 0;
		for (SepararItem s: itens) {
			total += s.subTotal() ;
		}
		return total ;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		sb.append("Momento do pedido: " + sdf.format(momento) + "\n") ;
		sb.append("Estado do pedido: " + estado + "\n") ;
		sb.append("Cliente: " + cliente + "\n") ;
		sb.append("Itens pedidos:" + "\n") ;
		for (SepararItem item : itens) {
			sb.append(item + "\n" ) ;
		}
		sb.append("Preço total: R$" + String.format("%.2f", total()) ) ;
		return sb.toString() ;
	}
	
}
 