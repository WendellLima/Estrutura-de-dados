package ArvoreBinaria.main;

public class Arvore <TIPO extends Comparable>{
	
	private Elemento<TIPO> raiz;
	
	public Arvore() {
		this.raiz = null;
	}
	
	
	public void adicionar (TIPO valor) {
		Elemento <TIPO> novoElemento = new Elemento<TIPO> (valor);
		if (raiz == null) {
			this.raiz = novoElemento;
		}else {
			Elemento <TIPO> atual = this.raiz;
			while(true) {
				if (novoElemento.getValor().compareTo(atual.getValor()) == -1) {
					if (atual.getEsquerda() != null) {
						atual = atual.getEsquerda();
					}else {
						atual.setEsquerda(novoElemento);
						break;
					}
					
				}else {
					if (atual.getDireita() != null) {
						atual = atual.getDireita();
					}else {
						atual.setDireita(novoElemento);
						break;
					}
				}
			}
		}
	}

	
	
	
	public Elemento<TIPO> getRaiz() {
		return raiz;
	}


	public void emOrdem(Elemento<Integer> atual) {
		if (atual != null) {
			emOrdem(atual.getEsquerda());
			System.out.print(atual.getValor() + " ");
			emOrdem(atual.getDireita());
			
		}
		
		
		
	}


	public void preOrdem(Elemento<Integer> atual) {
		if (atual != null) {
			System.out.println(atual.getValor());
			emOrdem(atual.getEsquerda());			
			emOrdem(atual.getDireita());
			
		}
		
	}
	
	
	public void posOrdem(Elemento<Integer> atual) {
		if (atual != null) {			
			emOrdem(atual.getEsquerda());			
			emOrdem(atual.getDireita());
			System.out.print(atual.getValor());
			
		}
		
	}


	public boolean remover (TIPO valor) {
		
		Elemento<TIPO> atual = this.raiz;
		Elemento<TIPO> paiAtual = null;
		while(atual != null) {
			if (atual.getValor().equals(valor)) {
				break;
				
			}else if (valor.compareTo(atual.getValor()) == -1){
				paiAtual = atual;
				atual = atual.getEsquerda();
			}else {
				paiAtual = atual;
				atual = atual.getDireita();
			}
		}
		if (atual != null) {
			
			if (atual.getDireita() != null) {
				
				Elemento <TIPO> substituto = atual.getDireita();
				Elemento <TIPO> paiSubstituto = atual;
				while (substituto.getEsquerda() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getEsquerda();
				}
				substituto.setEsquerda(atual.getEsquerda());
				if (paiAtual != null) {
					
				
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(substituto);
					}else {
						paiAtual.setDireita(substituto);
					}
				}else {
					this.raiz = substituto;
				}
				
				
				
				if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {					
					paiSubstituto.setEsquerda(null);
				}else {
					paiSubstituto.setDireita(null);
				}
				
				
				
				
			}else if (atual.getEsquerda() != null) {
				Elemento <TIPO> substituto = atual.getEsquerda();
				Elemento <TIPO> paiSubstituto = atual;
				while (substituto.getDireita() != null) {
					paiSubstituto = substituto;
					substituto = substituto.getDireita();
				}
				
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {
						paiAtual.setEsquerda(substituto);
					}else {
						paiAtual.setDireita(substituto);
					}
					
				}else {
					this.raiz = substituto;
				}
				
				
				if (substituto.getValor().compareTo(paiSubstituto.getValor()) == -1) {					
					paiSubstituto.setEsquerda(null);
				}else {
					paiSubstituto.setDireita(null);
				}
				
			}else {
				if (paiAtual != null) {
					if (atual.getValor().compareTo(paiAtual.getValor()) == -1) {					
						paiAtual.setEsquerda(null);
					}else {
						paiAtual.setDireita(null);
					}
				}else {
					this.raiz = null;
				}
				
			}
			return true;
		}else {
			return false;
		}
			
		
	}
	
	

}
