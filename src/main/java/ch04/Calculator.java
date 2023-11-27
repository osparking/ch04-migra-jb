/*
 * ========================================================================
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */

package ch04;

public class Calculator {
	public double add(double number1, double number2) {
		return number1 + number2;
	}

	public double sqrt(double x) {
		if (x < 0) {
			throw new IllegalArgumentException(
					"음수는 제곱근 값을 계산할 수 없다.");
		}
		return Math.sqrt(x);
	}

	public double divide(double x, double y) {
		if (y == 0) {
			throw new ArithmeticException("0은 다른 수를 나눌 수는 없다.");
		}
		return x / y;
	}
}
