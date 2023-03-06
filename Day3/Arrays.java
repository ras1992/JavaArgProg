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
            case "3":
                accion.ordenamiento(3);
                persistencia();
                break;
            case "4":
                accion.letraRep("La gorda canta feo","a");
                persistencia();
                break;
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

        void letraRep(String texto,String letra){
            var cont=0;
            String texto1=texto;
            for (int i = 0; i < texto.length(); i++) {
                char letra1= texto1.charAt(i);
                String s = new String(new char[] {letra1});
                if (s.equals(letra)){
                    cont++;
                }
                
                
            }
            System.out.println("La letra ("+letra+") esta repetida: "+cont+" veces.");
        }

        void ordenamiento(int n){
            int numeros[] = new int[n];
            Scanner scanner = new Scanner(System.in);
            int acum=0;
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese 1 numero: \n");
                int seleccion = Integer.parseInt(scanner.next());
                numeros[i]= seleccion;     
            }
            for (int i = 0; i < 2; i++) {
                if(numeros[i]>numeros[i+1]){
                    acum =numeros[i+1];
                    numeros[i+1]=numeros[i];
                    numeros[i]=acum;
                    i=0;
                }
                     
            }
            System.out.println("Num ordenados: ");
            for (int i = 0; i < 3; i++) {
                System.out.println(numeros[i]);     
            }

        }
    }
