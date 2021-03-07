package nomesRepetidos;

public class Result {
	public static ImplementedList novaLista = new ImplementedList();
	public static int contador = 0;

	public static int attendance(String value) {

		String[] auxiliar = value.split("\n");

		for (int i = 0; i < auxiliar.length; i++) {
			auxiliar[i] = auxiliar[i].toLowerCase();
		}

		novaLista.inserir(auxiliar[0]);

		for (int i = 0; i < auxiliar.length; i++) {
			colocarNaLista(auxiliar[i]);
		}

		return novaLista.tamanho;
	}

	private static void colocarNaLista(String e) {

		String[] auxiliar2 = e.split(" ");
		for (int j = novaLista.tamanho - 1; j < novaLista.tamanho; j++) {
			for (int i = 0; i < auxiliar2.length; i++) {
				if (!novaLista.componentes[j].contains(auxiliar2[i])) {
					novaLista.inserir(e);
					j = novaLista.tamanho;
					i = auxiliar2.length;
					break;
				} else {
					break;
				}
			}
		}
	}

}
