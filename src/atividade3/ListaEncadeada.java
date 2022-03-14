package atividade3;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	/*
	 * ListaEncadeada(): construtor da classe. Deve definir que a lista está vazia
	 */

	public ListaEncadeada() {

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
		return primeiro == null;

	}

	/*
	 * buscar(T): Deve procurar na lista encadeada se há um nó cujo conteúdo seja
	 * igual à variável info. Caso seja localizado, deverá retornar este nó (objeto
	 * da classe NoLista). Se não for localizado, deverá retornar null.
	 */

	public NoLista<T> buscar(T info) {
		return null;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("[");
		
		NoLista p = primeiro;
		
		while(p != null) {
			buffer.append(p.getInfo() + " ");
			p = p.getProximo();
		}
		buffer.append("]");
		return buffer.toString();
	}

}
