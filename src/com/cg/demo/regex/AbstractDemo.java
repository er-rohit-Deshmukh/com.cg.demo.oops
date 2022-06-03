package com.cg.demo.regex;

	// abstract method 
	// abstract class
	// interface 

	//abstract method -
	//it has the keyword abstract 
	// does not have method body 
	// it has only method signature 
	// it can be created in abstract class, not in concrete class  

	// abstract class 
	// it has the keyword abstract 
	// it contains 0 or more abstract methods 
	// its object can not be created 

	public class AbstractDemo {

		public static void main(String[] args) {

			Hdfcbank bank1 = new Hdfcbank();
			bank1.payInterest();
			bank1.doKyc();

			AxisBank bank2 = new AxisBank();
			bank2.payInterest();
			bank2.doKyc();

		}

	 
	 
	 
	 
	 
}
