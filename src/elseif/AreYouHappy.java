package elseif;

import javax.swing.JOptionPane;
 
public class AreYouHappy {
	public static void main(String[] args) {
		 String happy = JOptionPane.showInputDialog("Are you happy?");
		 if(happy.equals("yes")) {
		 	JOptionPane.showMessageDialog(null, "Keep doing whatever youre doing");
		 	 if (happy.equals("no")) {
				 String cool =	JOptionPane.showInputDialog(null, "Do you want to be happy?");
				 if (cool.equals("yes")) {
					 JOptionPane.showMessageDialog(null, "Change something");	
					 }
					 if(cool.equals("no")) {
					 JOptionPane.showMessageDialog(null, "Keep doing whatever youre doing");
					 }
		 }
		
		 }
		

		 }
		 }

	
	
