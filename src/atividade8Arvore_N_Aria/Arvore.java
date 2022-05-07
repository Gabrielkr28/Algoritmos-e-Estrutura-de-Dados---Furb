package atividade8Arvore_N_Aria;

public class Arvore<T> {

	NoArvore<T> raiz;

	public Arvore() {

	}

	public NoArvore<T> getRaiz() {
		return raiz;
	}

	public void setRaiz(NoArvore<T> raiz) {
		this.raiz = raiz;
	}

	public boolean pertence(T info) {
		if (raiz == null)
			return false;
		else
			return pertence(raiz, info);
	}

	private boolean pertence(NoArvore<T> no, T info) {
		if (no.getInfo() == info) {
			return true;
		} else {
			NoArvore<T> p;
			p = no.getPrimeiro();
			while (p != null) {
				if (pertence(p, info)) {
					return true;
				}
				p = p.getProximo();
			}
			return false;
		}

	}

	@Override
	public String toString() {
		if (raiz == null)
			return "";
		else
			return obterRepresentacaoTextual(raiz);
	}

	private String obterRepresentacaoTextual(NoArvore<T> no) {
		String retorno = "<";
		retorno += no.getInfo();

		NoArvore<T> p = no.getPrimeiro();
		while (p != null) {
			retorno += obterRepresentacaoTextual(p);
			p = p.getProximo();
		}
		retorno += ">";
		return retorno;
	}

	public int contarNos() {
		if (raiz == null)
			return 0;
		else
			return contarNos(raiz);
	}

	private int contarNos(NoArvore<T> no) {
		int contador = 0;
		NoArvore<T> p = no.getPrimeiro();
		while (p != null) {
			contador++;
			p = p.getProximo();
		}
		return contador;
	}

}
