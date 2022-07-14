class BankAccount {
  long id;
  double balance;
  public BankAccount(long id,double balance){
    this.id=id;
    this.balance=balance;
  }
  public void withdraw(int withdrawl_amount) throws insufficientBalanceException{
    if(withdrawl_amount>balance || balance==0){
      throw new InsufficientBalanceExcepion("Exception");
    }
    bakance=balance-withdrawl_amount;
    System.out.println("you've received "+(int)(withdrawl_amount)+"in cash:");
  }
}
class InsufficientBalanceException extends Exception{
  InsufficientBalanceException(String exception){
    super(exception);
  }
}
public class bank_client{
  public static void main(String[] args) throws InsufficientBalanceException {
    BankAccount customer1=new BankAccount(21,54000);
    customer1.withdraw(90000);
  }
}
    
