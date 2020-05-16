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
// passing attributes
    public Company(long id, String name, Integer shares, Integer sharePrice, boolean outOfShares) {
        super();
        this.id = id;
        this.name = name;
        this.shares = shares;
        this.sharePrice = sharePrice;
        this.outOfShares = outOfShares;
    }
