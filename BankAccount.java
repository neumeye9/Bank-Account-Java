import java.util.*;

class BankAccount{
    String accountNum;
    long checkBalance;
    long saveBalance;
    protected static int numOfAccounts;
    protected static long totalInAccounts;

 public String getAccountNum(){
    Random rand = new Random();
    ArrayList<Integer> digits = new ArrayList<Integer>();
    for(int i = 1; i < 11; i++){
      int randomNum = rand.nextInt(9) + 1;
      digits.add(randomNum);
    }
    this.accountNum = String.valueOf(digits.get(0));
    for(int i = 1; i < digits.size(); i++){
      this.accountNum += digits.get(i);
    }
    System.out.println(this.accountNum);
    numOfAccounts ++;
    return this.accountNum;
  }

  public int howManyAccounts(){
     System.out.println("This bank has " + numOfAccounts + " accounts in total.");
     return numOfAccounts;
  }

  public long checkBalance(){
    return this.checkBalance;
  }

  public long saveBalance(){
    return this.saveBalance;
  }

  public void depositMoney(int checking, int savings){
    this.checkBalance += checking;
    this.saveBalance += savings;
    totalInAccounts += checking;
    totalInAccounts += savings;
    System.out.println("Your checking balance is now $"+ this.checkBalance + " and  savings balance is $"+ this.saveBalance + "." );
  }

  public void withdrawMoney(int checking, int savings){
    if(this.checkBalance > 0){
      this.checkBalance -= checking;
      totalInAccounts -= checking;
      System.out.println("Your checking balance is now $" + this.checkBalance);
    }
    else{
      System.out.println("You have a $0 balance in your checking account.");
    }

    if(this.saveBalance > 0){
      this.saveBalance -= savings;
      totalInAccounts -= savings;
      System.out.println("Your savings balance is now $" + this.saveBalance);
    }
    else{
      System.out.println("You have a $0 balance in your checking account.");
    }
  }

  public static long getTotalInAccounts(){
      System.out.println("This bank has a total of $" + totalInAccounts + ".");
    return totalInAccounts;
  }
}

