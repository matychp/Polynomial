package polynomial;

/**
 *
 * @author matychp
 */
public class Term implements Comparable {

    private int exponente;
    private int coeficiente;

    public Term() {
    }

    public Term(int unCoeficiente, int unExponente) {
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

    public Term suma(Term t) {
        if (this.exponente == t.getExponente()) {
            return new Term(this.coeficiente + t.getCoeficiente(), this.exponente);
        }
        else{
            return null;
        }
    }

    @Override
    public String toString() {
        return this.coeficiente + "x^" + this.exponente;
    }

    @Override
    public int compareTo(Object t) {
        Term aux = (Term)t;
        if(this.exponente == aux.getExponente()){
            return this.coeficiente - aux.getCoeficiente();
        }
        else{
            return this.exponente - aux.getExponente();
        }
    }

    @Override
    public boolean equals(Object t) {
        Term aux = (Term)t;
        return this.exponente == aux.getExponente() && this.coeficiente == aux.getCoeficiente();
    }
}
