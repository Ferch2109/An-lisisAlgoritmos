//María Fernanda González Chávez.
//Programa que dadas dos cadenas (X y Y) y una posible combinación de estas (Z),
//nos indica si, efectivamente, Z es un shuffle de X y Y.

import java.util.Scanner;

public class Shuffle{
  
  public static void main(String[] args){
 
    String [] char1 = (args[0]+" ").split("");
    String [] char2 = (args[1]+" ").split("");
    String [] shuffle = (args[2]+" ").split("");
    
    int [][] matriz = new int[char1.length][char2.length];
    
    int i = 0;
    int j = 0;
    int k = 0;
    
    while( !char1[i].equals(" ") || !char2[j].equals(" ") ){
      
      if( char1[i].equals(shuffle[k]) )
        matriz[i++][j] = 1;
      else{
        
        if( char2[j].equals(shuffle[k]) )
          matriz[i][j++] = 1;
        else{
        
          if( !char2[--i].equals( char2[j] ) || ++j > char2.length-1 ){
            System.out.println("No es shuffle.");
            return;
          }
          
          matriz[i][j] = 1;
          k--;
          
        }
        
      }
    
    k++;
    
    }
    
    System.out.println("Si es shuffle.");
  }

}
