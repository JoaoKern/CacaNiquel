package cacaNiquel;

public class ListaCircular {
	No começo;
	No corpo;

	public ListaCircular() {
		this.começo = null;
		corpo = null;
	}

	public void inserir(String valor) {
		No lista = new No(valor);

		if (começo == null) {
			começo = lista;
		} else {
			corpo.next = lista;
		}
		corpo = lista;
		corpo.next = começo;
	}

}
