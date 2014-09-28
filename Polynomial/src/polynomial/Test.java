/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial;

/**
 *
 * @author matychp
 */
public class Test {

    public static void main(String[] args) {
        Polinomio unPolinomioVacio = new Polinomio();
        System.out.println(unPolinomioVacio);
        
        Polinomio unPolinomio = new Polinomio(5);
        
        System.out.println(unPolinomio.toString());
        
        Integer unArreglo[] = {9,8,7,6,0,4,3,2,1};
        Polinomio unPolinomioPorArreglo = new Polinomio(unArreglo);
        System.out.println(unPolinomioPorArreglo);
    }
}
