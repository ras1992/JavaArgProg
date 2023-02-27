import java.util.Scanner;

public class ClasePrimerProyecto {
    public static void main(String[] args) {
        System.out.println("Vieja apurada!!!");
        EjerciciosTp1 accion = new EjerciciosTp1();

        // Llama a la función
        // accion.Ej1a();
        // accion.Ej1b();
        // Solicita el valor del indicador por teclado
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Filtro para mostrar (impar ingrese 1 y para impar 0): ");
        // int ras = scanner.nextInt();
        // accion.Ej1c(ras);
        accion.Ej1d();
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
            System.out.println(numeroInicio);
            ++numeroInicio;
        }
    }

    void Ej1b() {
        System.out.println("\nEjercicio 1b");
        // Muestra todos los valores del intervalo que son enteros;
        int numeroInicio = 5;
        int numeroFin = 14;

        while (numeroInicio <= numeroFin) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
            ++numeroInicio;
        }
    }

    void Ej1c(int indicador) {
        System.out.println("\nEjercicio 1c");
        // Muestra todos los valores del intervalo;
        int numeroInicio = 5;
        int numeroFin = 14;
        if (indicador==0 || indicador==1 ) {
            while (numeroInicio <= numeroFin) {
                if (numeroInicio % 2 == indicador) {
                    System.out.println(numeroInicio);
                }
                ++numeroInicio;
            }
        }else{
            System.out.println("Ingreso mal el valor, vuelva a intentarlo");

        }
    }
    void Ej1d() {
        System.out.println("\nEjercicio 1b");
        // Muestra todos los valores del intervalo que son enteros;
        int numeroInicio = 5;
        int numeroFin = 14;

        for (int i = numeroFin; numeroInicio <= numeroFin; --numeroFin) {
            if (numeroFin % 2 == 0) {
                System.out.println(numeroFin);
            }        
        }
    }
}
