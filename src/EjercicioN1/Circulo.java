package EjercicioN1;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public void mostrarDatos() {
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + calcularArea());
        super.mostrarDetalles();
    }

}
