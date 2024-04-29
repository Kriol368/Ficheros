package ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Ejemplo2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce un directorio:");
        String ent = new BufferedReader(new InputStreamReader(System.in)).readLine();
        File f = new File(ent);
        System.out.println("Lista de ficheros y directorios del directorio: " + ent);
        System.out.println("---------------------------------------------------");
        for (String e : Objects.requireNonNull(f.list())) {
            System.out.println(e);
        }
    }
}
