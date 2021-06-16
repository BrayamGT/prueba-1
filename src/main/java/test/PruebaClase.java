package test;

import dominio.estudiantes;
import java.util.Scanner;

public class PruebaClase {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {


        estudiantes[] Estudiantes;
        int n = 3;
        Estudiantes = new estudiantes[n];
        llenaDatos(Estudiantes);
        System.out.println("Datos Almacenados");
        for (int i = 0; Estudiantes.length>= i;i++ ) {
            System.out.println(Estudiantes[i]);
        }

    }

    public static void llenaDatos(estudiantes Est[]) {
        String nombre;
        String sexo;
        double nota;
        for (int i = 0; i < Est.length; i++) {
            System.out.println("Nombre:");
            nombre = datos.nextLine();
            System.out.println("Sexo M o F:");
            sexo = datos.nextLine();
            System.out.println("Nota:");
            nota = datos.nextDouble();
            Est[i] = new estudiantes(nombre, sexo, nota);
            datos.nextLine();

        }

    }
}