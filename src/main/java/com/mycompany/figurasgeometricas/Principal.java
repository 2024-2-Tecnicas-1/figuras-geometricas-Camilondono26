package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal { //Complejidad O(1)

    public static void main(String[] args) {
        // TODO: Tu código va aquí
        //Complejidad O(1)
        String nombre;
        String color;
        int tipoFigura;
        FiguraGeometrica figura = null;

        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        nombre = lector.nextLine();

        System.out.println("Ingrese el color de la figura");
        color = lector.nextLine();

        System.out.println("Ingrese el tipo de figura ");
        System.out.println("Presione 1 para Círculo");
        System.out.println("Presione 2 para Rectángulo");
        System.out.println("Presione 3 para Triángulo");
        tipoFigura = lector.nextInt();

        switch (tipoFigura) { //Complejidad O(1)
            case 1 -> {
                System.out.println("Ingrese el radio del círculo");
                double radio = lector.nextDouble();
                figura = new Circulo(nombre, color, radio);
            }
            case 2 -> {
                System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2 = lector.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
            }
            case 3 -> {
                System.out.println("Ingrese el valor de la base del triángulo");
                double base = lector.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo");
                double altura = lector.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
            }
            default -> System.out.println("Opción no válida");
        }
        if (figura != null) { //Complejidad O(1)
            System.out.println("El área de la figura " + nombre + " de color " + color + " es " + figura.obtenerArea());
            System.out.println("El perímetro de la figura " + nombre + " de color" + color + " es " + figura.obtenerPerimetro());
        }
    }
}
