package ArvoreBinaria.main;

public class Main {

	public static void main(String[] args) {
		
	ArvoreBinaria ab = new ArvoreBinaria(17);
	
	ab.adicionaNo(new No(9), ab.getArvoreBinaria());
	ab.adicionaNo(new No(6), ab.getArvoreBinaria());
	ab.adicionaNo(new No(5), ab.getArvoreBinaria());
	ab.adicionaNo(new No(14), ab.getArvoreBinaria());
	ab.adicionaNo(new No(20), ab.getArvoreBinaria());
	ab.adicionaNo(new No(18), ab.getArvoreBinaria());
	ab.adicionaNo(new No(8), ab.getArvoreBinaria());
	ab.adicionaNo(new No(7), ab.getArvoreBinaria());
	
	
	ab.Nosfolhas(ab.getArvoreBinaria());
	//ab.verificarGrau(17);
	//ab.verificaAltura(17);
	//ab.verificaProfundidade(17);
	//ab.verificaNivel(17);
	
	System.out.print("\n");
	System.out.print("EmOrdem" + "\n");
	ab.EmOrdem(ab.getArvoreBinaria());
	//System.out.print("\n");
	//System.out.print("PreOrdem" + "\n");
	//ab.PreOrdem(ab.getArvoreBinaria());
	//System.out.print("\n");
	//System.out.print("PosOrdem" + "\n");
	//ab.PosOrdem(ab.getArvoreBinaria());


	}

}
