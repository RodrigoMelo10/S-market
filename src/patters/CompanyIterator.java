//https://github.com/RodrigoMelo10/S-market

package patters;

import java.util.ArrayList;
import java.util.Iterator;

import model.Company;

public class CompanyIterator implements Iterator<Company>{
	
	
	 ArrayList<Company> items;
	    int position = 0;

	    public CompanyIterator(ArrayList<Company> items) {
	        this.items = items;
	    }
	    
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
	    public Company next() {
	        // TODO Auto-generated method stub
	        Company company = items.get(position);
	        position = position + 1;
	        return company;
	    }

	}


