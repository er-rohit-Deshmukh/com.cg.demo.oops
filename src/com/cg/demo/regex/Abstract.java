package com.cg.demo.regex;


	abstract class Rbi {

		abstract void doKyc();

		void payInterest() {
			System.out.println("pay interest @5%");
		}
	}

	class Hdfcbank extends Rbi {

		@Override
		void doKyc() {
			System.out.println("Aadhaar");
		}
	}

	class AxisBank extends Rbi {

		@Override
		void doKyc() {
			System.out.println("PAN Card");
		}
	

}

