//https://github.com/RodrigoMelo10/S-market

package patters;

import java.util.Iterator;
import java.util.ArrayList;
import model.Investor;

public class InvestorIterator implements Iterator<Investor> {

	 ArrayList<Investor> items;
	    int position = 0;

	    public InvestorIterator(ArrayList<Investor> items) {
	        this.items = items;
	    }
	    //method hasnext
	    @Override
	    public boolean hasNext() {
	        // TODO Auto-generated method stub
	        if ((position >= items.size() || (items.get(position) == null))) {
	            return false;
	        } else {
	            return true;
	        }
	    }

	    @Override
	    public Investor next() {
	        // TODO Auto-generated method stub
	        Investor investor = items.get(position);
	        position = position + 1;
	        return investor;
	    }
	}

