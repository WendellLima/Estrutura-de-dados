package ArvoreBinaria.main;

public class No {
	
	public int valor;
	public No esquerdo;
	public No direito;
	public No pai;
	
	
	
	public No(int valor) {
		this.valor = valor;
		this.esquerdo = null;
		this.direito = null;
		this.pai = null;
	}
	
	
	public No(int valor, No esquerdo, No direito) {
		this.valor = valor;
		this.esquerdo = esquerdo;
		this.direito = direito;
	}
	
	

}
