import java.util.Scanner;
//se genera un arreglo de 20 numeros aleatorios entre 0 y 401, y despues te puede mostrar los elementos que sean multiplos de 5 o multiplos de 7
public class Codigo6 {

	public static void main(String[] args) {
		
		 int opcion = 0;
		 int multiplo = 0;
		 int[] n = new int[20];

		    for (int i = 0; i < 20; i++) {
		      n[i] = (int)(Math.random() * 401);
		      System.out.print(n[i] + " ");
		    }
		    
		    System.out.println("\n¿Qué números quiere resaltar? ");
		    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
		    
		    Scanner s = new Scanner (System.in);
		    opcion = s.nextInt();
		    s.close();
		    
		    if(opcion != 1 && opcion != 2) {
		    	System.out.println("La opcion ingresada no es valida");//si ingresan una opcion diferente a la mostrada
		    }else {
		    	
		    	multiplo = (opcion == 1) ? 5 :  7;
		    	
		    	for (int i : n) {
		    		if (i % multiplo == 0) {
				        System.out.print("[" + i + "] ");
		    		}
					}//for para revisar si son multiplos
			    

		    	}//else si selecciono una opcion valida
	}//main
}//class codigo 6

