import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class BankAccountTest {
  BankAccount cust;
  @BeforeAll
  void object_creation(){
    cust=new BankAccount(21,9453839);
  }
  @Test
  void withDraw() {
    asserAll(
      ()-> assertThrows(InsufficientBalanceException.class,() -> cust.withdraw(9000000),"it is supposed to throw Insufficient funds exception"),
      ()-> assertThrows(InsufficientBalanceException.class,()-> cust.withdraw(98674748),"it is supposed to throw Insufficient funds exception"));
      }
      }
