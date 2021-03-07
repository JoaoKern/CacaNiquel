package cacaNiquel;

public class ListaCircular {
	No come�o;
	No corpo;

	public ListaCircular() {
		this.come�o = null;
		corpo = null;
	}

	public void inserir(String valor) {
		No lista = new No(valor);

		if (come�o == null) {
			come�o = lista;
		} else {
			corpo.next = lista;
		}
		corpo = lista;
		corpo.next = come�o;
	}

}
