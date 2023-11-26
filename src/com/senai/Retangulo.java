package com.senai;

import java.util.Scanner;

public class Retangulo {

    protected float base;
    protected float altura;
    public float perimetro;
    public float area;


    public float calcularPRetangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
        perimetro = ((2*base) + (2*altura));
        return perimetro;
    }

    public float calcularARetangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        area = base*altura;
        return area;
    }

    public void digitarRetangulo(){
        Scanner scanner = new Scanner(System.in);
        Retangulo ret = new Retangulo();
        System.out.println("-=-=-= RETÂNGULO =-=-=-");
        System.out.print("BASE: ");
        base = scanner.nextFloat();
        System.out.print("ALTURA: ");
        altura = scanner.nextFloat();
        System.out.println("-----------------------");
        System.out.print("PERIMETRO: " + ret.calcularPRetangulo(base,altura));
        System.out.print("\nAREA: " + ret.calcularARetangulo(base,altura));
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-");

    }

}
