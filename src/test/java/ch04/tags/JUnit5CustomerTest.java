package ch04.tags;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("individual")
public class JUnit5CustomerTest {
  private String CUSTOMER_NAME = "Kim, WonJang";

  @Test
  public void testCustomer() {
      Customer customer = new Customer(CUSTOMER_NAME);

      assertEquals("Kim, WonJang", customer.getName());
  }
}
