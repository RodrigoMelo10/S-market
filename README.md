# S-market
Builder – as we have to created 100 company’s and 100 investors, 
the best way to create this is using a Builder pattern to manage all the creations.

Facade pattern –Although the pattern is not expressed written, we used the facade pattern to Acess the informations about the Stock Market, 
for exemple, if we want to know the Highest and lowest investor, we can access this by calling the method of the StockMarket class.

Observer – we use to notify and update all the Company’s/Investors about an action that happen in the stock market, so in that way,
if one company sell one share, all the other will be notified, because they are observing the StockMarket.

Iterator- The iterator pattern was used to get easier the search of investors and companies in the StockMarket.

