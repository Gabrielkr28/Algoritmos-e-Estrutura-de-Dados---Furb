package atividade2;

public class ListaEstatica<E> {

	private Object[] info;
	private Integer tamanho;

	/*
	 * ListaEstatica(): construtor da classe. Deve criar um vetor para guardar os
	 * dados e estabelecer que a lista est� vazia;
	 */

	public ListaEstatica() {
		info = new Object[10];
		tamanho = 0;
	}

	/*
	 * redimensionar(): este m�todo dever� aumentar a capacidade de armazenamento da
	 * lista, criando um novo vetor com capacidade de armazenamento expandida em 10
	 * novas posi��es e copiar os dados do vetor original para o novo vetor criado.
	 * Por fim, o m�todo redimensionar() dever� assumir que o novo vetor info � o
	 * vetor recentemente criado;
	 */

	private void redimensionar() {
		Object[] novo = new Object[info.length + 10];

		for (int i = 0; i < tamanho; i++) {
			novo[i] = info[i];
		}

		info = novo;

	}

	/*
	 * inserir(int): Deve inserir o n�mero fornecido como argumento no vetor
	 * encapsulado pela lista. Caso o vetor encapsulado info n�o tenha mais posi��es
	 * livres, deve invocar o m�todo privado redimensionar(), para expandir a
	 * capacidade de armazenamento da lista;
	 */

	public void inserir(E valor) {
		if (tamanho >= info.length) {
			redimensionar();
			info[tamanho] = valor;
		}

		info[tamanho] = valor;
		tamanho += 1;

	}

	/*
	 * exibir(): Deve exibir o conte�do armazenado na lista, apresentando na tela o
	 * valor do primeiro n�mero at� o �ltimo n�mero armazenado, nesta ordem;
	 */

	public void exibir() {
		for (int i = 0; i < tamanho; i++) {
			System.out.println(info[i]);
		}
	}

	/*
	 * buscar(int): Deve procurar se h� um n�mero igual ao fornecido como argumento.
	 * Caso seja encontrado, este m�todo dever� retornar a posi��o do n�mero no
	 * vetor (�ndice no vetor). Se n�o for localizado, dever� retornar -1;
	 */

	public Integer buscar(E valor) {
		Integer posicao = -1;
		for (int i = 0; i < tamanho; i++) {
			if (info[i].equals(valor)) {
				return posicao = i;

			}
		}
		return posicao;
	}

	/*
	 * retirar(int): Deve retirar da lista o dado fornecido como argumento,
	 * deslocando todos os elementos das posi��es seguintes, uma posi��o para
	 * esquerda;
	 */
	public void retirar(Integer valor) {
		Integer position = -1;
		for (int i = 0; i < tamanho; i++) {
			if (info[i].equals(valor)) {
				position = i;
				break;
			}
		}
		if (position != -1) {
			for (int i = position; i < tamanho; i++) {
				info[i] = info[i + 1];
			}
			tamanho--;
		}
	}

	/*
	 * liberar(): Dever� limpar a estrutura de dados de forma que o vetor info seja
	 * redimensionado novamente para que tenha capacidade de armazenar apenas 10
	 * elementos;
	 */

	public void liberar() {
		info = new Object[10];
		tamanho = 0;
	}

	/*
	 * obterElemento(int): este m�todo dever� retornar o n�mero armazenado na
	 * posi��o fornecida como argumento. Caso o valor do par�metro corresponda a uma
	 * posi��o inexistente ou n�o ocupada, este m�todo dever� lan�ar a exce��o
	 * IndexOutOfBoundsException.
	 * 
	 * FINALIZAR
	 */
	public Object obterElemento(Integer posicao) throws IndexOutOfBoundsException {

		if (posicao < 0 || posicao > tamanho) {
			throw new IndexOutOfBoundsException("Posi��o inexistente: " + posicao);
		}
		return info[posicao];

	}

	public Boolean estaVazia() {
		if (tamanho == 0) {
			return true;
		}
		return false;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	/*
	 * Este m�todo dever� inverter a ordem em que os dados est�o armazenados na
	 * estrutura de dados, sem criar outro vetor.
	 */

	public void inverter() {
		int value = 0;
		int reference = 1;
		for (int i = tamanho / 2; i > 0; i--) {
			Object object = info[value];
			info[value] = info[tamanho - reference];
			info[tamanho - reference] = object;
			value++;
			reference++;
		}
	}

	@Override
	public String toString() {
		String vetor = "";
		for (int i = 0; i < tamanho; i++) {
			vetor += info[i] + ",";
		}
		vetor = vetor.substring(0, vetor.length() - 1);
		return vetor;

	}

}
