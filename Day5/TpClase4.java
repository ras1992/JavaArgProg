package Day5;
import java.util.Scanner;

public class TpClase4 {
    public static void main(String[] args){
        solicitud();
        
    }

    
    public static void solicitud(){
        Scanner numIngresado = new Scanner(System.in);
        float n1; float n2;
        System.out.print("Ingrese 1º número o Nº con coma: ");
        n1=numIngresado.nextFloat();
        System.out.print("Ingrese 2º número o Nº con coma: ");
        n2=numIngresado.nextFloat();

        System.out.println("El resultado de la suma es: " + suma(n1,n2));
        numIngresado.close();
    }
    private static float suma(float n1, float n2){
        return n1+n2;
    }

    public static void solicitudOrden(){
        Scanner numIngresado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que a ingresar: ");
        int n=numIngresado.nextInt();
        for(int i=0;i<n;i++){
            
        }
    }
}