package atividade3;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	/*
	 * ListaEncadeada(): construtor da classe. Deve definir que a lista está vazia
	 */

	public ListaEncadeada() {
		primeiro = null;
	}

	/* getPrimeiro(): método getter da variável primeiro. */

	public NoLista<T> getPrimeiro() {
		return primeiro;
	}

	/*
	 * inserir(T): Deve inserir um novo nó no início da lista. Este novo nó deve
	 * armazenar o valor recebido na variável paramétrica info.
	 */

	public void inserir(T info) {
		NoLista<T> novo = new NoLista<T>();

		novo.setInfo(info);

		novo.setProximo(primeiro);

		this.primeiro = novo;
	}

	/*
	 * estaVazia(): Deve retornar true se a lista estiver vazia ou false se tiver
	 * algum nó encadeado.
	 */

	public Boolean estaVazia() {
		if (primeiro == null) {
			return true;
		}
		return false;
	}
	
	

}
