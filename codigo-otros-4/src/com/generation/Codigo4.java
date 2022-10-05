package com.generation;//se crea el package com.generation
import java.util.Scanner;//se importa para poder utilizar el scaner


public class Codigo4 {
	
	public static void main(String[] args) {
		
		 int g = 0;//variable ganador
	
	System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");

    Scanner s = new Scanner(System.in);    
    
    String j1 = s.nextLine();
    
    System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");  
   
    String j2 = s.nextLine();
    
    System.out.println("El jugador 1 ha elegido: "+ j1 + " y el jugador 2 ha elegido: " + j2);
    
    s.close();
    //primero se verifica que no sea un empate, despues se evaluan los casos
    
    if (j1.equals(j2)) {
    	
      System.out.println("Es un empate");
      
    } else {
    	
    	switch(j1) {
    	
        case "piedra":
          if (j2.equals("tijeras")) {
            g = 1;
          }else if (j2.equals("papel")) {
        	  g = 2; 
          }else {
        	  System.out.println("El jugador 2 no ha elegido una opcion valida");
          }//se evalua que haya introducido seleccion valida
          break;
          
        case "papel":        	
          if (j2.equals("piedra")) { 
        	  g = 1;
          }else if(j2.equals("tijeras")) {
        	  g = 2; 
          }else {
        	  System.out.println("El jugador 2 no ha elegido una opcion valida");
          }  //se evalua que haya introducido seleccion valida        
          break; 
          
        case "tijeras":
        	if (j2.equals("piedra")) { 
          	  g = 2;
            }else if(j2.equals("papel")) {
          	  g = 1; 
            }else {
          	  System.out.println("El jugador 2 no ha elegido una opcion valida");
            }//se evalua que haya introducido seleccion valida     
          break;
          
        default:
        	System.out.println("El jugador 1 no ha elegido una opcion valida");
        break;
      }//switch del valor del jugador 1
    	if(g != 0) {
    	System.out.println("Gana el jugador " + g);
    	}
    }//else si no es un empate     
      
 }//main
  
}//class codigo4
