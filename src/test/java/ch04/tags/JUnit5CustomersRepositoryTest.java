package ch04.tags;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("repository")
public class JUnit5CustomersRepositoryTest {
  private String CUSTOMER_NAME = "Kim, WonJang";
  private CustomersRepository repository = new CustomersRepository();

  @Test
  public void testNonExistence() {
      boolean exists = repository.contains(CUSTOMER_NAME);

      assertFalse(exists);
  }

  @Test
  public void testCustomerPersistence() {
      repository.persist(new Customer(CUSTOMER_NAME));

      assertTrue(repository.contains("Kim, WonJang"));
  }
}
