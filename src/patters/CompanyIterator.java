//https://github.com/RodrigoMelo10/S-market

// we use this class to go through all the items of the type Company
// we have the List of items of type Company and the position that we will use when we go through all the items.


package patters;

import java.util.ArrayList;
import java.util.Iterator;

import model.Company;

public class CompanyIterator implements Iterator<Company>{
	
	// we have the List of items of type Company and the position that we will use when we go through all the items.	
	 ArrayList<Company> items;
	    int position = 0;

	    public CompanyIterator(ArrayList<Company> items) {
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
	    public Company next() {
	        // TODO Auto-generated method stub
	        Company company = items.get(position);
	        position = position + 1;
	        return company;
	    }

	}


