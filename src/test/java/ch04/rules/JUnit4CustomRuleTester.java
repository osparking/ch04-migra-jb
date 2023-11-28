package ch04.rules;

import org.junit.Rule;
import org.junit.Test;

public class JUnit4CustomRuleTester {

	@Rule
	public CustomRule myRule = new CustomRule();
	
	@Test
	public void myCustomRuleTest() {
		System.out.println("나는 시험 메소드이다.");
	}
}
