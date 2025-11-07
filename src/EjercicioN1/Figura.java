package EjercicioN1;

public abstract class Figura {

    public abstract double calcularArea();

    public void mostrarDetalles() {
        System.out.println("El área de la figura es: " + calcularArea());
    }
}
