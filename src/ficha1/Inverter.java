package ficha1;

public class Inverter {

	public static String palavra = "";
	
	public static String fun(String s) {		
		if(palavra.length() == s.length()) {
			return palavra;			
		}else {			
		palavra += s.charAt(s.length() - (palavra.length()+1));
		    return fun(s);	
		}
	}
	
	
	
	
}
