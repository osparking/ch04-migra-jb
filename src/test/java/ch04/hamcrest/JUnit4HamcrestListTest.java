package ch04.hamcrest;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class JUnit4HamcrestListTest {
  private List<String> values;
  
  @Before                                                                
  public void setUp() {
     values = new ArrayList<>();
     values.add("영수");
     values.add("철민");
     values.add("해자");
  }

  @SuppressWarnings("deprecation")
	@Test                                                                  
  public void testListWithHamcrest() {
     assertThat(values, hasSize(3));                                     
     assertThat(values, hasItem(anyOf(equalTo("영수"), equalTo("철민"),
        equalTo("해자"))));                                             
     assertThat("The list doesn't contain all the expected objects, "
     		+ "in order", values, contains("영수", "철민", "해자"));
     assertThat("The list doesn't contain all the expected objects",     
                values, containsInAnyOrder("철민", "해자", "영수"));
  }
}
