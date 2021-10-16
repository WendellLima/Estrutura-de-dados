package ArvoreBinariaBusca.main;

public class ArvoreBinariaBusca {
	
	No raiz;
	
	public ArvoreBinariaBusca (int valor) {
		raiz = new No(valor);
	}
	
	public No getArvoreBinaria() {
		return raiz;
	}
	
	
	public void getPai(int valor) {
		No no = buscar(valor);
		if(no.pai != null) {
			System.out.println("O pai do nó" + valor + " é " + no.pai.valor);
		}else {
			System.out.println("O nó " + valor + " é a raiz da árvore.");
		}
			
	}
	
	
	public void adicionaNo (No novoNo, No raiz) {
		
		if (novoNo.valor > raiz.valor) {
			if (raiz.direito != null) {
				adicionaNo (novoNo, raiz.direito);
			}else raiz.direito = novoNo;
				  raiz.direito.pai = raiz;
		}else {
			if (raiz.esquerdo != null) {
				adicionaNo(novoNo, raiz.esquerdo);
			}else raiz.esquerdo = novoNo;
				  raiz.esquerdo.pai = raiz;
		}
	}
	
	
	public boolean remover(int valor) {
	    if (raiz == null) return false; 

	    No atual = raiz;
	    No pai = raiz;
	    boolean filho_esq = true;

	   
	    while (atual.valor != valor) { 
	      pai = atual;
	      if(valor < atual.valor ) { 
	        atual = atual.esquerdo;
	        filho_esq = true;
	      }else {
	        atual = atual.direito; 
	        filho_esq = false;
	      }if (atual == null) return false;
	    }
	    
	    
	    if (atual.esquerdo == null && atual.direito == null) {
	      if (atual == raiz ) raiz = null;
	      else if (filho_esq) pai.esquerdo = null;
	           else pai.direito = null;
	    }

	   
	    else if (atual.direito == null) {
	       if (atual == raiz) raiz = atual.esquerdo;
	       else if (filho_esq) pai.esquerdo = atual.esquerdo;
	            else pai.direito = atual.esquerdo;
	    }
	    
	    else if (atual.esquerdo == null) {
	       if (atual == raiz) raiz = atual.direito;
	       else if (filho_esq) pai.esquerdo = atual.direito;
	            else pai.direito = atual.direito;
	    }

	    
	    else {
	      No sucessor = no_sucessor(atual);
	     
	      if (atual == raiz) raiz = sucessor;
	      else if(filho_esq) pai.esquerdo = sucessor;
	           else pai.direito = sucessor;
	      sucessor.esquerdo = atual.esquerdo;
	                              
	    }

	    return true;
	  }
		
	
	private No no_sucessor(No apaga) {
		No paidosucessor = apaga;
	     No sucessor = apaga;
	     No atual = apaga.direito;

	     while (atual != null) {
	       paidosucessor = sucessor;
	       sucessor = atual;
	       atual = atual.esquerdo;
	     } 
	  
	     if (sucessor != apaga.direito) {
	       paidosucessor.esquerdo = sucessor.direito;

	       sucessor.direito = apaga.direito; 
	     }
	     return sucessor;
		
	}

	public void busca(int valor) {
		busca(this.raiz, valor);
	}
	
	
	public void busca (No no, int valor) {
		System.out.println("focando no nó " + no.valor);
		if (no.valor == valor) {
			System.out.println("O nó " + valor + " foi encontrado.");
		}else if ((valor < no.valor) && (no.esquerdo != null)){
			busca (no.esquerdo, valor);
		}else if ((valor > no.valor) && (no.direito != null)) {
			busca (no.direito, valor);
		}else {
			System.out.println("O nó " + valor + " não foi incontrado.");
		}
	}
	
	
		public void Nosfolhas(No raiz) {
			if (raiz == null) {
				return;
			}else {				
				Nosfolhas(raiz.esquerdo);
				Nosfolhas(raiz.direito);
				if (raiz.direito == null && raiz.esquerdo == null) {
					System.out.print(raiz.valor + "\t");					
				}
				
			}
		}
		
