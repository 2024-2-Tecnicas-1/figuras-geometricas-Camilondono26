package com.mycompany.figurasgeometricas;

public class Circulo extends FiguraGeometrica { //Complejidad O(1)

    private double radio;

    public Circulo(String nombre, String color, double radio) {
        super(nombre, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double obtenerArea() {
        double areaCirculo = Math.PI * (radio * radio); 
        return areaCirculo; //Complejidad O(1)
    }

    @Override
    public double obtenerPerimetro() {
        double perimetroCirculo = 2 * Math.PI * radio;
        return perimetroCirculo; //Complejidad O(1)
    }

}
