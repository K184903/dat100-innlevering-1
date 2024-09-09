package no.hvl.dat100;


import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO1A {

	public static void main(String[] args) {
				
				
					
					String karTxt = showInputDialog("Tallkarakter: ");
					int tallkarakter = parseInt(karTxt);
					
					String karakter;
					
					if(tallkarakter >=90 && tallkarakter <=100) {
						karakter = "A";
					} else if (tallkarakter >=80 && tallkarakter <=89) {
						karakter ="B";
					} else if (tallkarakter >=60 && tallkarakter <=79) {
						karakter = "C";
					} else if (tallkarakter >=50 && tallkarakter <=59) {
						karakter = "D";
					} else if (tallkarakter >= 40 && tallkarakter <=49) {
						karakter = "E";
					} else if (tallkarakter >=0 && tallkarakter <=39) {
						karakter = "F";
					} else {
						karakter = "ugyldig karakter: ";
					}
						
					
				showMessageDialog(null, "karakter: " + karakter);
				
					}
				
				}

				