		public void mostrar() {
			mostrarArvore(raiz, "   ");
		}
		
		private void mostrarArvore(No raiz, String espaco) {
			if (raiz == null) return;
			mostrarArvore(raiz.direito, espaco + "   ");
			System.out.print("\n");
			System.out.print(espaco + raiz.valor);
			mostrarArvore(raiz.esquerdo, espaco + "   ");
			
			
		}
		
		
		
		
		public void mostrarInvertida() {
			mostrarArvoreInvertida(raiz, "   ");
		}
		
		private void mostrarArvoreInvertida(No raiz, String espaco) {
			if (raiz == null) return;
			mostrarArvoreInvertida(raiz.esquerdo, espaco + "   ");
			
			System.out.print("\n");
			System.out.print(espaco + raiz.valor);
			mostrarArvoreInvertida(raiz.direito, espaco + "   ");
			
			
		}
		



	
	
	//Em ordem ou ERD
	public void EmOrdem(No raiz) {
		if (raiz == null) return;
		EmOrdem(raiz.esquerdo);
		System.out.print(raiz.valor + "\t");
		EmOrdem(raiz.direito);
		
	}
	
	
	//Pre ordem ou RED
		public void PreOrdem(No raiz) {
			if (raiz == null) return;
			System.out.print(raiz.valor + "\t");
			PreOrdem(raiz.esquerdo);			
			PreOrdem(raiz.direito);
		}
		
		
	//Pos ordem ou EDR
			public void PosOrdem(No raiz) {
				if (raiz == null) return;				
				PosOrdem(raiz.esquerdo);			
				PosOrdem(raiz.direito);
				System.out.print(raiz.valor + "\t");
				}
	

	
	

			
			public No buscar(int valor) {
				return buscar(this.raiz, valor);
			}
			
			
			public No buscar (No no, int valor) {
				
				// impressão do caminho que foi pecorrido
				//System.out.println("focando no nó " + no.valor + "\t");
				if (no.valor == valor) {
					//System.out.println("O nó " + valor + " foi encontrado.");
					return no;
				}else if ((valor < no.valor) && (no.esquerdo != null)){
					return buscar (no.esquerdo, valor);					
				}else if ((valor > no.valor) && (no.direito != null)) {
					return buscar (no.direito, valor);
				}else {
					System.out.println("O nó " + valor + " não foi incontrado.");
					return null;
				}
			}
			
			
			
			public void verificarAllgraus(No raiz) {
				if (raiz == null) return;	
							
				No noEncontrado = buscar (raiz.valor);
				
				if (noEncontrado == null) {
					System.out.println("O valor n�o existe na arvore.");
				}else if (noEncontrado.direito == null && noEncontrado.esquerdo == null){
					System.out.println("O grau do n� " + raiz.valor + " � zero.");
				}else if (noEncontrado.direito != null && noEncontrado.esquerdo != null) {
					System.out.println("O grau do n� " + raiz.valor + " � dois.");
				}else {
					System.out.println("O grau do n� " + raiz.valor + " � um.");
				}
				verificarAllgraus(raiz.esquerdo);
				verificarAllgraus(raiz.direito);
				
				}
			
			public void verificarGrau (int valor) {
				No noEncontrado = buscar (valor);
				
				if (noEncontrado == null) {
					System.out.println("O valor n�o existe na arvore.");
				}else if (noEncontrado.direito == null && noEncontrado.esquerdo == null){
					System.out.println("O grau do n� " + valor + " � zero.");
				}else if (noEncontrado.direito != null && noEncontrado.esquerdo != null) {
					System.out.println("O grau do n� " + valor + " � dois.");
				}else {
					System.out.println("O grau do n� " + valor + " � um.");
				}
			}
			
			
			
			
			
			
			public void verificarAllAltura(No raiz) {
				if (raiz == null) return;	

				No noEncontrado = buscar(raiz.valor);
				System.out.println("A altura do n� " + raiz.valor + " � " + verificaAltura(noEncontrado));
				verificarAllAltura(raiz.esquerdo);
				verificarAllAltura(raiz.direito);
				
				}
			
			
			
