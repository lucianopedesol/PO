package models;

import java.util.Calendar;

public class Compra {
	private Cliente cliente;
	private Calendar data;
	private double valor;
	
	public Compra(Cliente cliente, Calendar data, double valor) {
		super();
		this.cliente = cliente;
		this.data = data;
		this.valor = valor;
	}
 
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}

	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Compra [cliente=" + cliente + ", data=" + data + ", valor=" + valor + "]";
	}
}
