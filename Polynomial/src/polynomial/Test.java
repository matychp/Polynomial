/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial;

import java.util.Scanner;

/**
 *
 * @author matychp
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        Polynomial unPolinomioVacio = new Polynomial();
        System.out.println(unPolinomioVacio);
        
        System.out.println("Ingrese un numero por teclado: ");
        int n = in.nextInt();
        Polynomial unPolinomioNPorTeclado = new Polynomial(n);        
        System.out.println(unPolinomioNPorTeclado.toString());
        
        Integer unArreglo[] = {9,8,7,6,0,4,3,2,1};
        Polynomial unPolinomioPorArreglo = new Polynomial(unArreglo);
        System.out.println(unPolinomioPorArreglo);
        
        System.out.println("Ingrese un numero a sumar: ");
        int numA = in.nextInt();
        Polynomial pA = new Polynomial(numA);
        System.out.println("Ingrese un numero a sumar: ");
        int numB = in.nextInt();
        Polynomial pB = new Polynomial(numB);
        System.out.println("Suma: " + pA.suma(pB).toString());
    }
}
