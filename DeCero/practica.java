

import java.util.Scanner;


public class practica {
    public static void main(String[] args) {
        //System.out.println("Vieja apurada!!!");

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("");
        // int ras = scanner.nextInt();

        // Utilizando la sentencia while, imprima todos los números entre 2 variables
        // “a”
        // y “b”. Su código puede arrancar (por ejemplo):
        // Se deberían mostrar los números:
        // 5,6,7,8,9,10,11,12,13,14

        int numeroInicio = 5;
        int numeroFin = 14;

////////////
        while (numeroInicio <= numeroFin) {
             // 5,6,7,8,9,10,11,12,13,14 original

             // 5,6,7,8,9,10,11,12,13,14, resultado
            
            if(numeroInicio == numeroFin)
            
            {
                System.out.print(numeroInicio);
            }
            
            else //no
            {
                System.out.print(numeroInicio+",");
            }

            ++numeroInicio;

        }

        
///////////

    }
}
