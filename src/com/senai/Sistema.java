package com.senai;

import java.util.*;

public class Sistema {

    int resposta;

    public static void main(String[] args) {
        Sistema system = new Sistema();
        system.decisaoResp();
    }

    public void decisaoResp() {
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        do {
            System.out.println("\nESCOLHA UMA OPÇÃO: \n 1 - RETÂNGULO \n 2 - CIRCULO \n 3 - QUADRADO \n 0 - SAIR");
            resposta = scanner.nextInt();
            switch (resposta) {
                case 1:
                    retangulo.digitarRetangulo();
                    break;
                case 2:
                    circulo.digitarCirculo();
                    break;
                case 3:
                    quadrado.digitarQuadrado();
                case 0:
                    break;
                default:
                    System.out.println("");
            }
        }while (resposta != 0) ;
        System.out.print("\nCONSULTA FINALIZADA !");
    }
}

