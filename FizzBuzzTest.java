package com.accolite.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FizzBuzzTest {
	
	private FizzBuzz fizzBuzz;
	
	
	@BeforeClass
	public static void beforeFizzBuzz() {
		System.out.println("Entering Fizz Buzz Test Cases!");
	}
	
	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}
	
	@Test
	public void testPlay() {
		fizzBuzz.setLimit(15);
		String[] expected = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
		assertArrayEquals(expected, fizzBuzz.play());
	}
	
	@Test(expected=NegativeArraySizeException.class)
	public void testInvalidInput(){
		fizzBuzz.setLimit(-15);
		fizzBuzz.play();
	}
	
	@After
	public void afterTests() {
		System.out.println("Finished Test Cases:");
	}
	
}
