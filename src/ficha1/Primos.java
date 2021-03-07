package ficha1;

public class Primos {
	
	public static int numero = 1;
	public static int resto = 0;
	
	public static boolean ehPrimo(int n) {
		if(numero == n) {
			if(n == 1) {
				return false;
			}else {
				return true;
			}
		}else if(n <= 1){
			return false;
		}else {
			++numero;
			if( n/numero != n) {
				resto += n%numero;
				if(resto > 0) {
					resto = 0;
					return ehPrimo(n);
				}else {
					return false;
				}
			}else {
				return ehPrimo(n);
			}
		}
	}

}
