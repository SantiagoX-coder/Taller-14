package EjercicioN2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner idk = new Scanner(System.in);
        Persona persona = new Persona ("");
        persona.presentarse();
        System.out.println("Presente el nombre del profesor: ");
        String nombre = idk.nextLine();
        System.out.println("Cual es la materia da: ");
        String materia = idk.nextLine();
        Persona profesor = new Profesor(materia, nombre);
        profesor.presentarse();
        System.out.println("Presente el nombre del estudiante: ");
        String nombreEstudiante = idk.nextLine();
        System.out.println("Diga que edad del estudiante: ");
        int edad = idk.nextInt();
        idk.nextLine();
        System.out.println("Cual el grado que cursa el estudiante: ");
        String grado = idk.nextLine();
        Persona estudiante = new Estudiante (nombreEstudiante, grado, edad);
        estudiante.presentarse();
        idk.close();

    }
}