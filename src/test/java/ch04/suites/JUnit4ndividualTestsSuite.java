package ch04.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ch04.categories.IndividualTests;
import ch04.categories.JUnit4CustomerTest;
import ch04.categories.JUnit4CustomersRepositoryTest;

@RunWith(Categories.class)
@Categories.IncludeCategory(IndividualTests.class)
@Suite.SuiteClasses({ JUnit4CustomerTest.class,
		JUnit4CustomersRepositoryTest.class })
public class JUnit4ndividualTestsSuite {
}
