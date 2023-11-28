package ch04.rules;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import ch04.Calculator;

public class JUnit5ExceptionTester {
	private Calculator calculator = new Calculator();

	@Test
	public void expectIllegalArgumentException() {
		Throwable throwable = assertThrows(IllegalArgumentException.class,
				() -> calculator.sqrt(-1));
		assertEquals("음수는 제곱근 값을 계산할 수 없다.", throwable.getMessage());
	}

	@Test
	public void expectArithmeticException() {
		Throwable throwable = assertThrows(ArithmeticException.class,
				() -> calculator.divide(1, 0));
		assertEquals("0은 다른 수를 나눌 수는 없다.", throwable.getMessage());
	}
}

