package semRepInver;

public class ListaDinamica {
	 public NoLista atual = null;
	    public NoLista anterior = null;
	    public NoLista proximo = null;
	    public NoLista prim = null;
	    public int posiçao = 0;
	    
	    public void add(int elemento){
	        NoLista atual = new NoLista(elemento);
	        
	        if(prim == null){
	            prim = atual;
	            return ;
	        }
	        
	        NoLista aux = prim;
	        while(aux.prox != null){
	            aux = aux.prox;
	        }
	        
	        aux.prox = atual;
	        posiçao ++;
	    }
	    
	    public void inverter(){
	        
	        
	        proximo = prim;
	        
	        while(proximo != null){
	            atual = proximo;
	            proximo = proximo.prox;
	            atual.prox = anterior;
	            anterior = atual;
	            prim = anterior;
	                       
	        }  
	    }
	    
	    public void print(){
	        tirarDuplicada();
	            
	        String str = "";
	        NoLista atual = prim;
	        while(atual != null){
	            str += atual.data + " ";
	            atual = atual.prox;
	        }
	        
	        System.out.println(str);
	    }
	    
	    public void tirarDuplicada(){
	        NoLista ptr1 = null, ptr2 = null, dup = null;
	        ptr1 = prim;
	 
	        
	        while (ptr1 != null && ptr1.prox != null) {
	            ptr2 = ptr1;
	 
	            
	            while (ptr2.prox != null) {
	 
	                
	                if (ptr1.data == ptr2.prox.data) {
	 
	                    
	                    dup = ptr2.prox;
	                    ptr2.prox = ptr2.prox.prox;
	                    System.gc();
	                } else {
	                    ptr2 = ptr2.prox;
	                }
	            }
	            ptr1 = ptr1.prox;
	        }
	        
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    public ListaDinamica listaNova() {
	       this.inverter();
	       return this; 
	    }

}
