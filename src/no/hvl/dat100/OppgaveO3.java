package no.hvl.dat100;

import java.util.Scanner;


public class OppgaveO3 {

public static void main(String[] args) {
	Scanner fakultet = new Scanner(System.in);
	
	System.out.println("skriv et helttall n >0 ");
	
	
	long n= fakultet.nextInt();
	long resultat=1;
	
	for(long i=1;i<=n;i++) {
	resultat= resultat*i;
									
		
	}
	System.out.println("n! = "+ resultat);
	fakultet.close();
	}


}
