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
public class Polinomio {

    private DoubleList<Term> polinomio;

    public Polinomio() {
        polinomio = new DoubleList<>();
        Term<Integer> unTerm = new Term(0, 0);
        polinomio.addFirst(unTerm);
    }

    public Polinomio(int grado) {
        polinomio = new DoubleList<>();

        int coeficiente = grado;
        for (int exponente = 0; exponente <= grado; exponente++, coeficiente--) {
            Term<Integer> nTerm = new Term(coeficiente, exponente);
            polinomio.addLast(nTerm);
        }
    }

    public Polinomio(Integer coef[]) {
        polinomio = new DoubleList<>();

        for (int i = 0; i < coef.length; i++) {
            if (coef[i].compareTo(0) != 0) {
                Term<Integer> nTerm = new Term(coef[i], i);
                polinomio.addLast(nTerm);
            }
        }
    }

    public Polinomio add(Polinomio pol) {
        Polinomio sumaPol = new Polinomio();
        Polinomio auxPrimerPol = this;
        Polinomio auxSegundoPol = pol;
        Term a,b, sumaTerm;
        
        while(!auxPrimerPol.isEmpty() && !auxSegundoPol.isEmpty()){
            
        }
        return sumaPol;
    }

    public DoubleList<Term> getPolinomio() {
        return polinomio;
    }

    public void setPolinomio(DoubleList<Term> polinomio) {
        this.polinomio = polinomio;
    }

    public void clear() {
        this.polinomio.clear();
    }
    
    public int size(){
        return this.polinomio.size();
    }
    
    public boolean isEmpty(){
        return this.polinomio.isEmpty();
    }
    
    public Term removeFirst(){
        return polinomio.removeFirst();
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
