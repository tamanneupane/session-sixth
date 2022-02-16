package training.day1;

public class BankPractice {

    public static void main(String[] args) {
        Account account = new Account();

//        account.accountName = "ABC";
//        account.accountNumber = "123456789";
//        account.accountType = "SAVING";
//        account.amount = 5000.0;
//        account.address = "test address";
//        account.phoneNumber = "987546321";
//        account.socialSecurityNumber = "147852369";

        account.setAccountName("ABC");
        account.setAccountNumber("123456789");
        account.setAccountType("SAVING");
        account.setAmount(5000.0);
        account.setAddress("test address");
        account.setPhoneNumber("987546321");
        account.setSocialSecurityNumber("147852369");


        System.out.println(account.getAccountName());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountType());
        System.out.println(account.getAmount());
        System.out.println(account.getAddress());
        System.out.println(account.getPhoneNumber());
//        System.out.println(account.getSocialSecurityNumber());

    }
}
