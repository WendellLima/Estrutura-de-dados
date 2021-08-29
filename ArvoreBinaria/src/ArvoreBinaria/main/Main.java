package ArvoreBinaria.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	Scanner informeNo = new Scanner(System.in);
	
	ArvoreBinaria ab = new ArvoreBinaria(17);
	
	
	ab.adicionaNo(new No(9), ab.getArvoreBinaria());
	ab.adicionaNo(new No(6), ab.getArvoreBinaria());
	ab.adicionaNo(new No(5), ab.getArvoreBinaria());
	ab.adicionaNo(new No(14), ab.getArvoreBinaria());
	ab.adicionaNo(new No(20), ab.getArvoreBinaria());
	ab.adicionaNo(new No(18), ab.getArvoreBinaria());
	ab.adicionaNo(new No(8), ab.getArvoreBinaria());
	ab.adicionaNo(new No(7), ab.getArvoreBinaria());
	

		  
		  
			System.out.print("\n***********************************");
			System.out.print("\nEntre com a opcao:");
			System.out.print("\n ----1: Imprimir Raiz e n�s");
			System.out.print("\n ----2: Imprimir n�s folhas");
			System.out.print("\n ----3: Pesquisar resultados de um n�");
			System.out.print("\n ----4: Imprimir grau dos n�s");
			System.out.print("\n ----5: Imprimir altura dos n�s");
			System.out.print("\n ----6: Imprimir profundidade dos n�s");
			System.out.print("\n ----7: Imprimir n�veis dos n�s");
			System.out.print("\n ----8: Imprimir sub�rvores");
			System.out.print("\n ----9: Sair do programa");
			System.out.print("\n***********************************");
			System.out.print("\n-> ");
	
	
		  System.out.println("Informe sua op��o de escolha:");
		  int opcao = entrada.nextInt();
		  switch (opcao) {
		  
		     case 1:
		    	 
		        System.out.println("A raiz da �rvore �: " + ab.getArvoreBinaria().valor);
		        System.out.print("\n");
		        System.out.print("Segue relat�rio de n�s: ");
		        System.out.print("\n");
		        System.out.print("\n");
		   		System.out.print("EmOrdem" + "\n");
		   		ab.EmOrdem(ab.getArvoreBinaria());
		   		System.out.print("\n");
		   		System.out.print("PreOrdem" + "\n");
		   		ab.PreOrdem(ab.getArvoreBinaria());
		   		System.out.print("\n");
		   		System.out.print("PosOrdem" + "\n");
		   		ab.PosOrdem(ab.getArvoreBinaria());

		       
		       
		       
		       
		       
		       break;
		     case 2:
		    	 
		    	 System.out.print("Os n�s folhas s�o: " + "\n");
		    	 ab.Nosfolhas(ab.getArvoreBinaria());
		    		
		       break;
		     case 3:
		    	 
		    	 System.out.print("\n Informe o n� (inteiro) -> ");
		    	 System.out.print("\n");
		    	 int n = informeNo.nextInt();
		    	
		    	ab.verificarGrau(n);
		    	ab.verificaAltura(n);
		    	ab.verificaProfundidade(n);
		    	ab.verificaNivel(n);
		    		
		       break;
		     case 4:
		    	 
		    	   System.out.println("Segue relat�rio de grau por n�: ");
		    	   ab.verificarAllgraus(ab.getArvoreBinaria());
		    	   
		    	   break;
		     case 5:
		    	 
			       System.out.println("Segue relat�rio de altura por n�: ");
			       ab.verificarAllAltura(ab.getArvoreBinaria());
			       
			       break;
		     case 6:
		    	 
			       System.out.println("Segue relat�rio de profundidade por n�: ");
			       ab.verificarAllProfundidade(ab.getArvoreBinaria());
			       
			       break;
		     case 7:
		    	 
			       System.out.println("Segue relat�rio de n�vel por n�: ");
			       ab.verificarAllNivel(ab.getArvoreBinaria());
			       
			       break;
		     case 8:
		    	 
			       System.out.println("Segue sub�rvores");
			       
			       break;

		         
		     default:
		       System.out.println("N�mero inv�lido");
		  }
		
	

	
	
	
	
	
	



	}


}
