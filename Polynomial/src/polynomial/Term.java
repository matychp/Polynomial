package polynomial;

/**
 *
 * @author matychp
 */
public class Term implements Comparable{

    private int exponente;
    private int coeficiente;

    public Term() {
    }
    
    public Term(int unCoeficiente, int unExponente){
        this.exponente = unExponente;
        this.coeficiente = unCoeficiente;
    }

    public int getCoeficiente() {
        return this.coeficiente;
    }

    public int getExponente() {
        return this.exponente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }
    
    public Term suma(Term t){
        return new Term(this.coeficiente + t.getCoeficiente(), this.exponente);
    }

    @Override
    public String toString() {
        return this.coeficiente + "x^" + this.exponente;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
