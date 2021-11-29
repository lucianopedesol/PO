package models;

public class ClienteEspecial {
	private double valeCompra;

	public ClienteEspecial(Double valeCompra) {
		super();
		this.valeCompra = valeCompra;
	}

	@Override
	public String toString() {
		return "ClienteEspecial [valeCompra=" + valeCompra + "]";
	}

	public double getValeCompra() {
		return valeCompra;
	}

	public void setValeCompra(double valeCompra) {
		this.valeCompra = valeCompra;
	}
	
	
}
