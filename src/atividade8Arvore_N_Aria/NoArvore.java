package atividade8Arvore_N_Aria;

public class NoArvore<T> {

	private T info;
	private NoArvore<T> primeiro;
	private NoArvore<T> proximo;

	public NoArvore(T info) {
		this.info = info;
		primeiro = null;
		proximo = null;
	}

	public T getInfo() {
		return info;
	}

	public NoArvore<T> getPrimeiro() {
		return primeiro;
	}

	public NoArvore<T> getProximo() {
		return proximo;
	}

	public void inserirFilho(NoArvore<T> sa) {
		sa.proximo = primeiro;
		primeiro = sa;
	}

}
