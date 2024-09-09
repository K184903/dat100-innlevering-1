package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {
		int inntekt;
		double prosent = 0;
		double skatt=0.0;
		
	
		
		
		String karTxt = showInputDialog("inntekt: ");
		inntekt = parseInt(karTxt);
		

		if( inntekt <208050) {
			prosent = 0;
		}
		else if(inntekt >= 208051 && inntekt <=292850) {
			prosent = 0.017;
			skatt=((inntekt-208050)*0.017);
		} else if (inntekt >=292851 && inntekt <=670000) {
			prosent = 0.04;
			skatt=(84800*0.017)+((inntekt-292850)*0.04);
		} else if (inntekt >= 670001 && inntekt <=937900) {
			prosent = 0.0136;
			skatt=(84800*0.017)+(377150*0.04)+((inntekt-670000)*0.0136);
		} else if (inntekt >=937901 && inntekt <=1350000) {
			prosent = 0.0166;
			skatt=(84800*0.017)+(377150*0.04)+(267900*0.0136)+((inntekt-937900)*0.0166);
		} else if(inntekt >= 1350000) {
			prosent = 0.0176;
			skatt=(84800*0.017)+(377150*0.04)+(267900*0.0136)+((inntekt-1350000)*0.01176);
		}
		double skattbeløp = inntekt *( prosent);
		
	System.out.println("Trinnskatt å betale: " + skatt + "kr");
	
	
				
	

	}

}
