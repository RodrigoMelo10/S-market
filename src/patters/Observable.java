//https://github.com/RodrigoMelo10/S-market
package patters;
//interface Observable
import java.util.Observer;

public interface Observable {

	 public void addObserver(Observer o);
	    
	    public void removeObserver(Observer o);
	    
	    public void notifyObserver(Observer o);
	
	
	
}
