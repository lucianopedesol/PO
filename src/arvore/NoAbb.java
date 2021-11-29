package arvore;
import models.Compra;

public class NoAbb {
	private Compra compra;
	private NoAbb esq, dir;
	
	public NoAbb(Compra compra) {
		super();
		this.compra = compra;
	}
	
	public NoAbb() {
		super();
		this.compra = null;
	}

	public NoAbb getEsq() {
		return esq;
	}

	public void setEsq(NoAbb esq) {
		this.esq = esq;
	}

	public NoAbb getDir() {
		return dir;
	}

	public void setDir(NoAbb dir) {
		this.dir = dir;
	}

	public String toString() {
		return ""+this.compra.getCliente().getCpf();
	}

	public Compra getCompra() { 
		return this.compra;
	}
 
}
