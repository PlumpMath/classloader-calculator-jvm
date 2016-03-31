package com.abiewska.jvm;

import java.math.BigDecimal;
import com.abiewska.jvm.Calculator;

public class App {
	public double number;
	public BigDecimal round;

	public App() {
		this.number = 1.5555;
		this.round = Calculator.roundNumber(1.5555);

	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public BigDecimal getRound() {
		return round;
	}

	public void setRound(BigDecimal round) {
		this.round = round;
	}
}
