package Day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class lecturaArchivos {

	public static void main(String[] args) throws IOException {
		
		String ruta = "D:\\DatosPC\\Escritorio\\Java\\Day4\\miprimerarchivo.txt";
		
		for (String linea : Files.readAllLines(Paths.get(ruta))){
					
			System.out.println(linea);
			}
	}
}

// File archivo = new File("C:\\Users\\Neli\\Pictures\\miprimerarchivonum.txt");
// 		int sumaInt=0;
		
// 		Scanner sumaNumeros = new Scanner(archivo);
// 		 while (sumaNumeros.hasNextInt()) { 
        
//              sumaInt = sumaInt + sumaNumeros.nextInt();
//          }
		 
// 		 System.out.println("La suma es: "+ sumaInt);