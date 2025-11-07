package EjercicioN1;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner idk =new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio=idk.nextDouble();
        Figura circulo =new Circulo(radio);
        circulo.mostrarDetalles();
        System.out.println("Ingrese la base del rectangulo: ");
        double base=idk.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        double altura=idk.nextDouble();
        Figura rectangulo =new Rectangulo (base,altura);
        rectangulo.mostrarDetalles();

        idk.close();


    }
}