			public void verificaAltura (int valor) {
				No noEncontrado = buscar(valor);
				System.out.println("A altura do n� " + valor + " � " + verificaAltura(noEncontrado));
			}
	
			
			public int verificaAltura(No no) {
				if (no == null) {
					return -1;
				}else if (no.direito == null && no.esquerdo == null) {
					return 0;
				}else if (no.direito == null) {
					return verificaAltura(no.esquerdo) + 1;
				}else if (no.esquerdo == null) {
					return verificaAltura(no.direito) + 1;
				}else {
					return Math.max(verificaAltura(no.esquerdo), verificaAltura(no.direito)) +1;
				}
				
				
				
			}
			
			public void verificarAllProfundidade(No raiz) {
				if (raiz == null) return;			

				No noEncontrado = buscar (raiz.valor);
				System.out.println("A profundidade do n� " + raiz.valor + " � " + verificaProfundidade(noEncontrado));
				verificarAllProfundidade(raiz.esquerdo);
				verificarAllProfundidade(raiz.direito);
				
				}
			
			
			
			public void verificaProfundidade (int valor) {
				No noEncontrado = buscar (valor);
				System.out.println("A profundidade do n� " + valor + " � " + verificaProfundidade(noEncontrado));
			}
			
			public int verificaProfundidade (No no) {
				if (no == null) {
					return -1;
				}else {
					return verificaProfundidade (no.pai) +1;
				}
					
			}
			
			
			
			
			
			public void verificarAllNivel(No raiz) {
				if (raiz == null) return;							
				
				No noEncontrado = buscar (raiz.valor);
				System.out.println("O nivel do n� " + raiz.valor + " � " + verificaNivel(noEncontrado));
				
				verificarAllNivel(raiz.esquerdo);
				verificarAllNivel(raiz.direito);
				
				}
			
			
			public void verificaNivel (int valor) {
				No noEncontrado = buscar (valor);
				System.out.println("O nivel do n� " + valor + " � " + verificaNivel(noEncontrado));
			}
			
			public int verificaNivel (No no) {
				if (no == null) {
					return -1;
				}else {
					return verificaNivel (no.pai) +1;
				}
					
			}
			
			public No min() {
			    No atual = raiz;
			    No anterior = null;
			    while (atual != null) {
			      anterior = atual;
			      atual = atual.esquerdo;
			    }
			    return anterior;
			  }

			  public No max() {
			    No atual = raiz;
			    No anterior = null;
			    while (atual != null) {
			      anterior = atual;
			      atual = atual.direito;
			    }
			    return anterior;
			  }
			  
			  
			  
			  public int contarNos(No atual) {
				   if(atual == null)  return 0;
				   else return ( 1 + contarNos(atual.esquerdo) + contarNos(atual.direito));
				  }



			public void insertList(ArvoreBinariaBusca ab, int[] list) {
					for (int i = 0; i < list.length; i++){
						

			          ab.adicionaNo(new No(list[i]), ab.getArvoreBinaria());
			          
			      }
					
					ab.remover(ab.getArvoreBinaria().valor);
					System.out.println("POS ORDEM");
					ab.PosOrdem(raiz);
					System.out.print("\n");
					System.out.println("EM ORDEM");					
					ab.EmOrdem(raiz);
					System.out.print("\n");
					System.out.println("PRE ORDEM");					
					ab.PreOrdem(raiz);
					
					
					
					System.out.print("\n");
					System.out.print("\n");
					System.out.println("�RVORE");
					ab.mostrar();
					
					
					
			}






			  
			  
			  

	
}
