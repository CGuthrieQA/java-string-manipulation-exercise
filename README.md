 # String Manipulation

 1. For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:

 * Method 1 - When given a String, count and return how many words there are in that String.

```java
public void getLength(String input) {
		
	int whitespace = 0;
	
	for (int i = 0; i < input.length(); i ++) {
		
		if (input.substring(i, i+1).contentEquals(" ") || i == (input.length()-1)) {
			whitespace ++;
		}
		
	}
	
	System.out.println("wordcount: " + whitespace);
	
}
```


 * Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.

 ```java
 public void getVertical(String input) {
		
	int whitespace = 0;
	
	for (int i = 0; i < input.length(); i ++) {
		
		if  (input.substring(i, i+1).contentEquals(" ") || i == (input.length()-1)) {
			System.out.println(input.substring(whitespace, i+1));
			whitespace = i+1;
		}
		
	}
}
 ```

 * Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.

 ```java
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
 ```

 * Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. A boolean value should be returned to indicate whether or not the second String has been found in the message.

 ```java
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
 ```

 ## Everything

 ```java
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

 ```

 ```java
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

 ```