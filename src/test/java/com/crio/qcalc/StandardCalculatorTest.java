package com.crio.qcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class StandardCalculatorTest {

	@Test
	void testAdd(){
		StandardCalculator cal=new StandardCalculator();
		cal.add(1, 1);
		assertEquals(2, cal.getResult());
	}

	@Test
	void testSubtract(){
		StandardCalculator cal=new StandardCalculator();
		cal.subtract(1, 1);
		assertEquals(0, cal.getResult());
	}

	@Test
	void testResult(){
		StandardCalculator cal=new StandardCalculator();
		cal.add(1,1);
		cal.subtract(1,1);
		assertEquals(0,cal.getResult());
	}



	@Test
	void testAdditionOverflow() {
		StandardCalculator calc = new StandardCalculator();
		assertThrows(ArithmeticException.class, new Executable(){
			@Override
			public void execute() throws Throwable {
				calc.add(Integer.MAX_VALUE, 1);
			}
		});
	}


}

