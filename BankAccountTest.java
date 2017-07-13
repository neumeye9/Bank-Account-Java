import java.util.*;

public class BankAccountTest{

    public static void main(String[] args){
        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        BankAccount c = new BankAccount();
        


        a.getAccountNum();
        b.getAccountNum();
        c.getAccountNum();
     
        a.howManyAccounts();
       

        a.depositMoney(1000,5000);
        b.depositMoney(560,1300);
        c.depositMoney(800, 1500);
    

        a.checkBalance();
        a.saveBalance();

        a.withdrawMoney(60,0);

   


        BankAccount.getTotalInAccounts();
    }
}