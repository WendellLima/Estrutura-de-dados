package ArvoreBinariaBusca.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	Scanner informeNo = new Scanner(System.in);
	
	ArvoreBinariaBusca ab = new ArvoreBinariaBusca(45);
	
	
	ab.adicionaNo(new No(30), ab.getArvoreBinaria());
	ab.adicionaNo(new No(60), ab.getArvoreBinaria());
	ab.adicionaNo(new No(20), ab.getArvoreBinaria());
	ab.adicionaNo(new No(40), ab.getArvoreBinaria());
	ab.adicionaNo(new No(10), ab.getArvoreBinaria());
	ab.adicionaNo(new No(25), ab.getArvoreBinaria());
	ab.adicionaNo(new No(27), ab.getArvoreBinaria());
	ab.adicionaNo(new No(35), ab.getArvoreBinaria());
	ab.adicionaNo(new No(42), ab.getArvoreBinaria());
	
	ab.adicionaNo(new No(50), ab.getArvoreBinaria());
	ab.adicionaNo(new No(49), ab.getArvoreBinaria());
	ab.adicionaNo(new No(52), ab.getArvoreBinaria());
	
	ab.adicionaNo(new No(75), ab.getArvoreBinaria());
	ab.adicionaNo(new No(70), ab.getArvoreBinaria());
	ab.adicionaNo(new No(80), ab.getArvoreBinaria());

	

		  
		  
			System.out.print("\n***********************************");
			System.out.print("\n ----   Entre com a opcao:");
			System.out.print("\n ----1: Imprimir Raiz e nós");
			System.out.print("\n ----2: Imprimir nós folhas");
			System.out.print("\n ----3: Pesquisar resultados de um nó");
			System.out.print("\n ----4: Imprimir grau dos nós");
			System.out.print("\n ----5: Imprimir altura dos nós");
			System.out.print("\n ----6: Imprimir profundidade dos nós");
			System.out.print("\n ----7: Imprimir níveis dos nós");
			System.out.print("\n ----8: Imprimir subárvores");
			System.out.print("\n ----9: Quantidade de nós");
			System.out.print("\n ----10: Inserir um nó");
			System.out.print("\n ----11: Sair do programa");
			System.out.print("\n***********************************");
			System.out.print("\n-> ");
	
	
		  System.out.println("Informe sua opção de escolha:");
		  int opcao = entrada.nextInt();
		  switch (opcao) {
		  
		     case 1:
		    	 
		        System.out.println("A raiz da árvore é: " + ab.getArvoreBinaria().valor);
		        System.out.print("\n");
		        System.out.print("Segue relatório de nós: ");
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
		    	 
		    	 System.out.print("Os nós folhas são: " + "\n");
		    	 ab.Nosfolhas(ab.getArvoreBinaria());
		    		
		       break;
		     case 3:
		    	 
		    	 System.out.print("\n Informe o nó (inteiro) -> ");
		    	 System.out.print("\n");
		    	 int n = informeNo.nextInt();
		    	
		    	ab.verificarGrau(n);
		    	ab.verificaAltura(n);
		    	ab.verificaProfundidade(n);
		    	ab.verificaNivel(n);
		    		
		       break;
		     case 4:
		    	 
		    	   System.out.println("Segue relatório de grau por nó: ");
		    	   ab.verificarAllgraus(ab.getArvoreBinaria());
		    	   
		    	   break;
		     case 5:
		    	 
			       System.out.println("Segue relatório de altura por nó: ");
			       ab.verificarAllAltura(ab.getArvoreBinaria());
			       
			       break;
		     case 6:
		    	 
			       System.out.println("Segue relatório de profundidade por nó: ");
			       ab.verificarAllProfundidade(ab.getArvoreBinaria());
			       
			       break;
		     case 7:
		    	 
			       System.out.println("Segue relatório de nível por nó: ");
			       ab.verificarAllNivel(ab.getArvoreBinaria());
			       
			       break;
		     case 8:
		    	 
			       System.out.println("Segue subárvores");
			       ab.mostrar();
			       
			       break;

		     case 9:
		    	 

			       System.out.print("Quantidade de Nós: " + ab.contarNos(ab.getArvoreBinaria()));
			       
			       break;    
			       
			       
		     case 10:
		    	 

		    	 System.out.print("\n Informe o nó para inserir -> ");
		    	 System.out.print("\n");
		    	 int s = informeNo.nextInt();
		    	 
		    	 
		    	 System.out.print("\n A árvore antes de inserir é assim: ");  
		    	 ab.mostrar();
		    	 
		    	 ab.adicionaNo(new No(s), ab.getArvoreBinaria());
		    	 
		    	 System.out.print("\n A árvore depois de inserir é assim: ");		    	 
		    	 ab.mostrar();
			       
			       break;        
			       
			       
		     default:
		       System.out.println("Número inválido");
		  }
		
	

	
	
	
	
	
	



	}


}
