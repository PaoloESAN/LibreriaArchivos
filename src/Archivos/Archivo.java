package Archivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
    
        public static List<String[]> leerLista(String ruta){
        List<String[]> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.trim().split("\\s+"); 
                //.trim elimina los espacios al inicio y al final
                // .split divide el texto
                // \\s+ : en java para poner "\" debes ponerlo 2 veces, entonces seria: \s+
                // \s significa cualquier caracter en blanco
                // + significa uno o más
                // \s+ entonces significa uno o mas caracteres en blanco
                lista.add(partes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
