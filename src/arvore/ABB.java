package arvore;

import java.util.ArrayList;

import models.Compra;

public class ABB {
	private NoAbb raiz;
	private int nElem;

	public ABB() {
		this.nElem = 0;
	}

	public boolean eVazia() {
		if (this.raiz == null) { // this.nElem==0
			return true;
		} else {
			return false;
		}
	}

	public NoAbb getRaiz() {
		return raiz;
	}

	public int getnElem() {
		return nElem;
	}
	
	private NoAbb pesquisar(String elem) {
		 
		return pesquisar(elem, this.raiz);
	}

	private NoAbb pesquisar(String elem, NoAbb no) {
		if (no == null) {
			return null;
		} else {
			if (elem.compareTo(no.getCompra().getCliente().getCpf()) < 0) {
				no = pesquisar(elem, no.getEsq());
			} else if (elem.compareTo(no.getCompra().getCliente().getCpf()) > 0) {
				no = pesquisar(elem, no.getDir());
			}
			return no;
		}
	}

	public void inserir(Compra compra) {
		NoAbb no = pesquisar(compra.getCliente().getCpf());
		if (no == null) {
			this.raiz = inserir(compra, this.raiz);
		}
	}

	private NoAbb inserir(Compra compra, NoAbb no) {
		if (no == null) {
			NoAbb novo = new NoAbb(compra);
			this.nElem++;
			return novo;
		} else {
			if (compra.getCliente().getCpf().compareTo(no.getCompra().getCliente().getCpf()) > 0) {
				no.setDir(inserir(compra, no.getDir()));
			} else {
				no.setEsq(inserir(compra, no.getEsq()));
			}
			return no;
		}
	}

	// fazer um inserir para inserir o no completo
	public ArrayList<NoAbb> CamCentral() {
		ArrayList<NoAbb> vetor = new ArrayList<NoAbb>(this.nElem);
		return (fazCamCentral(vetor, this.raiz));
	}

	private ArrayList<NoAbb> fazCamCentral(ArrayList<NoAbb> vetor, NoAbb no) {
		if (no != null) {
			vetor = fazCamCentral(vetor, no.getEsq());
			vetor.add(no);
			vetor = fazCamCentral(vetor, no.getDir());
		}
		return vetor;
	}

	public ABB balancear() {
		ABB arv = new ABB();
		ArrayList<NoAbb> vetor = CamCentral();
		imprime();
		balancear(vetor, arv, 0, vetor.size() - 1);
		return arv;
	}

	private void balancear(ArrayList<NoAbb> vetor, ABB arv, int inicio, int fim) {
		int meio;
		if (fim >= inicio) {
			meio = (fim+inicio)/2;
			arv.inserir(vetor.get(meio).getCompra()); 
			balancear(vetor, arv, inicio, meio-1);
			balancear(vetor, arv,  meio+1, fim);
		}
	}
	public String imprime() {
		ArrayList<NoAbb> vetor = CamCentral();
		String temp = "";
		for(NoAbb no : vetor) {
			temp += no.getCompra().getCliente().getCpf()+ "   |   ";
		}
		return temp;
	}
}
