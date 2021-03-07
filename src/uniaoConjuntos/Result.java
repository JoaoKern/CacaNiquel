package uniaoConjuntos;

public class Result {
	public static Lista lista = new Lista();
    

    public static String uniaoConjuntos(String conj1, String conj2) {
        
        
        String[] conjunto1 = conj1.split(" ");
        String[] conjunto2 = conj2.split(" ");
        
        
        for(int i=0; i<conjunto1.length; i ++){  
            String elemento = conjunto1[i];
            lista.adicionar(elemento);         
        }
        
        for(int i=0; i<conjunto2.length; i ++){
            
            String elemento2 = conjunto2[i];
            if(! lista.checar(conjunto1, elemento2)){
            lista.adicionar(elemento2);
            }
        }
    
      return lista.toString();
    }

}
