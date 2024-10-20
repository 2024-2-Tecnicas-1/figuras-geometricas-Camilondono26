package com.mycompany.figurasgeometricas;

public class Triangulo extends FiguraGeometrica { //Complejidad O(1)

    private double base;
    private double altura;

    public Triangulo(String nombre, String color, double base, double altura) {
        super(nombre, color);
        this.altura = altura;
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        double areaTriangulo = base * altura;
        return areaTriangulo; //Complejidad O(1)
    }

    @Override
    public double obtenerPerimetro() {
        double perimetroTriangulo = 3*base;
        return perimetroTriangulo; //Complejidad O(1)
    }
}
