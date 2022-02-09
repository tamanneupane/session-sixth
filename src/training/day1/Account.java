package training.day1;

public class Account {

    //states

    // account number
    String accountNumber;
    // account name
    String accountName;
    // account type
    String accountType;
    // amount
    double amount;
    // interest rate
    final float interestRate = 7.05f;
    // KYC data
    String address;
    String socialSecurityNumber;
    String phoneNumber;


    // behaviour

    // open account
    void openAccount(String accountName,String accountType, double amount, String address, String socialSecurityNumber,String phoneNumber){}
    // transfer balance
    boolean transferBalance(String accountFrom, String accountTo, double amountToTransfer){
        return true;
    }
    // add interest
    void addInterest(String accountNumber){}
    // deposit amount
    void depositAmount(String accountNumber, double amountTobeDeposited){}
    // close account
    boolean closeAccount(String accountNumber){
        return true;
    }
}
