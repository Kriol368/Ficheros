package gestionSistemaFicheros;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        File actual = File.listRoots()[0];
        int opcion;
        do {
            int contador = 0;
            contador = mostrarMenu(actual, contador);
            opcion = getOption();
            if (opcion > contador) {
                System.out.println("Introduzca una opcion correcta");
            } else if (opcion == -1) {
                break;
            } else if (opcion == 0) {
                if (actual.getName().isBlank()) {
                    System.out.println("Ya estas en la raiz");
                } else {
                    actual = actual.getParentFile();
                }
            } else {
                File seleccionado = Objects.requireNonNull(actual.listFiles())[opcion - 1];
                if (seleccionado.isFile()) {
                    System.out.println("Es un archivo de tamaño " + seleccionado.length());
                } else {
                    actual = seleccionado;
                }
            }
        } while (true);
    }

    private static int mostrarMenu(File actual, int contador) {
        System.out.println("Lista de ficheros y directorios del directorio: " + actual);
        System.out.println("------------------------------------------------------------------");
        System.out.println(contador + ".- Directorio padre");
        for (File e : Objects.requireNonNull(actual.listFiles())) {
            contador++;
            if (e.isDirectory()) {
                System.out.println(contador + ".- " + e.getName() + " <Directorio>");
            } else {
                System.out.println(contador + ".- " + e.getName() + " " + e.length());
            }
        }
        System.out.println("Introduce una opcion (-1 para salir):");
        return contador;
    }

    public static int getOption() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
}
