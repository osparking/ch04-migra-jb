package ch04.extensions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CustomExtension.class)
public class JUnit5CustomExtensionTester {
	
	@Test
	public void jbCustomRuleTest() {
		System.out.println("시험 메소드 행동 중");
	}
}
