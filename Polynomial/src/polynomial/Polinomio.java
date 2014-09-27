/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polynomial;

/**
 *
 * @author matychp
 * @param <X>
 */
public class Polinomio <X extends Comparable>{
    
    private DoubleList<X> polinomio;
    
    public Polinomio(){
        polinomio = new DoubleList<>();
    }

    public DoubleList<X> getPolinomio() {
        return polinomio;
    }

    public void setPolinomio(DoubleList<X> polinomio) {
        this.polinomio = polinomio;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
