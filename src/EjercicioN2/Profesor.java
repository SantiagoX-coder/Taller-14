package EjercicioN2;

public class Profesor extends Persona {
    private String materia;

    public Profesor(String materia, String nombre) {
        super(nombre);
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola soy profesor de " + materia + " y me llamo " + nombre );
    }


}
