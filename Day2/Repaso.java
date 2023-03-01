public class Repaso {
    public static void main(String[] args) {
        double d= 4.5222;
        d=Math.round(d*100.0)/100.0;
        System.out.println("Resultado: "+d);

        System.out.println("\nEjercicio 1b");
        // Muestra todos los valores del intervalo que son enteros;
        int numeroInicio = 1;
        int numeroFin = 10;

        for (; numeroInicio <= numeroFin; --numeroFin) {
            if (numeroFin % 2 == 0) {
                System.out.print(numeroFin+",");
            }        
        }

    }
}