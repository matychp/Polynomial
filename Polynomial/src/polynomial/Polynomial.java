package polynomial;

import java.util.Iterator;

/**
 *
 * @author matychp
 */
public class Polynomial {

    private DoubleList<Term> polinomio;

    public Polynomial() {
        polinomio = new DoubleList<>();
        Term unTerm = new Term(0, 0);
        polinomio.addLast(unTerm);
    }

    public Polynomial(int grado) {
        polinomio = new DoubleList<>();

        for (int exponente = grado, coeficiente = grado; exponente > 0; exponente--, coeficiente--) {
            Term nTerm = new Term(coeficiente, exponente);
            polinomio.addLast(nTerm);
        }
    }

    public Polynomial(Integer coef[]) {
        polinomio = new DoubleList<>();

        for (int i = coef.length, pos = 0; i > 0; i--, pos++) {
            if (coef[0].compareTo(0) != 0) {
                Term nTerm = new Term(coef[pos], i);
                polinomio.addLast(nTerm);
            }
        }
    }

    public Polynomial suma(Polynomial pol) {
        Polynomial sumaPol = new Polynomial();
        sumaPol.clear();
        Term a = new Term(), b = new Term(), sumaTerm;

        Iterator<Term> itA = this.iterator();
        Iterator<Term> itB = pol.iterator();

        boolean hayAmbos = true;
        boolean avanzaA = true, avanzaB = true;
        while (hayAmbos) {
            if (itA.hasNext()) {
                if (itB.hasNext()) {
                    if (avanzaA) {
                        a = itA.next();
                    }
                    if (avanzaB) {
                        b = itB.next();
                    }
                    if (a.getExponente() == b.getExponente()) {
                        sumaTerm = a.suma(b);
                        sumaPol.polinomio.addLast(sumaTerm);
                        avanzaA = true;
                        avanzaB = true;
                    } else if (a.getExponente() > b.getExponente()) {
                        sumaPol.polinomio.addLast(a);
                        avanzaB = false;
                    } else {
                        sumaPol.polinomio.addLast(b);
                        avanzaA = false;
                    }
                } else {
                    a = itA.next();
                    sumaPol.polinomio.addLast(a);
                }
            } else {
                if (itB.hasNext()) {
                    b = itB.next();
                    sumaPol.polinomio.addLast(b);
                } else {
                    hayAmbos = false;
                }
            }
        }
        return sumaPol;
    }

    public void clear() {
        this.polinomio.clear();
    }

    public int size() {
        return this.polinomio.size();
    }

    public boolean isEmpty() {
        return this.polinomio.isEmpty();
    }

    public Term removeFirst() {
        return polinomio.removeFirst();
    }
    
    public Iterator iterator(){
        return this.polinomio.iterator();
    }
    
    public Iterator descendingIterator(){
        return this.polinomio.descendingIterator();
    }
    
    /**
     * Compara si dos polinomios (this y uno por parametro), son iguales.
     * Es decir, tienen la misma cantidad de terminos, y cada uno de ellos 
     * es de igual grado y coeficiente respecto al otro polinomio.
     * Se puede usar tanto el metodo compareTo() como equals() para determinar si dos terminos son iguales.
     * @param pol un polinomio a comparar si es igual a this.
     * @return true: si los polinomios son iguales, false: si son distintos.
     */
    public boolean equals(Polynomial pol){        
        if(this.size() != pol.size()){
            return false;
        }
        
        Iterator<Term> itThis = this.iterator();
        Iterator<Term> itPol = pol.iterator();        
        while(itThis.hasNext() || itPol.hasNext()){
            //if(itThis.next().compareTo(itPol.next()) != 0){
            if(!itThis.next().equals(itPol.next())){
                return false;
            }
        }        
        return true;
    }

    @Override
    public String toString() {
        String r = "";
        for (Term unTermino : this.polinomio) {
            r += unTermino.toString() + "\t";
        }
        return r;
    }
}
