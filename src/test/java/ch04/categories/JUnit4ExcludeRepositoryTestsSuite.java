package ch04.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(RepositoryTests.class)
@Suite.SuiteClasses({ JUnit4CustomersRepositoryTest.class,
		JUnit4CustomerTest.class })
public class JUnit4ExcludeRepositoryTestsSuite {
}

