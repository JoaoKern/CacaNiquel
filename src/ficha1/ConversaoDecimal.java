package ficha1;
import java.math.*;

public class ConversaoDecimal {
	
	public static int soma;
	public static int contador;
	public static int contadorExpoente;
	
	public static int converter(String num, int base) {
		
		contadorExpoente = (num.length()-1) - contador;
		
		if(contador == num.length()) {
			return soma;
		}else {
		    char letra;
		    int variavel;
		    
		    if(num.charAt(contador)>=65 && num.charAt(contador)<=90) {

                int correspondenteLetra = num.charAt(contador) - 55;
                soma += correspondenteLetra*(Math.pow(base, contadorExpoente));
                contador++;

            }else {
			
			letra = num.charAt(contador);
			String meuString = Character.toString(letra);
			variavel = Integer.parseInt(meuString);
			
			soma += Math.pow(base, contadorExpoente) * variavel;
			
			contador ++;
            }
			
			return converter(num, base);			
		}
	} 

}
