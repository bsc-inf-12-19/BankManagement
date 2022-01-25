class BusinessAccounts{
    private String accountNumber;
    private String accountName;
    private double balance;
    private String regNumber;
    private String businessAddress;
    BusinessAccounts(){
    }
    String getAccountNumber(){
        return this.accountNumber;
    }
    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber; 
    }
    String getAccountName(){
        return this.accountName;
    }
    void setAccountName(String accountName){
        this.accountName = accountName;
    }

    double getBalance(){
        return this.Balance;
    }
    void setBalance(double balance){
        this.balance = balance;
    }

    String getRegNumber(){
        return this.regNumber;
    }
    void setregNumber(String regNumber){
        this.regNumber = regNumber;
    }

    String getBusinessAddress(){
        return this.businessAddress;
    }
     void setBusinessAddress(String businessAddress){
         this.businessAddress = businessAddress;
     }     
}