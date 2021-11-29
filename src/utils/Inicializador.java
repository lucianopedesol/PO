package utils;

import java.io.IOException;

public class Inicializador {

	public static void main(String args[]) {
		String path = "Files/compra.txt" ;
 
		try {
			ManipuladorArquivo.leitor(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
