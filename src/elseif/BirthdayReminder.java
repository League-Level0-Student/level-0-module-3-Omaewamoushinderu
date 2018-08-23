
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October";
		String dadsBirthday = "A date";
		String myBirthday = "January 27th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String birthday = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		// 4. if user asked for "mom"
		if(birthday.equals("Mom"))
			System.out.println(momsBirthday);
			//print mom's birthday
		// 5. if user asked for "dad"
		if(birthday.equals("Dad"))
			System.out.println(dadsBirthday);
			// print dad's birthday
		// 6. if user asked for your name
		if(birthday.equals("yours"))
			System.out.println(myBirthday);
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
System.out.println("Sorry I dont remember that persons birthday.");
	} 
}
