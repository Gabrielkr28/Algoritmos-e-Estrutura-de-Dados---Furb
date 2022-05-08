package atividadeFila1;

public class FilaVetor<T> implements Fila<T> {

	private T info[];
	private int limite;
	private int tamanho;
	private int inicio;

	@SuppressWarnings("unchecked")
	public FilaVetor(int limite) {
		info = (T[]) new Object[limite];
		tamanho = 0;
		inicio = 0;
		this.limite = limite;
	}

	@Override
	public void inserir(T valor) {
		if (tamanho == limite) {
			throw new FilaCheiaException();
		}

		int posicaoInserir;
		posicaoInserir = (inicio + tamanho) % limite;
		info[posicaoInserir] = valor;
		tamanho++;
	}

	@Override
	public boolean estaVazia() {
		return (tamanho == 0);
	}

	@Override
	public T peek() {
		if (estaVazia()) {
			throw new FilaVaziaException();
		}
		return info[inicio];
	}

	@Override
	public T retirar() {
		T backup = peek();
		info[inicio] = null;

		inicio = (inicio + 1) % limite;
		tamanho--;

		return backup;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void liberar() {
		info = (T[]) new Object[limite];
		tamanho = 0;
	}

	public FilaVetor<T> criarFilaConcatenar(FilaVetor<T> f2) {
		FilaVetor<T> f3 = new FilaVetor<T>(this.limite + f2.limite);

		int indice = this.inicio;
		for (int i = 0; i < this.tamanho; i++) {
			f3.inserir(this.info[indice]);
			indice = (indice + 1) % this.limite;
		}

		// Copia dados da fila atual
		indice = f2.inicio;
		for (int i = 0; i < f2.tamanho; i++) {
			f3.inserir(f2.info[indice]);
			indice = (indice + 1) % f2.limite;
		}

		return f3;
	}

	@Override
	public String toString() {
		String retorno = "";

		int indice = 0;
		for (int i = 0; i < tamanho; i++) {
			if (i > 0)
				retorno += ",";
		}

		retorno = retorno + info[indice];
		indice = (indice + 1) % limite;

		return retorno;
	}

}
