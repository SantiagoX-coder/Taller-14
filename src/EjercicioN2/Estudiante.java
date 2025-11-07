package EjercicioN2;

public class Estudiante extends Persona {
    private int edad;
    private String grado;

    public Estudiante( String nombre, String grado, int edad) {
        super(nombre);
        this.grado = grado;
        this.edad = edad;

    }
    @Override
    public void presentarse() {
        System.out.println("Hola soy estudiante de grado " + grado + " , mi nombre es " + nombre + " y tengo " + edad + " años.");
    }


}
