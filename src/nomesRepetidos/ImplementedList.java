package nomesRepetidos;

public class ImplementedList {
	public String[] componentes;
	public int tamanho;

	public ImplementedList() {
		this.componentes = new String[1];
		this.tamanho = 0;
	}

	public boolean isFull() {
		return tamanho == componentes.length;
	}

	public void inserir(String e) {
		if (isFull()) {
			String temp[] = new String[tamanho * 2];
			for (int t = 0; t < tamanho; t++) {
				temp[t] = componentes[t];
			}

			componentes = temp;
		}
		componentes[tamanho++] = e.toLowerCase();
	}

	public boolean consultar(String e) {
		return consultarPosicao(e) != -1;
	}

	private int consultarPosicao(String e) {
		int r = -1;
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i].equals(e)) {
				r = i;
				break;
			}
		}
		return r;
	}

}
