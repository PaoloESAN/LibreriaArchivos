package pruebas;

import Archivos.Archivo;

public class prueba {
    
    public static void main(String[] args) {
        System.out.println(Archivo.leer("Usuarios.TXT"));
        PruebaForm pb = new PruebaForm();
        pb.setVisible(true);
    }
    
}
