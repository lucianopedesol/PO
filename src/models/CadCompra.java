package models;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CadCompra implements InterfaceOrdenacao, InterfaceVetor {
	private List<Compra> compras = new ArrayList<Compra>();

	public List<Compra> GetAll() {
		// TODO Auto-generated method stub
		return compras;
	}
	
	@Override
	public void Insert(Compra compra) {
		// TODO Auto-generated method stub
		compras.add(compra);
	}
	
	@Override
	public Compra Get(int pos) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void Remove(String cpf, Calendar data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void InsercaoDireta() {
		// TODO Auto-generated method stub

	}

	@Override
	public void QuickSort() {
		 
	}

	 

	@Override
	public void QuickComInsercao() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ShellSort() {
		// TODO Auto-generated method stub

	}

}
