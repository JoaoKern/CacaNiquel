package uniaoConjuntos;

public class Lista {
	public Node prim = null;
	public int posiçao = 0;

	public void adicionar(String elemento) {
		Node atual = new Node(elemento);

		if (prim == null) {
			prim = atual;
			return;
		}
		Node aux = prim;
		while (aux.prox != null) {
			aux = aux.prox;
		}

		aux.prox = atual;
		posiçao++;
	}

	public String toString() {
		String str = "";
		Node atual = prim;
		while (atual != null) {
			str += atual.data + " ";
			atual = atual.prox;
		}
		return str;
	}

	public static boolean checar(String[] conjunto, String valor) {
		String palavra;

		for (int i = 0; i < conjunto.length; i++) {
			palavra = conjunto[i];
			if (palavra.equals(valor)) {
				return true;
			}
		}
		return false;
	}

}
