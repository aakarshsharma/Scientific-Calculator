package com.crio.qcalc;

import ch.qos.logback.core.net.SyslogOutputStream;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Calculator {

	public static void main(String[] args) {
		
		//SpringApplication.run(DemoApplication.class, args);

		System.out.println("Starting QCalc..");

       StandardCalculator calc = new StandardCalculator();

       calc.add(Integer.MAX_VALUE, 1);

       
		
	}

}
