package ficha1;

public class Desenhar {

	public static int altura = 0;
	public static int largura = 0;
	public static int asteriscos = 0;
	public static int espa�os = 0;
	public static int come�o = 0;
	public static String linha = "";

	public static String draw(int imageSize, int numberOfAsterisk, int numberOfSpaces) {
		if (altura == imageSize) {
			return linha;
		} else {
			if (largura == imageSize - 1) {
				linha += "|\n";
				come�o = 0;
				altura++;
				largura = 0;
				return draw(imageSize, numberOfAsterisk, numberOfSpaces);
			} else {
				if (come�o == 0) {
					linha += "|";
					largura++;
					come�o++;
					return draw(imageSize, numberOfAsterisk, numberOfSpaces);
				} else {
					if (largura < imageSize - 1) {
						if (asteriscos < numberOfAsterisk) {
							linha += "*";
							asteriscos++;
							largura++;
							return draw(imageSize, numberOfAsterisk, numberOfSpaces);
						} else if (espa�os < numberOfSpaces) {
							linha += " ";
							espa�os++;
							largura++;
							return draw(imageSize, numberOfAsterisk, numberOfSpaces);
						} else {
							espa�os = 0;
							asteriscos = 0;
							return draw(imageSize, numberOfAsterisk, numberOfSpaces);
						}
					}
				}
			}
		}
		return linha;
	}
}
