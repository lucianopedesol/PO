package arvore;

import models.Compra;

public class NoAvl {
	private byte fb;
	private Compra compra;
	private NoAvl esq, dir;
	
	public NoAvl(Compra compra) {
		super();
		this.compra = compra; 
		this.fb = 0;
	}
	
	public NoAvl() {
		super();
		this.compra = null; 
		this.fb = 0;
	}
	
	public byte getFb() {
		return fb;
	}
	
	protected void setFb(byte fb) {
		this.fb = fb;
	}
	public Compra getCompra() {
		return compra;
	}
	public NoAvl getEsq() {
		return esq;
	}
	public void setEsq(NoAvl esq) {
		this.esq = esq;
	}
	public NoAvl getDir() {
		return dir;
	}
	public void setDir(NoAvl dir) {
		this.dir = dir;
	}
	@Override
	public String toString() {
		return  ""+this.compra.getCliente().getCpf();
	}
}
