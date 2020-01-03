package factory;

import java.util.Scanner;

public class Factory {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        ConstruirContenido constructor = new ConstruirContenido();
        System.out.println("Ingrese nombre archivo");
        String nombreArchivo = sc.nextLine();
        
        try {
            Contenido contenido = constructor.construir(nombreArchivo);
            contenido.reproducir();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
}
