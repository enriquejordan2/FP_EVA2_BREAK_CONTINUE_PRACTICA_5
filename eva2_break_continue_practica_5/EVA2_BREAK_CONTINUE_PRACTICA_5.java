/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_break_continue_practica_5;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_BREAK_CONTINUE_PRACTICA_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Break --> termina el ciclo completamente
        // CONTINUE --> interrumpe larepeticion actual
        
        //Scanner captu = new Scanner(System.in);
        for (int i =1; i <=10; i++){
        if (i==8)
            break;
        System.out.print(i + "-");
                
    }
        System.out.println("");   
         for (int i =1; i <=10; i++){
       if ( i ==8)
           continue;
        System.out.print(i + "-");
                
    }
        
        
    }
      
}
