import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observer;

import model.Company;
import model.Investor;
//import patters.CompanyIterator;
//import patters.InvestorIterator;
import patters.Observable;

public class StockMarket implements Observable {
	
	
	  private ArrayList<Company> companys = new ArrayList<Company>();
	    private ArrayList<Investor> investors = new ArrayList<Investor>();
	    
	    //Lists to receive the companys with the lowestCapital
	    private ArrayList<Company> companysLowestCapital = new ArrayList<Company>();
	    private ArrayList<Company> companysHighstCapital = new ArrayList<Company>();

	  //Lists to receive the INVESTORS with the lowest and hightest number of shares
	    private ArrayList<Investor> investorsLowestShares = new ArrayList<Investor>();
	    private ArrayList<Investor> investorsHighstShares = new ArrayList<Investor>();
	    
	    public void initSimulation(ArrayList<Company> comp, ArrayList<Investor> inve) {
	        setCompanys(comp);
	        setInvestors(inve);

}
	    public void getResultOfSimulation() {
	        this.companyLowestCapital();
	        // calling the Iterator patter
	        Iterator<Company> lowestCap = this.createIteratorCompanys(this.companysLowestCapital);
	        System.out.println("------------ Company(s) with the lowest capital------------------");
	        while (lowestCap.hasNext()) {
	            Company item = lowestCap.next();
	            System.out.println("Company Name - >"+item.getName());
	            System.out.println("Company Share Price - >"+item.getSharePrice());
	            System.out.println("Company Total Capital - >"+item.getCapitalCalculated());
	        }
	        
	        this.companyHighestCapital();
	        // calling the Iterator patter
	        Iterator<Company> highestCap = this.createIteratorCompanys(this.companysHighstCapital);
	        System.out.println("------------- Company with the highest capital---------------------");
	        while (highestCap.hasNext()) {
	            Company item = highestCap.next();
	            System.out.println("Company Name - >"+item.getName());
	            System.out.println("Company Share Price - >"+item.getSharePrice());
	            System.out.println("Company Total Capital - >"+item.getCapitalCalculated());
	        }
	        
	        this.investorsHighstShares();
	        // calling the Iterator patter
	        Iterator<Investor> highestShares = this.createIteratorInvestors(this.investorsHighstShares);
	        System.out.println("--------------Investor(s) with the highest number of shares-------------");
	        while (highestShares.hasNext()) {
	            Investor item = highestShares.next();
	            System.out.println("Investor Name -->" +item.getName());
	            System.out.println("Investor Bugdet -->" +item.getBudget());
	            System.out.println("Investor Shares -->" +item.getShares());
	        }
	        
	        this.investorsLowestShares();
	        System.out.println("-------------- Investor with the lowest number of shares-----------------");
	        Iterator<Investor> lowestShares = this.createIteratorInvestors(this.investorsLowestShares);
	        while (lowestShares.hasNext()) {
	            Investor item = lowestShares.next();
	            System.out.println("Investor Name -->" +item.getName());
	            System.out.println("Investor Bugdet -->" +item.getBudget());
	            System.out.println("Investor Shares -->" +item.getShares());
	        }
	    }
	    
	    //COMPANY
	    public void companyLowestCapital() {
	        // first, we have to order the list by the capital
	        Integer lowestCapital = 1000 * 100; // starting with the maximum capital possible (shares * price)
	        for (Company company : companys) {
	            // calculating the capital of the company
	            Integer capital = company.getShares() * company.getSharePrice();
	            
	            // comparing the capital of the actual company with the lowest capital
	            if (capital < lowestCapital) {
	                this.companysLowestCapital = new ArrayList<Company>();
	                lowestCapital = capital;
	                this.companysLowestCapital.add(company);
	            } else if (capital == lowestCapital) {
	                this.companysLowestCapital.add(company);
	            }
	        }
	    }
	    
	    public void investorsHighstShares() {
	        Integer highestCapital = 0; // starting with the minimum capital possible (shares * price)
	        for (Company company : companys) {
	            // calculating the capital of the company
	            Integer capital = company.getShares() * company.getSharePrice();
	            
	            // comparing the capital of the actual company with the highest capital
	            if (capital > highestCapital) {
	                this.companysHighstCapital = new ArrayList<Company>();
	                highestCapital = capital;
	                this.companysHighstCapital.add(company);
	            } else if (capital == highestCapital) {
	                this.companysHighstCapital.add(company);
	            }
	        }
	    }
	    
	    //INVESTORS
	    public void investorsLowestShares() {
	        // first, we have to order the list by the capital
	        Integer lowestCapital = 10000 * 10; // starting with the maximum number of shares possible 
	        for (Investor investor : investors) {
	            
	            // comparing the capital of the actual company with the lowest capital
	            if (investor.getShares() < lowestCapital) {
	                this.investorsLowestShares = new ArrayList<Investor>();
	                lowestCapital = investor.getShares();
	                this.investorsLowestShares.add(investor);
	            } else if (investor.getShares() == lowestCapital) {
	                this.investorsLowestShares.add(investor);
	            }
	        }
	    }
	    
	    public void companyHighestCapital() {
	        Integer highestCapital = 0; // starting with the minimum capital possible 
	        for (Investor investor : investors) {
	            // comparing the capital of the actual company with the highest capital
	            if (investor.getShares() < highestCapital) {
	                this.investorsHighstShares = new ArrayList<Investor>();
	                highestCapital = investor.getShares();
	                this.investorsHighstShares.add(investor);
	            } else if (investor.getShares() == highestCapital) {
	                this.investorsHighstShares.add(investor);
	            }
	        }
	    }
	    
	    public ArrayList<Company> getCompanys() {
	        return companys;
	    }


	    public void setCompanys(ArrayList<Company> companys) {
	        this.companys = companys;
	    }


	    public ArrayList<Investor> getInvestors() {
	        return investors;
	    }


	    public void setInvestors(ArrayList<Investor> investors) {
	        this.investors = investors;
	    }

	    
	    public void notifyCompanys() {
	        for (Company company : this.companys) {
	            company.update();
	        }
	    }

	    public void notifyInvestors() {
	        for (Investor investor : this.investors) {
	            investor.update();
	        }
	    }
	    
	    // USING THE OBSERVABLE PATTERN
	    @Override
	    public void addObserver(Observer o) {
	        // TODO Auto-generated method stub
	        
	    }

	    @Override
	    public void removeObserver(Observer o) {
	        // TODO Auto-generated method stub
	        companys.remove(0);
	    }

	    @Override
	    public void notifyObserver(Observer o) {
	        // TODO Auto-generated method stub
	        
	    }
	    
	    // CREATING THE ITERATOR FOR COMPANY AND INVESTOR
	    // USING ITERATOR PATTERN
	  //  public Iterator<Company> createIteratorCompanys(ArrayList<Company> comp) {
	//        return new CompanyIterator(comp);
	    }
	    
	 //   public Iterator<Investor> createIteratorInvestors(ArrayList<Investor> inv) {
	 //       return new InvestorIterator(inv);
	    }
	}
