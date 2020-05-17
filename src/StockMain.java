//https://github.com/RodrigoMelo10/S-market

import java.util.ArrayList;
import java.util.Random;

import model.Company;
import model.Investor;
import patters.CompanyBuilder;
import patters.InvestorBuilder;


public class StockMain {

	
	 public static void main(String []args){
	        // create instance of Random class 
	        Random rand = new Random(); 
	        
	        //INICIALIZING THE STOCK MARKET
	        StockMarket stockMarket = new StockMarket();
	        
	        // creatings 100 companys and Investors
	        stockMarket.setCompanys(createCompanys(rand));
	        stockMarket.setInvestors(createInvestors(rand));
	        
	        
	        stockMarket.getResultOfSimulation();
	 }
	  public static ArrayList<Company> createCompanys(Random rand) {
	        ArrayList<Company> companys = new ArrayList<Company>();
	        
	        for(int i = 0; i < 100; i++) {
	            // Building the Companys using the Builder pattern
	            Company company = new CompanyBuilder(getNextId(rand)).setName("Company Dublin " + String.valueOf(i)).setShares(getRandomShares(rand)).setSharesPrice(getRandomSharePrice(rand)).build();
	            companys.add(company);
	            System.out.println("Company Created -->" +company.getName());
	        }
	        return companys;
	    }
	// creating 100 investors
	    public static ArrayList<Investor> createInvestors(Random rand) {
	        ArrayList<Investor> investors = new ArrayList<Investor>();
	        
	        for(int i = 0; i < 100; i++) {
	            // Building the Investtors using the Builder pattern
	            Investor investor = new InvestorBuilder(getNextId(rand)).setName("Investor Jhon " + String.valueOf(i)).setBudget(getRandomBudget(rand)).build();
	            investors.add(investor);
	            System.out.println("Investor Created -->" +investor.getName());
	        }
	        return investors;
	    }
	    // return the next Random Long
	    public static Long getNextId(Random rand) {
	        return rand.nextLong();
	    }
	    
	    public static Integer getRandomBudget(Random rand) {
	        // return the next Random Integer Between 1000 and 10000 using this formula
	       // minValue + rn.nextInt(maxValue - minValue + 1)
	        return 1000 + rand.nextInt(10000 - 1000 + 1); 
	    }
	    
	    public static Integer getRandomShares(Random rand) {
	        // return the next Random Integer (between 500 and 1000) using this formula
	       // minValue + rn.nextInt(maxValue - minValue + 1)
	        return 500 + rand.nextInt(1000 - 500 + 1); 
	    }
	    
	    public static Integer getRandomSharePrice(Random rand) {
	        // return the next Random Integer (between 10 and 100) using this formula
	       // minValue + rn.nextInt(maxValue - minValue + 1)
	        return 10 + rand.nextInt(100 - 10 + 1); 
	    }
	    
	}

	


