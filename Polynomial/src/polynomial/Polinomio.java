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
    
    private DoubleList <Term> polinomio;
    
    public Polinomio(){
        polinomio = new DoubleList<>();
        Term<X> unTerm = new Term(0,0);
        polinomio.addFirst(unTerm);
    }
    
    public Polinomio(int grado){
        polinomio = new DoubleList<>();
        
        int coeficiente = grado;
        for(int exponente = 0; exponente <= grado ; exponente++,coeficiente--){
            Term<X> nTerm = new Term(coeficiente, exponente);
            polinomio.addLast(nTerm);
        }
    }

    public DoubleList<Term> getPolinomio() {
        return polinomio;
    }

    public void setPolinomio(DoubleList<Term> polinomio) {
        this.polinomio = polinomio;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
