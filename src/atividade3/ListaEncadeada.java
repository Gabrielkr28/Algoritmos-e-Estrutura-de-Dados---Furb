package atividade3;

public class ListaEncadeada<T> {

	private NoLista<T> primeiro;

	/*
	 * ListaEncadeada(): construtor da classe. Deve definir que a lista est� vazia
	 */

	public ListaEncadeada() {

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
		return primeiro == null;

	}

	/*
	 * buscar(T): Deve procurar na lista encadeada se h� um n� cujo conte�do seja
	 * igual � vari�vel info. Caso seja localizado, dever� retornar este n� (objeto
	 * da classe NoLista). Se n�o for localizado, dever� retornar null.
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
