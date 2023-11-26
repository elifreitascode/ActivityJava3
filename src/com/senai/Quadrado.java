package com.senai;

import java.util.Scanner;

public class Quadrado extends Retangulo{

    public float calcularPQuadrado(float base){
        this.base = base;
        perimetro = 4*base;
        return perimetro;
    }

    public float calcularAQuadrado(float base){
        this.base = base;
        area = base*base;
        return area;
    }

    public void digitarQuadrado(){
        Scanner scanner = new Scanner(System.in);
        Quadrado quad = new Quadrado();
        System.out.println("-=-=-= QUADRADO =-=-=-");
        System.out.print("BASE: ");
        base = scanner.nextFloat();
        System.out.println("-----------------------");
        System.out.print("PERIMETRO: " + quad.calcularPQuadrado(base));
        System.out.print("\nAREA: " + quad.calcularAQuadrado(base));
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-");
    }
}