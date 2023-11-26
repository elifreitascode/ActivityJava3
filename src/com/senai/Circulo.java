package com.senai;

import java.util.Scanner;

public class Circulo {

    float raio;
    final float pi = (float) Math.PI;
    float diametro;
    float perimetroC;
    float areaC;


    public float  calcularPCirculo(float diametro){
        this.raio = diametro / 2;
        perimetroC = (2*pi) * this.raio;
        return perimetroC;
    }

    public float calcularACirculo(float diametro){
        this.raio = diametro / 2;
        areaC = (float) (pi * Math.pow(this.raio,2));
        return areaC;
    }

    public void digitarCirculo(){
        Scanner scanner = new Scanner(System.in);
        Circulo circ = new Circulo();
        System.out.println("-=-=-= CIRCULO =-=-=-=-");
        System.out.print("DIAMETRO: ");
        diametro = scanner.nextFloat();
        System.out.println("-----------------------");
        System.out.println("PERIMETRO: " + circ.calcularPCirculo(diametro));
        System.out.println("AREA: " + circ.calcularACirculo(diametro));
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-");
    }
}