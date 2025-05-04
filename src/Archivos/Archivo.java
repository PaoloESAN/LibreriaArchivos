package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    
    public static String leer(String ruta){
        String respuesta = "";
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                respuesta += linea + "\n"; 
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return respuesta;
    }
}
