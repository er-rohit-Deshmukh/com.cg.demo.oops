package com.cg.demo.Ex;

public class HowToThrowsExceprion
{
	static void printLoop() throws InterruptedException {

	for (int i = 1; i <= 10; i++) {

		Thread.sleep(500); // pause the execution for some time

		System.out.println(i);

	}
}

public static void main(String[] args) throws InterruptedException
{

	HowToThrowsExceprion.printLoop();

}

}
