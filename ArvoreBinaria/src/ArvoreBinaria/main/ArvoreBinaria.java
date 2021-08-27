package ArvoreBinaria.main;

public class ArvoreBinaria {
	
	No raiz;
	
	public ArvoreBinaria (int valor) {
		raiz = new No(valor);
	}
	
	public No getArvoreBinaria() {
		return raiz;
	}
	
	
	public void getPai(int valor) {
		No no = buscar(valor);
		if(no.pai != null) {
			System.out.println("O pai do n�" + valor + " � " + no.pai.valor);
		}else {
			System.out.println("O n� " + valor + " � a raiz da �rvore.");
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
	
	
	
	public void busca(int valor) {
		busca(this.raiz, valor);
	}
	
	
	public void busca (No no, int valor) {
		System.out.println("focando no n� " + no.valor);
		if (no.valor == valor) {
			System.out.println("O n� " + valor + " foi encontrado.");
		}else if ((valor < no.valor) && (no.esquerdo != null)){
			busca (no.esquerdo, valor);
		}else if ((valor > no.valor) && (no.direito != null)) {
			busca (no.direito, valor);
		}else {
			System.out.println("O n� " + valor + " n�o foi incontrado.");
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
			EmOrdem(raiz.esquerdo);			
			EmOrdem(raiz.direito);
		}
		
		
	//Pos ordem ou EDR
			public void PosOrdem(No raiz) {
				if (raiz == null) return;				
				EmOrdem(raiz.esquerdo);			
				EmOrdem(raiz.direito);
				System.out.print(raiz.valor + "\t");
				}
	
	//
	
	

			
			public No buscar(int valor) {
				return buscar(this.raiz, valor);
			}
			
			
			public No buscar (No no, int valor) {
				//System.out.println("focando no n� " + no.valor + "\t");
				if (no.valor == valor) {
					//System.out.println("O n� " + valor + " foi encontrado.");
					return no;
				}else if ((valor < no.valor) && (no.esquerdo != null)){
					return buscar (no.esquerdo, valor);					
				}else if ((valor > no.valor) && (no.direito != null)) {
					return buscar (no.direito, valor);
				}else {
					System.out.println("O n� " + valor + " n�o foi incontrado.");
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
			
	
	
}
