package ch04.categories;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({ JUnit4CustomersRepositoryTest.class, JUnit4CustomerTest.class })
@Categories.IncludeCategory(RepositoryTests.class)
public class JUnit4RepositoryTestsSuite {
}
