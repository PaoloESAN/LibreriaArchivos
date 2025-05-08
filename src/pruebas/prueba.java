package pruebas;

import Archivos.ArchivoDAT;
import java.io.File;


public class prueba {
    
    public static void main(String[] args) {
        File archivo = ArchivoDAT.selecArchivo();
        System.out.println(ArchivoDAT.leer(archivo,104));
        String hola = ArchivoDAT.ponerEspacios("hola mundo", 50);
        System.out.println(hola+"fadawd");
        /*
        System.out.println(ArchivoDAT.leer("Usuarios.DAT", 104));
        List<String[]> lista = ArchivoDAT.leerLista(104);
        for(String[] fila : lista){
            System.out.println(Arrays.toString(fila));
        }
        System.out.println("");
        PruebaForm pb = new PruebaForm();
        pb.setVisible(true);*/
    }
    
}
