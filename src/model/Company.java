//https://github.com/RodrigoMelo10/S-market
//Creating class Company
package model;

import patters.Observer;

public class Company implements Observer{

    private long id;
    private String name;
    private Integer shares;
    private Integer sharePrice;
    private Integer capital;
    private Integer sharedSelleds;
    private boolean outOfShares;
    
    public Company(long id) {
        this.id = id;
    }
// passing  the attributes of company as parameters
    public Company(long id, String name, Integer shares, Integer sharePrice, boolean outOfShares) {
        super();
        this.id = id;
        this.name = name;
        this.shares = shares;
        this.sharePrice = sharePrice;
        this.outOfShares = outOfShares;
    }// returning outOfShares
    public boolean isOutOfShares() {
        return outOfShares;
    }

    public void setoutOfShares(boolean outOfShares) {
        this.outOfShares = outOfShares;
    }
//getters and setters
    public long getId() {
        return id;
    }
//setting id
    public void setId(long id) {
        this.id = id;
    }
//getting name
    public String getName() {
        return name;
    }
//setting name
    public void setName(String name) {
        this.name = name;
    }
//getting Shares
    public Integer getShares() {
        return shares;
    }
//setting shares
    public void setShares(Integer shares) {
        this.shares = shares;
    }
//getting SharePrice
    public Integer getSharePrice() {
        return sharePrice;
    }
//setting SharePrice
    public void setSharePrice(Integer sharePrice) {
        this.sharePrice = sharePrice;
    }
//getting Capital
    public Integer getCapital() {
        return capital;
    }
    //multiplying shares and sharePrice
    public Integer getCapitalCalculated() {
        return shares * sharePrice;
    }
//setting Capital
    public void setCapital(Integer capital) {
        this.capital = capital;
    }
//setting outofshares
    public void setOutOfShares(boolean outOfShares) {
        this.outOfShares = outOfShares;
    }
//getting SharedSelleds
    public Integer getSharedSelleds() {
        return sharedSelleds;
    }
//setting sharedSelleds
    public void setSharedSelleds(Integer sharedSelleds) {
        this.sharedSelleds = sharedSelleds;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        this.sharedSelleds += 1;
        
        // If a company sells 10 shares, the share price should double up.
        if (this.sharedSelleds % 5 == 0 ) {
            this.sharePrice = this.sharePrice * 2;
        }
        
       // If any 10 shares are sold (from any company), and a company hasn’t sold any, the
       // price must reduce in 2%.
        if (this.sharedSelleds == 0) {
            this.sharePrice = (int) (this.sharePrice / 1.03);
        }
    }
    
}

