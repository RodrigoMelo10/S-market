package patters;

import model.Company;
//Creating CompanyBuilder Class
public class CompanyBuilder {
    
    private final long id;
    private String name = "";
    private Integer shares = 0;
    private Integer sharePrice = 0;
    private boolean outOfShares = false;
    
    public CompanyBuilder(long id) {
        this.id = id;
    }
   //passing parameters  
    public CompanyBuilder(long id, String name, Integer shares, Integer sharePrice, boolean outOfShares) {
        this.id = id;
        this.name = name;
        this.shares = shares;
        this.sharePrice = sharePrice;
        this.outOfShares = outOfShares;
    }
//setting name
    public CompanyBuilder setName(String name) {
        this.name = name;
        return this;
    }
   //setting shares 
    public CompanyBuilder setShares(Integer shares) {
        this.shares = shares;
        return this;
    }
   //setting sharesPrice 
    public CompanyBuilder setSharesPrice(Integer sharesPrice) {
        this.sharePrice = sharesPrice;
        return this;
    }
    //returning id,name,shares,sharePrice, outOfShares
    public Company build() {
        return new Company(id,name, shares,sharePrice, outOfShares);
    }
}
