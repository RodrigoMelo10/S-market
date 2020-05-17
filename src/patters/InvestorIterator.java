//https://github.com/RodrigoMelo10/S-market

// we use this class to go through all the items 


package patters;

import java.util.Iterator;
import java.util.ArrayList;
import model.Investor;
//we have the List of items and the position that we will use when we go through all the items.
public class InvestorIterator implements Iterator<Investor> {

	 ArrayList<Investor> items;
	    int position = 0;
	  
	    public InvestorIterator(ArrayList<Investor> items) {
	        this.items = items;
	    }
	  //this is an override method to verify if we have a next item in the list
	   
	    @Override
	    public boolean hasNext() {
	        // TODO Auto-generated method stub
	        if ((position >= items.size() || (items.get(position) == null))) {
	            return false;
	        } else {
	            return true;
	        }
	    }
	 // we use this method to acess the one specific Object using his position in the list
	    @Override
	    public Investor next() {
	        // TODO Auto-generated method stub
	        Investor investor = items.get(position);
	        position = position + 1;
	        return investor;
	    }
	}

