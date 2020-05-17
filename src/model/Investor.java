//https://github.com/RodrigoMelo10/S-market
package model;

import patters.Observer;
//Investor implementing Observer
public class Investor implements Observer{

    private long id;
    private String name;
    private Integer budget;
    private boolean broke;
    private Integer shares;
    
    public Investor(long id) {
        this.id = id;
    }
// passing attributes as parameters
    public Investor(long id, String name, Integer budget, boolean broke, Integer shares) {
        super();
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.broke = broke;
        this.shares = shares;
    }
//returning id
    public long getId() {
        return id;
    }
//setting id
    public void setId(long id) {
        this.id = id;
    }
//getting Name
    public String getName() {
        return name;
    }
//getters and setters
    public void setName(String name) {
        this.name = name;
    }
//returning budget
    public Integer getBudget() {
        return budget;
    }
//setting Budget
    public void setBudget(Integer budget) {
        this.budget = budget;
    }
//returning broke
    public boolean isBroke() {
        return broke;
    }
//setting Broke
    public void setBroke(boolean broke) {
        this.broke = broke;
    }
//returnin shares
    public Integer getShares() {
        return shares;
    }
//setting Shares
    public void setShares(Integer shares) {
        this.shares = shares;
    }
//printing out update method
    @Override
    public void update() {
        // TODO Auto-generated method stub
        System.out.println("");
    }
    
    
}

