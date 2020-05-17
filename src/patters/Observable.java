//https://github.com/RodrigoMelo10/S-market

// this class was created to be implemented by the StockMarket class,
//in that way we can let the Investors/Companys subscribe using this methods.
package patters;
//interface Observable
import java.util.Observer;

public interface Observable {

	 public void addObserver(Observer o);
	    
	    public void removeObserver(Observer o);
	    
	    public void notifyObserver(Observer o);
	
	
	
}
