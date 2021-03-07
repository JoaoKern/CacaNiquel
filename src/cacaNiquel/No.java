package cacaNiquel;

public class No {
	No prior;
	No next;
	String data;
        
    public No(String data){
        this.data = data;
        prior = null;
        next = null;
    }    

}
