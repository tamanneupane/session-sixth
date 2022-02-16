package training.day1;

 public class Account {

    //states

    // account number
    private String accountNumber;
    // account name
    private String accountName;
    // account type
    private String accountType;
    // amount
    private double amount;
    // interest rate
    private final float INTEREST_RATE = 7.05f;
    // KYC data
    private String address;
    private String socialSecurityNumber;
    private String phoneNumber;


    //Getters and Setters

     public String getAccountNumber() {
         return accountNumber;
     }

     public void setAccountNumber(String accountNumber) {
         this.accountNumber = accountNumber;
     }

     public String getAccountName() {
         return accountName;
     }

     public void setAccountName(String accountName) {
         this.accountName = accountName;
     }

     public String getAccountType() {
         return accountType;
     }

     public void setAccountType(String accountType) {
         this.accountType = accountType;
     }

     public double getAmount() {
         return amount;
     }

     public void setAmount(double amount) {
         this.amount = amount;
     }

     public String getAddress() {
         return address;
     }

     public void setAddress(String address) {
         this.address = address;
     }


     public void setSocialSecurityNumber(String socialSecurityNumber) {
         //check
         this.socialSecurityNumber = socialSecurityNumber;
     }

     public String getPhoneNumber() {
         return phoneNumber;
     }

     public void setPhoneNumber(String phoneNumber) {
         this.phoneNumber = phoneNumber;
     }


     // behaviour

    // open account
    public void openAccount(String accountName,String accountType, double amount, String address, String socialSecurityNumber,String phoneNumber){
    }
    // transfer balance
    public boolean transferBalance(String accountFrom, String accountTo, double amountToTransfer){
        return true;
    }
    // add interest
    public void addInterest(String accountNumber){}
    // deposit amount
    public void depositAmount(String accountNumber, double amountTobeDeposited){}
    // close account
    public boolean closeAccount(String accountNumber){
        return true;
    }
}
