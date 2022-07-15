import org.junit.jupiter.api.Test;
import Static org.junit.jupiter.api.assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
Class CalculatorTest {
  calculatr cal;
  @BeforeAll
  Static void SetupAll() {
    System.out.println("@BeforeAll method");
  }
  @BeforeEach
  void setup() {
    cal= new calculator();
    System.out.println("BeforeEach method");
  }
  @test
  void test() {
    int excepted =5;
    int actual=cal.add(2,3);
    assertEquals(expected,actual,"should give right sum");
    System.out.println(actual);
  }
  @Test
  void Test2() {
    int expected=8;
    int actual =cal.add(4,4);
    assertEquals(expected,actual,"should give right output");
    System.out.println(actual);
  }
  @AfterEach
  void setup2() {
    System.out.println("@AfterEach method");
  }
  @AfterAll
  static void SetupAll2(){
    System.out.println("@AfterAll method");
  }
