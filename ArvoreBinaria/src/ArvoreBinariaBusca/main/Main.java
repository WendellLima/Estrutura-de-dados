package ArvoreBinariaBusca.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	

	
    public static void menu(){
    	System.out.println("\n");
    	System.out.println("\n");
    	System.out.println("\n");
		System.out.print("\n***********************************");
		System.out.print("\n ----   Entre com a opcao:");
		System.out.print("\n ----1: Imprimir Raiz e n?s");
		System.out.print("\n ----2: Imprimir n?s folhas");
		System.out.print("\n ----3: Pesquisar resultados de um n?");
		System.out.print("\n ----4: Imprimir grau dos n?s");
		System.out.print("\n ----5: Imprimir altura dos n?s");
		System.out.print("\n ----6: Imprimir profundidade dos n?s");
		System.out.print("\n ----7: Imprimir n?veis dos n?s");
		System.out.print("\n ----8: Imprimir sub?rvores");
		System.out.print("\n ----9: Quantidade de n?s");
		System.out.print("\n ----10: Inserir um n?");
		System.out.print("\n ----11: Remover um n?");
		System.out.print("\n ----12: Inverter ?rvore");
		System.out.print("\n ----0: Sair do programa");
		System.out.print("\n***********************************");
		System.out.print("\n-> ");	
		System.out.print("Informe sua op??o de escolha:");
		System.out.print("\n-> ");

    }
    

	
	

	public static void main(String[] args) {
		

		
	Scanner entrada = new Scanner(System.in);
	Scanner informeNo = new Scanner(System.in);
	
	ArvoreBinariaBusca ab = new ArvoreBinariaBusca(0);
	
	int[] list = {45, 30, 60, 20, 40, 10, 25, 27, 35, 42, 50, 49, 52, 75, 70, 80};
	
	//1, 5, 9, 8
	//45, 30, 60, 20, 40, 10, 25, 27, 35, 42, 50, 49, 52, 75, 70, 80
	
	ab.insertList(ab,list);

		  
	 int opcao;
	do{	
		

		
		
		
		
         menu();
         opcao = entrada.nextInt();
         
         switch(opcao){
         case 1:
		        System.out.println("A raiz da ?rvore ?: " + ab.getArvoreBinaria().valor);
		        System.out.print("\n");
		        System.out.print("Segue relat?rio de n?s: ");
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
	    	 System.out.print("Os n?s folhas s?o: " + "\n");
	    	 ab.Nosfolhas(ab.getArvoreBinaria());
             break;
             
         case 3:
	    	 System.out.print("\n Informe o n? (inteiro) -> ");
	    	 System.out.print("\n");
	    	 int n = informeNo.nextInt();
	    	
	    	ab.verificarGrau(n);
	    	ab.verificaAltura(n);
	    	ab.verificaProfundidade(n);
	    	ab.verificaNivel(n);
             break;
             
         case 4:
	    	   System.out.println("Segue relat?rio de grau por n?: ");
	    	   ab.verificarAllgraus(ab.getArvoreBinaria());
             break;
             
         case 5:
        	 System.out.println("Segue relat?rio de altura por n?: ");
		       ab.verificarAllAltura(ab.getArvoreBinaria());
       	  
       	  	break;
       	  	
         case 6:
        	 System.out.println("Segue relat?rio de profundidade por n?: ");
		       ab.verificarAllProfundidade(ab.getArvoreBinaria());
          	  
          	  break;
          	  
          	  
         case 7:
        	  System.out.println("Segue relat?rio de n?vel por n?: ");
		       ab.verificarAllNivel(ab.getArvoreBinaria());
          	  
          	  break;
          	  
          	  
         case 8:
        	 System.out.println("Segue sub?rvores");
		       ab.mostrar();
          	  
          	  break;
         
         case 9:
        	 System.out.print("Quantidade de N?s: " + ab.contarNos(ab.getArvoreBinaria()));
          	  
          	  break;
          	  
         case 10:
        	 System.out.print("\n Informe o n? para inserir -> ");
	    	 System.out.print("\n");
	    	 int s = informeNo.nextInt();
	    	 
	    	 
	    	 System.out.print("\n A ?rvore antes de inserir ? assim: ");  
	    	 ab.mostrar();
	    	 
	    	 ab.adicionaNo(new No(s), ab.getArvoreBinaria());
	    	 
	    	 System.out.print("\n A ?rvore depois de inserir ? assim: ");		    	 
	    	 ab.mostrar();
          	  
          	  break;
          	  
         case 11:

	    	 System.out.print("\n Informe o n? para remover -> ");
	    	 System.out.print("\n");
	    	 int r = informeNo.nextInt();
	    	 
	    	 
	    	 System.out.print("\n A ?rvore antes de remover ? assim: ");  
	    	 ab.mostrar();
	    	 
	    	 ab.remover(r);
	    	 
	    	 System.out.print("\n A ?rvore depois de remover ? assim: ");		    	 
	    	 ab.mostrar();
          	  
          	  break;
          	  
          	  
         case 12:
        	 System.out.print("\n A ?rvore normal ? assim: ");
        	 ab.mostrar();
        	 System.out.print("\n A ?rvore invertida ? assim: ");
	    	 ab.mostrarInvertida();
          	  
          	  break;
          	  
	  
         
         default:
             System.out.println("Programa encerrado.");
         }
     } while(opcao != 0);


			
	 
	 
	 
	 
	 
			
		 
		
	

	
	
	
	
	
	



		  
		  
	}


}
