package Day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.Path;

public class lecturaArchivos {

	// public static void main(String[] args) throws IOException {
		
	// 	String ruta = "D:\\DatosPC\\Escritorio\\Java\\Day4\\miprimerarchivo.txt";
		
	// 	for (String linea : Files.readAllLines(Paths.get(ruta))){
					
	// 		System.out.println(linea);
	// 		}
	// }

// 	public static void main(String[] args) throws IOException {
//     String ruta = "D:\\DatosPC\\Escritorio\\Java\\Day4\\miprimerarchivo.txt";
//     int lineaDeseada = 3;

//     String linea = Files.readAllLines(Paths.get(ruta)).get(lineaDeseada - 1);
//     System.out.println("La línea " + lineaDeseada + " es: " + linea);
//   }
// }

	public static void main(String[] args) throws IOException {
		String ruta = "D:\\DatosPC\\Escritorio\\Java\\Day4\\miprimerarchivo.txt";
		Path rutaGet = Paths.get(ruta);
		if (Files.exists(rutaGet)){
			System.out.println("\nExiste el documento\n");
		}else{
			System.out.println("\nNo existe documento\n");
			Files.createFile(rutaGet);
			if(Files.exists(rutaGet)){
				System.out.println("\nSe creo correctamente el archivo\n");
			}else{
				System.out.println("\nHubo un error. \nNO se creo correctamente el archivo\n");
			}
		}
		System.out.println("Documento Estado actual:");
		for (String linea1 : Files.readAllLines(Paths.get(ruta))){				
			System.out.println(linea1);
			}
		// Escritura de documento al final de la lista
		String nuevaLinea = "\n"+"lagarto12";
		Files.write(Paths.get(ruta), nuevaLinea.getBytes(), StandardOpenOption.APPEND);
		
		System.out.println("\nDocumento Actualizado:");
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