package ch04.hamcrest;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnit5HamcrestListTest {
	private List<String> values;

	@BeforeEach
	public void setUp() {
		values = new ArrayList<>();
		values.add("영수");
		values.add("철민");
		values.add("해자");
	}

	@Test
	@DisplayName("List with Hamcrest")
	public void testListWithHamcrest() {
		assertThat(values, hasSize(3));
		assertThat(values,
				hasItem(anyOf(equalTo("영수"), equalTo("철민"), equalTo("해자"))));
		assertThat("The list doesn't contain all the expected objects, in order",
				values, contains("영수", "철민", "해자"));
		assertThat("The list doesn't contain all the expected objects", values,
				containsInAnyOrder("철민", "해자", "영수"));
	}
}
