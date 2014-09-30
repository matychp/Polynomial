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

    /**
     * Suma dos terminosy devuelve la suma como un nuevo Term.
     * @param t el Term a sumar contra this.
     * @return la suma del objeto this y el parametro t.
     */
    public Term suma(Term t) {
        if (this.exponente == t.getExponente()) {
            return new Term(this.coeficiente + t.getCoeficiente(), this.exponente);
        }
        else{
            return null;
        }
    }

    /**
     * Retorna el coeficiente y el exponente de un termino.
     * @return coeficiente y exponente de this.
     */
    @Override
    public String toString() {
        return this.coeficiente + "x^" + this.exponente;
    }

    /**
     * Compara dos objetos, devuelve 0 si son iguales (es decir, mismo exponente y mismo coeficiente),
     * devuelve un numero > 0 si el Term this es mayor en exponente, o en el caso de que ambos sean de igual exponente
     * puede devolver > 0 si el Term this es mayor porque su coeficiente es mayor.
     * Caso contrario si el objeto t que ingresa como parametro es mayor (ya sea por su exponente, o coeficiente), se devuelve
     * un numero negativo.
     * @param t el Term que ingresa para ser evaluado contra el Term this.
     * @return = 0 si son iguales, > 0 si this es mayor o < 0 si el parametro t es mayor.
     */
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

    /**
     * Devuelve true si ambos objetos tienen el mismo exponente y mismo coeficiente.
     * @param t un Term a comparar contra this.
     * @return true: si son iguales, false: si son distintos.
     */
    @Override
    public boolean equals(Object t) {
        Term aux = (Term)t;
        return this.exponente == aux.getExponente() && this.coeficiente == aux.getCoeficiente();
    }
}
