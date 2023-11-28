package ch04.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomStatement extends Statement {
	private Statement base;
	private Description description;

	@Override
	public void evaluate() throws Throwable {
		System.out.println(this.getClass().getSimpleName() + " "
				+ description.getMethodName() + " 시작 전");
		base.evaluate();
		System.out.println(this.getClass().getSimpleName() + " "
				+ description.getMethodName() + " 실행 후");
	}
}
