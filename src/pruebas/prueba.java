package pruebas;

import Archivos.Archivo;
import java.util.List;

public class prueba {
    
    public static void main(String[] args) {
        List<String[]> lista = Archivo.leerLista();
        for(String[] fila : lista){
            System.out.println(fila[10]);
        }
        System.out.println("");
        PruebaForm pb = new PruebaForm();
        pb.setVisible(true);
    }
    
}
