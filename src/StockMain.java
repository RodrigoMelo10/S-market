import java.util.Random;



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
	
	
	

}
