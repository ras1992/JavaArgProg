package Day3;

import java.util.Scanner;

//import java.time.LocalTime;
public class Arrays {

    public static void main(String[] args) {
        System.out.println("Vieja apurada!!! ");
        menu();
    }

    public static void persistencia() {
        System.out.println("\n### ¿Quiere continuar con otro ejercicio? Escribir ( si - no ) respectivamente: ");
        Scanner scanner = new Scanner(System.in);
        String respuesta = scanner.next();
        boolean resp = respuesta.equalsIgnoreCase("si");
        if (resp == true) {
            menu();
        } else {
            System.out.println("\nChau, que la pases lindo");
            // // Obtener la hora actual del sistema
            // LocalTime horaActual =
            // LocalTime.now().withMinute(0).withSecond(0).withNano(0);
            // // formato "hh:mm:ss"
            // String horaActualString = horaActual.toString();
            // int hora = Integer.parseInt(horaActualString);
            // System.out.println(hora);
            // if (hora >= 1) {
            // System.out.println("Que sueñes lindo xD");
            // } else if (hora >= 8) {
            // System.out.println("Que tengas una buena día");
            // } else if (hora >= 15) {
            // System.out.println("Que tengas una buena tarde");
            // } else if (hora >= 20) {
            // System.out.println("Que tengas una buena noche");
            // }
        }
    }

    public static void menu() {
        Ejercicios accion = new Ejercicios();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que quiere realizar. Ej.( 1a al 2abcd): \n");
        String seleccion = scanner.next();

        switch (seleccion) {
            case "1":
                // accion.Ej1a();
                accion.inicializarArrayArreglo();
                persistencia();
                break;

            case "2":
                // System.out.println("Ingrese su ingreso mensual: ");
                // double ras1 = scanner.nextDouble();
                // accion.Ej(ras1);
                accion.cantidadDatosString();
                persistencia();
                break;
            // más casos si es necesario
            default:
                System.out.println("¿Sabes leer o te haces?\n");
                persistencia();
        }
    }
}

    class Ejercicios {
        void inicializarArrayArreglo() {
            int numeros[] = new int[10];
            System.out.println("Inicializando: \n ");
            for (int i = 0; i < 10; i++) {
                numeros[i] = i + 4;
                System.out.println(numeros[i]);
            }
        }

        void cantidadDatosString(){
            int numeros[] = new int[10];
            System.out.print("Array de: "+numeros.length+" largo.");
        }

    }
