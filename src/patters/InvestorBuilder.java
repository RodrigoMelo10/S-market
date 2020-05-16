package patters;

import model.Investor;

public class InvestorBuilder {

    private final long id;
    private String name = "";
    private Integer budget = 0;
    private boolean broke = false;
    private Integer shares = 0;
    
    public InvestorBuilder(long id) {
        this.id = id;
    } 
    
    public InvestorBuilder(long id, String name, Integer budget, boolean broke, Integer shares) {
        super();
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.broke = broke;
        this.shares = shares;
    }
    
    public InvestorBuilder setName(String name) {
        this.name = name;
        return this;
    }
    
    public InvestorBuilder setBudget(Integer budget) {
        this.budget = budget;
        return this;
    }
    
    
    public Investor build() {
        return new Investor(id,name, budget, broke, shares);
    }
}

