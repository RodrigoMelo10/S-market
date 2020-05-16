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
// passing parameters
    public Investor(long id, String name, Integer budget, boolean broke, Integer shares) {
        super();
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.broke = broke;
        this.shares = shares;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
//getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public boolean isBroke() {
        return broke;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }

    public Integer getShares() {
        return shares;
    }

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

