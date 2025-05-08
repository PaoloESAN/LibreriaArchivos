
package Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ArchivoDAT {
    
    public static String leer(String ruta, int longitudLinea){
        
        String respuesta = "";
        
        try (RandomAccessFile raf = new RandomAccessFile(new File(ruta),"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                respuesta += registro + "\n";
                
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return respuesta;
    }
    public static String leer(File archivo, int longitudLinea){
        
        String respuesta = "";
        
        try (RandomAccessFile raf = new RandomAccessFile(archivo,"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                respuesta += registro + "\n";
                
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return respuesta;
    }
    public static String leer(int longitudLinea){
        
        String respuesta = "";
        
        //----------------------------------------------------------------------
        //ABRE LA VENTANA PARA SELECCIONAR UN ARCHIVO
        //----------------------------------------------------------------------
        File archivo;
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir"))); 
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos DAT (*.dat)", "dat");
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
        try (RandomAccessFile raf = new RandomAccessFile(archivo,"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                respuesta += registro + "\n";
                
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return respuesta;
    }
    
    public static List<String[]> leerLista(String ruta, int longitudLinea){
        
        List<String[]> lista = new ArrayList<>();
        
        try (RandomAccessFile raf = new RandomAccessFile(new File(ruta),"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                String[] partes = registro.trim().split("\\s+"); 
                //.trim elimina los espacios al inicio y al final
                // .split divide el texto
                // \\s+ : en java para poner "\" debes ponerlo 2 veces, entonces seria: \s+
                // \s significa cualquier caracter en blanco
                // + significa uno o más
                // \s+ entonces significa uno o mas caracteres en blanco
                lista.add(partes);
                
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return lista;
    }
    public static List<String[]> leerLista(File archivo, int longitudLinea){
        
        List<String[]> lista = new ArrayList<>();
        
        try (RandomAccessFile raf = new RandomAccessFile(archivo,"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                String[] partes = registro.trim().split("\\s+"); 
                //.trim elimina los espacios al inicio y al final
                // .split divide el texto
                // \\s+ : en java para poner "\" debes ponerlo 2 veces, entonces seria: \s+
                // \s significa cualquier caracter en blanco
                // + significa uno o más
                // \s+ entonces significa uno o mas caracteres en blanco
                lista.add(partes);
                
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return lista;
    }
    public static List<String[]> leerLista(int longitudLinea){
        
        List<String[]> lista = new ArrayList<>();
        //----------------------------------------------------------------------
        //ABRE LA VENTANA PARA SELECCIONAR UN ARCHIVO
        //----------------------------------------------------------------------
        File archivo;
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir"))); 
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos DAT (*.dat)", "dat");
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
        try (RandomAccessFile raf = new RandomAccessFile(archivo,"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                String[] partes = registro.trim().split("\\s+"); 
                //.trim elimina los espacios al inicio y al final
                // .split divide el texto
                // \\s+ : en java para poner "\" debes ponerlo 2 veces, entonces seria: \s+
                // \s significa cualquier caracter en blanco
                // + significa uno o más
                // \s+ entonces significa uno o mas caracteres en blanco
                lista.add(partes);
                
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return lista;
    }
    
    public static String ponerEspacios(String palabra,int espacios){
        if (palabra.length() > espacios) {
            return palabra;
        }
        int cantidad = espacios - palabra.length();
        for (int i = 0; i < cantidad; i++) {
            palabra += " "; 
        }
        return palabra;
    }
    
    public static void agregar(File archivo, String linea){
        try {
            RandomAccessFile RAF = new RandomAccessFile(archivo,"rw");
            long longitudTodo = RAF.length();
            RAF.seek(longitudTodo);
            byte[] bytes = linea.getBytes(); 
            RAF.write(bytes);
            RAF.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoDAT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoDAT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void agregar(String ruta, String linea){
        try {
            RandomAccessFile RAF = new RandomAccessFile(ruta,"rw");
            long longitudTodo = RAF.length();
            RAF.seek(longitudTodo);
            byte[] bytes = linea.getBytes(); 
            RAF.write(bytes);
            RAF.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoDAT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoDAT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static int buscarIndice(String ruta, int longitudLinea, String palabra, int indice){
        
        try (RandomAccessFile raf = new RandomAccessFile(new File(ruta),"r")) {
            long tamanoArchivo = raf.length();
            long cantidadRegistros = tamanoArchivo / longitudLinea;

            for (int i = 0; i < cantidadRegistros; i++) {
                long posicion = i * longitudLinea;
                raf.seek(posicion);

                byte[] buffer = new byte[longitudLinea];
                raf.readFully(buffer);

                String registro = new String(buffer);
                
                String[] partes = registro.trim().split("\\s+"); 
                //.trim elimina los espacios al inicio y al final
                // .split divide el texto
                // \\s+ : en java para poner "\" debes ponerlo 2 veces, entonces seria: \s+
                // \s significa cualquier caracter en blanco
                // + significa uno o más
                // \s+ entonces significa uno o mas caracteres en blanco
                if (partes[indice].equals(palabra)) {
                    return i;
                }   
            }
        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }
        return -1;
    }
    public static File selecArchivo(){
        JFileChooser fileSelect = new JFileChooser(new File(System.getProperty("user.dir")));
        //user.dir hace que la ventana para escoger archivos inicie en la carpeta donde el programa fue ejecutado
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos DAT (*.dat)", "dat");
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
