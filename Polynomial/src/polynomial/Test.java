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
        
        //Ingreso de un polinomio sin parametros.
        Polynomial unPolinomioVacio = new Polynomial();
        System.out.println(unPolinomioVacio);
        
        //Ingreso de un polinomio por teclado. Constructor que toma un String.
        System.out.print("Ingrese un numero por teclado: ");
        int n = in.nextInt();
        Polynomial unPolinomioNPorTeclado = new Polynomial(n);        
        System.out.println(unPolinomioNPorTeclado.toString());
        
        //Ingreso de un polinomio por teclado. Constructor que toma un arreglo unidimensional.
        Integer unArreglo[] = {9,8,7,6,0,4,3,2,1};
        Polynomial unPolinomioPorArreglo = new Polynomial(unArreglo);
        System.out.println(unPolinomioPorArreglo);
       
        //Ingreso de dos polinomios por teclado a sumarse.
        System.out.print("Ingrese un numero a sumar: ");
        int sumA = in.nextInt();
        Polynomial psumA = new Polynomial(sumA);
        System.out.print("Ingrese un numero a sumar: ");
        int sumB = in.nextInt();
        Polynomial psumB = new Polynomial(sumB);
        System.out.println("Suma: " + psumA.suma(psumB).toString());
                
        //Ingreso de dos polinomios por teclado a determinar si son o no iguales. 
        System.out.print("Ingrese un numero a comparar: ");
        int compA = in.nextInt();
        Polynomial pcompA = new Polynomial(compA);
        System.out.print("Ingrese un numero a comparar: ");
        int compB = in.nextInt();
        Polynomial pcompB = new Polynomial(compB);
        System.out.println("Son iguales?: " + pcompA.equals(pcompB));
    }
}
