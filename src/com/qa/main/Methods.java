package com.qa.main;

public class Methods {
	
	public void getLength(String input) {
		
		int whitespace = 0;
		
		for (int i = 0; i < input.length(); i ++) {
			
			if (input.substring(i, i+1).contentEquals(" ") || i == (input.length()-1)) {
				whitespace ++;
			}
			
		}
		
		System.out.println("wordcount: " + whitespace);
		
	}
	
	public void getVertical(String input) {
		
		int whitespace = 0;
		
		for (int i = 0; i < input.length(); i ++) {
			
			if  (input.substring(i, i+1).contentEquals(" ") || i == (input.length()-1)) {
				System.out.println(input.substring(whitespace, i+1));
				whitespace = i+1;
			}
			
		}
	}
	
	public void reverseVertical(String input) {
		
		int whitespace = input.length();
		
		for (int i = input.length(); i > 0; i --) {
			
			if  ( input.substring(i-1, i).contentEquals(" ") ) {
				System.out.println(input.substring(i, whitespace));
				whitespace = i;
			} else if (i == 1) { //just for the first word
				System.out.println(input.substring(i-1, whitespace));
			}
			
		}
		
	}
	
	public boolean findString(String message, String find) {
		
		boolean myFirstBool = false;
		
		for (int i=0; i < message.length();i++) {
			
			if (find.substring(0,1).equals(message.substring(i, i+1))) {
				
				for (int j = 0; j < find.length() ;j++) {
					
					if (find.substring(j,j+1).equals(message.substring(j+i, j+i+1))) {
						myFirstBool = true;
					} else {
						myFirstBool = false;
					}
					
				}
				
			}
			
		}
		
		System.out.println("Substring present? " + myFirstBool);
		return myFirstBool;
		
	}

	
	
}
