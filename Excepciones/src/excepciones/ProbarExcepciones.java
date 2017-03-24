package excepciones;

import java.util.Scanner;

public class ProbarExcepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserte un número");
		String sNumero;
		int iNumero=0;
		int doble=0
				;
		try{
		sNumero=sc.nextLine();
		iNumero=Integer.parseInt(sNumero);
		doble=iNumero*2;}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		System.out.println("El doble de "+iNumero+" es "+doble);
	}

}
