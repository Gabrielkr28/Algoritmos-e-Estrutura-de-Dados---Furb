package atividade7ArvoreBinaria;

public class ArvoreBinaria<T> {

	NoArvoreBinaria<T> raiz;

	public ArvoreBinaria() {
		raiz = null;
	}

	public void setRaiz(NoArvoreBinaria<T> raiz) {
		this.raiz = raiz;
	}

	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}

	public boolean estaVazia() {
		return (raiz == null);
	}

	public boolean pertence(T info) {
		return pertence(raiz, info);
	}

	private boolean pertence(NoArvoreBinaria<T> no, T info) {
		if (no == null)
			return false;
		else // Para alterar o tipo de verificacao, � s� alterar a pesquisa desses caras
				// aqui.
			return (no.getInfo().equals(info)) || pertence(no.getEsquerda(), info) || pertence(no.getDireita(), info);
	}

	@Override
	public String toString() {

		return arvorePre(raiz);

	}

	private String arvorePre(NoArvoreBinaria<T> no) {
		if (no == null)
			return "<>";
		else
			return "<" + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
	}

	public int contarNos() {
		return contarNos(raiz);
	}

	private int contarNos(NoArvoreBinaria<T> no) {
		if (no == null)
			return 0;
		else
			return 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());

	}

}
