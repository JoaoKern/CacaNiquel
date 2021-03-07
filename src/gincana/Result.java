package gincana;

public class Result {
	public static String[] nomesAlunos = new String[1];

	public static int contador = 0;

	public static void expandirLista() {

		if (nomesAlunos.length == contador) {

			String[] auxiliar = new String[contador * 2];
			for (int i = 0; i < contador; i++) {
				auxiliar[i] = nomesAlunos[i];

			}

			nomesAlunos = auxiliar;

		}

	}

	public static void addToOrderedList(String value) {

		expandirLista();

		nomesAlunos[contador] = value;
		contador++;

		nomesAlunos = recolocarNomes(nomesAlunos, contador);

	}

	public static String[] recolocarNomes(String[] nomesAlunos, int contador) {

		for (int i = 0; i < contador; i++) {

			for (int j = i + 1; j < contador; j++) {

				if (nomesAlunos[j].compareTo(nomesAlunos[i]) < 0) {

					String auxiliar = nomesAlunos[i];
					nomesAlunos[i] = nomesAlunos[j];
					nomesAlunos[j] = auxiliar;

				}
			}
		}

		return nomesAlunos;

	}

	public static String orderedListToString() {

		String resp = "";

		for (int i = 0; i < contador; i++) {

			resp += nomesAlunos[i] + "\n";

		}

		return resp;

	}

}
