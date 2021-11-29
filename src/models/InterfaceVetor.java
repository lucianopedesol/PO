package models;

import java.util.Calendar;

public interface InterfaceVetor {

	public Compra Get(int pos);
	public void Insert(Compra compra);
	public void Remove(String cpf, Calendar data);
}
