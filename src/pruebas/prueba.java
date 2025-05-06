package pruebas;

import Archivos.ArchivoDAT;
import Archivos.ArchivoTXT;
import java.util.Arrays;
import java.util.List;

public class prueba {
    
    public static void main(String[] args) {
        System.out.println(ArchivoDAT.leer("Usuarios.DAT", 104));
        List<String[]> lista = ArchivoDAT.leerLista(104);
        for(String[] fila : lista){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("");
        PruebaForm pb = new PruebaForm();
        pb.setVisible(true);
    }
    
}
