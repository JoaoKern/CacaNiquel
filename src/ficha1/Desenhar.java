package ficha1;

public class Desenhar {

	public static int altura = 0;
	public static int largura = 0;
	public static int asteriscos = 0;
	public static int espaços = 0;
	public static int começo = 0;
	public static String linha = "";

	public static String draw(int imageSize, int numberOfAsterisk, int numberOfSpaces) {
		if (altura == imageSize) {
			return linha;
		} else {
			if (largura == imageSize - 1) {
				linha += "|\n";
				começo = 0;
				altura++;
				largura = 0;
				return draw(imageSize, numberOfAsterisk, numberOfSpaces);
			} else {
				if (começo == 0) {
					linha += "|";
					largura++;
					começo++;
					return draw(imageSize, numberOfAsterisk, numberOfSpaces);
				} else {
					if (largura < imageSize - 1) {
						if (asteriscos < numberOfAsterisk) {
							linha += "*";
							asteriscos++;
							largura++;
							return draw(imageSize, numberOfAsterisk, numberOfSpaces);
						} else if (espaços < numberOfSpaces) {
							linha += " ";
							espaços++;
							largura++;
							return draw(imageSize, numberOfAsterisk, numberOfSpaces);
						} else {
							espaços = 0;
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
