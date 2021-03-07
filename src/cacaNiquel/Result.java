package cacaNiquel;

public class Result {
	static ListaCircular lc1 = new ListaCircular();
	static ListaCircular lc2 = new ListaCircular();
	static ListaCircular lc3 = new ListaCircular();
  
  	
  	public static void preencherTambores(String[] tambor1,String[] tambor2,String[] tambor3){       
        for(int i = 0; i < tambor1.length; i++){
            lc1.inserir(tambor1[i]);
        }
        for(int i = 0; i < tambor2.length; i++){
            lc2.inserir(tambor2[i]);
        }
        for(int i = 0; i < tambor3.length; i++){
            lc3.inserir(tambor3[i]);
        }
	}

    
    public static String girarTambores(int nDesloc1, int nDesloc2, int nDesloc3) {
        
      No mostrador1 = lc1.começo;
      No mostrador2 = lc2.começo;
      No mostrador3 = lc3.começo;
        
      String resultado = "";
      
      for(int i = 0; i < nDesloc1; i++){           
            mostrador1 = mostrador1.next;
      }
      for(int i = 0; i < nDesloc2; i++){          
            mostrador2 = mostrador2.next;
      }
      for(int i = 0; i < nDesloc3; i++){          
            mostrador3 = mostrador3.next;
      }
      
      resultado = mostrador1.data + " " + mostrador2.data + " " + mostrador3.data;
   
      return resultado;

    }


}
