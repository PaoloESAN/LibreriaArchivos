package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArchivoTXT {
    
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
    public static String leer(File archivo){
        String respuesta = "";
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                respuesta += linea + "\n"; 
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return respuesta;
    }
    
    public static String leer(){
        String respuesta = "";
        //----------------------------------------------------------------------
        //ABRE LA VENTANA PARA SELECCIONAR UN ARCHIVO
        //----------------------------------------------------------------------
        File archivo;
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir"))); 
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos TXT (*.txt)", "txt");
        fileSelect.setFileFilter(filter);
        fileSelect.setMultiSelectionEnabled(false);

        int result = fileSelect.showOpenDialog(null); //abre la ventana para escoger archivos

        if (result == fileSelect.APPROVE_OPTION) {
            archivo = fileSelect.getSelectedFile();
        } else {
            System.out.println("Error al cargar");
            return "";
        }
        //----------------------------------------------------------------------
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
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
    public static List<String[]> leerLista(File archivo){
        List<String[]> lista = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
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
    public static List<String[]> leerLista(){
        
        List<String[]> lista = new ArrayList<>();
        
        //----------------------------------------------------------------------
        //ABRE LA VENTANA PARA SELECCIONAR UN ARCHIVO
        //----------------------------------------------------------------------
        File archivo;
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir")));
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos TXT (*.txt)", "txt");
        fileSelect.setFileFilter(filter);
        fileSelect.setMultiSelectionEnabled(false);

        int result = fileSelect.showOpenDialog(null); //abre la ventana para escoger archivos

        if (result == fileSelect.APPROVE_OPTION) {
            archivo = fileSelect.getSelectedFile();
        } else {
            System.out.println("Error al cargar");
            return lista;
        }
        //----------------------------------------------------------------------
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
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
    
    public static File selecArchivo(){
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir")));
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos TXT (*.txt)", "txt");
        fileSelect.setFileFilter(filter);
        fileSelect.setMultiSelectionEnabled(false);

        int result = fileSelect.showOpenDialog(null); //abre la ventana para escoger archivos

        if (result == fileSelect.APPROVE_OPTION) {
            return fileSelect.getSelectedFile();
        } else {
            System.out.println("Error al cargar");
            return null;
        }
    } 
}
