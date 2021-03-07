package ficha1;

public class Cebolinha {
public static String palavra = "";
public static int cont = 0;
	
	public static String substituir(String s, char problema, char solucao) {		
		
		if(palavra.length() == s.length()) {
			return palavra;			
		}else {	
			
			if(cont == 0 && palavra.length() == 0) {
				   cont = s.length();
			}else {
				if(s.charAt(s.length() - cont) != problema) {
		           palavra += s.charAt(s.length() - cont);
		           cont--;
				}else {
					palavra += solucao;
					cont --;
				}
			}
		
		    return substituir(s, problema, solucao);	
		
		}
	}
	
}
