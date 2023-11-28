package ch04.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import ch04.Calculator;

public class JUnit4RuleExceptionTester {

	@SuppressWarnings("deprecation")
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	private Calculator calculator = new Calculator();
	
	@Test
	public void expectIllegalArgumentException() {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("음수는 제곱근 값을 계산할 수 없다.");
		calculator.sqrt(-1);
	}
	
	@Test
	public void expectArithmaticException() {
		expectedException.expect(ArithmeticException.class);
		expectedException.expectMessage("0은 다른 수를 나눌 수는 없다.");
		calculator.divide(1, 0);
	}
}
