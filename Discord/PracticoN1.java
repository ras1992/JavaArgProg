import java.util.Scanner;
import java.time.LocalTime;

public class PracticoN1 {

    public static void menu() {
        EjerciciosTp1 accion = new EjerciciosTp1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ejercicio que quiere realizar. Ej.( 1a al 2abcd): \n");
        String seleccion = scanner.next();

        switch (seleccion) {
            case "1a":
                accion.Ej1a();
                persistencia();
                break;
            case "1b":
                accion.Ej1b();
                persistencia();
                break;
            case "1c":
                System.out.print("Filtro para mostrar (impar ingrese 1 y para impar 0): ");
                int ras = scanner.nextInt();
                accion.Ej1c(ras);
                persistencia();
                break;
            case "1d":
                accion.Ej1d();
                persistencia();
                break;
            case "2a":
                System.out.println("Ingrese su ingreso mensual: ");
                double ras1 = scanner.nextDouble();
                System.out.println("¿Cuantos vehículos con una antigüedad menor a 5 años tiene?: ");
                int auto = scanner.nextInt();
                System.out.println("¿Cuantos inmuebles tiene?: ");
                int casa = scanner.nextInt();
                System.out.println(
                        "¿Posees una embarcación, una aeronave de lujo o ser titular de activos societarios que demuestren capacidad económica plena.?: ");
                System.out.println("si tienes pon ( si )");
                String respuesta = scanner.next();
                boolean rico = respuesta.equalsIgnoreCase("si");
                accion.Ej2abcd(ras1, auto, casa, rico);
                persistencia();
                break;
            // más casos si es necesario
            default:
                System.out.println("¿Sabes leer o te haces?\n");
                persistencia();
        }
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
            // LocalTime horaActual = LocalTime.now().withMinute(0).withSecond(0).withNano(0);
            // // formato "hh:mm:ss"
            // String horaActualString = horaActual.toString();
            // int hora = Integer.parseInt(horaActualString);
            // System.out.println(hora);
            // if (hora >= 1) {
            //     System.out.println("Que sueñes lindo xD");
            // } else if (hora >= 8) {
            //     System.out.println("Que tengas una buena día");
            // } else if (hora >= 15) {
            //     System.out.println("Que tengas una buena tarde");
            // } else if (hora >= 20) {
            //     System.out.println("Que tengas una buena noche");
            // }
        }
    }

    public static void main(String[] args) {
        System.out.println("Vieja apurada!!! ");
        menu();
    }
}

class EjerciciosTp1 {
    // Función Ejercicio 1;
    void Ej1a() {
        System.out.println("\nEjercicio 1a");
        // Muestra todos los valores del intervalo;

        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin) {
            System.out.print(numeroInicio+",");
            ++numeroInicio;
        }
        System.out.print("\n");
        
    }

    void Ej1b() {
        System.out.println("\nEjercicio 1b");
        // Muestra todos los valores del intervalo que son enteros;
        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.print(numeroInicio+",");
            }
            ++numeroInicio;
        }
        System.out.print("\n");
    }

    void Ej1c(int indicador) {
        System.out.println("\nEjercicio 1c");
        // Muestra todos los valores del intervalo;
        int numeroInicio = 5;
        int numeroFin = 14;
        if (indicador == 0 || indicador == 1) {
            while (numeroInicio <= numeroFin) {
                if (numeroInicio % 2 == indicador) {
                    System.out.println(numeroInicio);
                }
                ++numeroInicio;
            }
        } else {
            System.out.println("Ingreso mal el valor, vuelva a intentarlo");

        }
    }

    void Ej1d() {
        System.out.println("\nEjercicio 1b");
        // Muestra todos los valores del intervalo que son enteros;
        int numeroInicio = 5;
        int numeroFin = 14;

        for (; numeroInicio <= numeroFin; --numeroFin) {
            if (numeroFin % 2 == 0) {
                System.out.println(numeroFin);
            }
        }
    }

    void Ej2abcd(double ras1, int auto, int casa, boolean rico) {
        System.out.println("\nEjercicio 2abcd");

        double ingreso = ras1;
        double mes = 489.083;

        if (ingreso >= mes || auto >= 3 || casa >= 3) {
            System.out.println("Felicidades pagas muchisimos impuestos o eres politico");
        } else {
            System.out.println("Vives la vida como puedes felicidades");
        }
        if (rico == true) {
            System.out.println("De donde estas robando?");
        }
    }
}
