import java.util.Scanner;
//introdyu
public class Codigo5 {

	public static void main(String[] args) {		

		    Scanner s = new Scanner(System.in);
		    System.out.print("Introduzca un número mayor a 10: ");
		    int ni = s.nextInt();
		    
		    s.close();
		    if(ni > 10) {
		    	 int c = ni;
				    
				    int afo = 0;
				    int noAfo = 0;
				    
				    while (ni > 10) {
				    
					  int digito = ni % 10;
					  
				      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
						afo++;
						
				      } else {
						noAfo++;			  
				    }//if else	
				      ni /= 10;
				  }	//while				    
				  		   
				    	if (afo > noAfo) {
						      System.out.println("El " + c + " es un número afortunado.");
						    } else {
						      System.out.println("El " + c + " no es un número afortunado.");
						    }
		    }else {
		    	System.out.println("Error: el número debe ser mayor a 10");
		    }//solo para validar que hayan introducido un dato correcto
	}//main

}//class codigo 5
