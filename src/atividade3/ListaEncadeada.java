package atividade3;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	/*
	 * ListaEncadeada(): construtor da classe. Deve definir que a lista est� vazia
	 */

	public ListaEncadeada() {
		primeiro = null;
	}

	/* getPrimeiro(): m�todo getter da vari�vel primeiro. */

	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	/*
	 * inserir(T): Deve inserir um novo n� no in�cio da lista. Este novo n� deve
	 * armazenar o valor recebido na vari�vel param�trica info.
	 */

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();

		novo.setInfo(info);

		novo.setProximo(primeiro);

		this.primeiro = novo;
	}

	/*
	 * estaVazia(): Deve retornar true se a lista estiver vazia ou false se tiver
	 * algum n� encadeado.
	 */

	public Boolean estaVazia() {
		if (primeiro == null) {
			return true;
		}
		return false;
	}
	
	

}
