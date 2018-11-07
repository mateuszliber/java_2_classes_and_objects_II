package Liber.company;

class Polynomial {

    int secoundDegree;
    int firstDegree;
    int zeroDegree;

    Polynomial(int secoundDegree, int firstDegree, int zeroDegree)
    {
        this.secoundDegree = secoundDegree;
        this.firstDegree = firstDegree;
        this.zeroDegree = zeroDegree;
    }

    Polynomial addPolynomial(Polynomial other){
        /** Metoda dodaje wielomiany do siebie */
        int newSecoundDegree = this.secoundDegree + other.secoundDegree;
        int newFirstDegree = this.firstDegree + other.firstDegree;
        int newZeroDegree = this.zeroDegree + other.zeroDegree ;
        return new Polynomial(newSecoundDegree, newFirstDegree, newZeroDegree);
    }

    Polynomial subbPolynomial(Polynomial other){
        /** Metoda odejmuje wielomiany do siebie */
        int newSecoundDegree = this.secoundDegree - other.secoundDegree;
        int newFirstDegree = this.firstDegree - other.firstDegree;
        int newZeroDegree = this.zeroDegree - other.zeroDegree ;
        return new Polynomial(newSecoundDegree, newFirstDegree, newZeroDegree);
    }

    String multiplePolynomial(Polynomial other){
        /** Metoda mnoży wielomiany kwadratowe i zwraca wynik w postaci stringa*/

        int newFourthDegree = this.secoundDegree * other.secoundDegree;
        int newThirdDegree = (this.secoundDegree*other.firstDegree)+(this.firstDegree*other.secoundDegree);
        int newSecoundDegree = (this.secoundDegree*other.zeroDegree)+(this.zeroDegree*other.secoundDegree)+(this.firstDegree*other.firstDegree);
        int newFirstDegree = (this.firstDegree*other.zeroDegree)+(this.zeroDegree*other.firstDegree);
        int newZeroDegree = this.zeroDegree*other.zeroDegree;

        return " ("+newFourthDegree+")^4x + ("+newThirdDegree+")^3x + ("+newSecoundDegree+")^2x + ("+newFirstDegree+")x + ("+newZeroDegree+") ";
    }

    String polynominalZeros(){
        /** Metoda wyznacza miejsca zerowe wielomianu*/
        double delta = (this.firstDegree*this.firstDegree)-(4*this.secoundDegree*this.zeroDegree);
        double a = this.firstDegree;

        if(delta>0) {
            double x1 =  (((-a) + Math.sqrt(delta)) / (2*this.secoundDegree));
            double x2 =  (((-a) - Math.sqrt(delta)) / (2*this.secoundDegree));
            return "x1: " + x1 + " x2: " + x2;
        } else if(delta==0){
            double x = ((-a)/(2*this.secoundDegree));
            return "x: "+x;
        } else {return "Brak miejsc zerowych";}
    }

    public String toString()
    {
        return " ("+secoundDegree+")^2x + ("+firstDegree+")x + ("+zeroDegree+") ";
    }

}
