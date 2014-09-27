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
public class Term<X extends Comparable> implements Comparable{

    private int exponente;
    private X coeficiente;

    public Term() {
    }
    
    public Term(X unCoeficiente, int unExponente){
        this.exponente = unExponente;
        this.coeficiente = unCoeficiente;
    }

    public X getCoeficiente() {
        return this.coeficiente;
    }

    public int getExponente() {
        return this.exponente;
    }

    public void setCoeficiente(X coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
