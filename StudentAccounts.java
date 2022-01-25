class StudentAccounts{
    private int accountNumber;
    private String accountName;
    private double balance;
    private String regNumber;
    StudentAccounts(){
    }

    int getAccountNumber(){
        return this.accountNumber;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber; 
    }
    String getAccountName(){
        return this.accountName;
    }
    void setAccountName(String accountName){
        this.accountName = accountName;
    }

    double getBalance(){
        return this.balance;
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

     
} 