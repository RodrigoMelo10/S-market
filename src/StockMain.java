import java.util.ArrayList;
import java.util.Random;

import model.Investor;
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
	
	

}
