package ejemplos;

import java.io.*;
import java.util.Objects;

public class Ejemplo1 {
    public static void main(String[] args) {
        //Abre el directorio actual '.'
        File f = new File(".");
        System.out.println("Lista de ficheros y directorios del directorio actual");
        System.out.println("---------------------------------------------------");
        //recorre la lista de ficheros (recordad que un directorio es un tipo especial de fichero)
        for (String e : Objects.requireNonNull(f.list())){
            System.out.println(e);
        }
    }
}
