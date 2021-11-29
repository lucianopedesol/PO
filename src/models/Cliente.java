package models;

import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private ClienteEspecial clienteEspecial;
	private List<Compra> compras;

	public Cliente(String nome, String cpf, ClienteEspecial clienteEspecial) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.clienteEspecial = clienteEspecial; 
	}
	
 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public ClienteEspecial getClienteEspecial() {
		return clienteEspecial;
	}
	public void setClienteEspecial(ClienteEspecial clienteEspecial) {
		this.clienteEspecial = clienteEspecial;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(Compra compras) {
		this.compras.add(compras);
	}
	
	 
}
