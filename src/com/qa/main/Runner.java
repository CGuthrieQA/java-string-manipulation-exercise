package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		
		Methods mtd = new Methods();
		
		String testString1 = "Here are four words.";
		String testString2 = "are";
		
		mtd.getLength(testString1);
		mtd.getVertical(testString1);
		mtd.reverseVertical(testString1);
		mtd.findString(testString1, testString2);
		
	}
}
