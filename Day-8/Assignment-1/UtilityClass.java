class BankAccount {
    
    String accNo = "370936784270";
    double balance = 200.0;

}

class CheckingAccount extends BankAccount {

}

class SavingsAccount extends BankAccount {

}

class COD extends BankAccount {

}
final class UtilityClass {
    public static void main(String[] args) {

        CheckingAccount CA = new CheckingAccount();
        System.out.println(CA.accNo);
        System.out.println(CA.balance);
        
        SavingsAccount SA = new SavingsAccount();
        System.out.println(SA.accNo);
        System.out.println(SA.balance);
        
        COD cod = new COD();
        System.out.println(cod.accNo);
        System.out.println(cod.balance);    
    }
     
 }
 