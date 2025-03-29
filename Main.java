package Actividades;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	     // Ingreso de coordenadas para el primer rectángulo
	        System.out.print("Ingrese las coordenadas X e Y de la primera esquina del rectángulo A (separadas por espacio): ");
	        double x1A = scanner.nextDouble();
	        double y1A = scanner.nextDouble();

	        System.out.print("Ingrese las coordenadas X e Y de la segunda esquina del rectángulo A (separadas por espacio): ");
	        double x2A = scanner.nextDouble();
	        double y2A = scanner.nextDouble();

	        // Ingreso de coordenadas para el segundo rectángulo
	        System.out.print("Ingrese las coordenadas X e Y de la primera esquina del rectángulo B (separadas por espacio): ");
	        double x1B = scanner.nextDouble();
	        double y1B = scanner.nextDouble();

	        System.out.print("Ingrese las coordenadas X e Y de la segunda esquina del rectángulo B (separadas por espacio): ");
	        double x2B = scanner.nextDouble();
	        double y2B = scanner.nextDouble();

	        Rectangulo rectanguloA = new Rectangulo(new Coordenada(x1A, y1A), new Coordenada(x2A, y2A));
	        Rectangulo rectanguloB = new Rectangulo(new Coordenada(x1B, y1B), new Coordenada(x2B, y2B));

	        System.out.println("\n" + rectanguloA);
	        System.out.println("Área: " + rectanguloA.calcularArea());
	        System.out.println("Perímetro: " + rectanguloA.calcularPerimetro());

	        System.out.println("\n" + rectanguloB);
	        System.out.println("Área: " + rectanguloB.calcularArea());
	        System.out.println("Perímetro: " + rectanguloB.calcularPerimetro());

	        if (rectanguloA.seSuperpone(rectanguloB)) {
	            System.out.println("\nLos rectángulos A y B se superponen.");
	            System.out.println("Área de superposición: " + rectanguloA.calcularAreaInterseccion(rectanguloB));
	        } else if (rectanguloA.seJunta(rectanguloB)) {
	            System.out.println("\nLos rectángulos A y B se juntan.");
	        } else {
	            System.out.println("\nLos rectángulos A y B son disjuntos.");
	        }
	    }
}
