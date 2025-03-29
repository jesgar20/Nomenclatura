package Ejercicios;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la capacidad maxima del contenedor de rectangulos: ");
        int capacidad = sc.nextInt();
        ContainerRect contenedor = new ContainerRect(capacidad);

        for (int i = 0; i < capacidad; i++) {
            System.out.println("\nIngrese los datos del rectangulo " + (i + 1) + ":");

            System.out.print("Esquina 1 - x: ");
            double x1 = sc.nextDouble();
            System.out.print("Esquina 1 - y: ");
            double y1 = sc.nextDouble();
            System.out.print("Esquina 2 - x: ");
            double x2 = sc.nextDouble();
            System.out.print("Esquina 2 - y: ");
            double y2 = sc.nextDouble();

            Rectangulo rect = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
            contenedor.addRectangulo(rect);
        }

        System.out.println("\nContenido del contenedor de rectangulos:");
        System.out.println(contenedor);

        sc.close();
    }
}
