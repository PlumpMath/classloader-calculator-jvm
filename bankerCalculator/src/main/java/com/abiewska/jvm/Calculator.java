package com.abiewska.jvm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {

	public static BigDecimal roundNumber(double n) {
		return new BigDecimal(n).setScale(2, RoundingMode.HALF_EVEN);
	}

}
