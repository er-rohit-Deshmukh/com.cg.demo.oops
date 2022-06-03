package com.cg.demo.regex;

	interface FinanceMinistry {

		abstract void paySalary();

	}

	abstract class Rbi {

		abstract void doKyc();

		void payInterest() {
			System.out.println("pay interest @5%");
		}
	}

	class Hdfcbank extends Rbi implements FinanceMinistry {

		@Override
		void doKyc() {
			System.out.println("Aadhaar");
		}

		@Override
		public void paySalary() {
			System.out.println("pay salary");
		}
	}

	class AxisBank extends Rbi {

		@Override
		void doKyc() {
			System.out.println("PAN Card");
		}
	}


