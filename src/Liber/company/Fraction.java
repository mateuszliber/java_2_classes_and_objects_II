package Liber.company;

class Fraction
{
    int nominator;
    int denominator;

    Fraction(int nominator, int denominator)
    {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public String toString()
    {
        return "("+nominator+"/"+denominator+")";
    }

    /** Metoda szukająca Największy współny dzielnik */
    int Nwd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    /** Metoda wyświetla ułamek zwykły na liczbę dziesiętną zmiennoprzecinkową */
    double decimal()
    {
        double x = (double)nominator;
        //double denomnator = this.denominator;
        return x/denominator;
    }

    /** Metoda zwraca obiekt który jest sumą dwóch innych ułamków */
    Fraction addFraction(Fraction added)
    {
        int newNominator = ((this.nominator*added.denominator) + (added.nominator*this.denominator));
        int newDenominator = this.denominator * added.denominator;
        return new Fraction(newNominator, newDenominator);
    }

    /** Metoda zwraca obiekt który jest różnicą dwóch innych ułamków */
    Fraction substructFraction(Fraction substructe)
    {
        int newNominator = ((this.nominator*substructe.denominator) - (substructe.nominator*this.denominator));
        int newDenominator = this.denominator * substructe.denominator;
        return new Fraction(newNominator, newDenominator);
    }

    /** Metoda zwraca obiekt który jest mnożeniem dwóch innych ułamków */
    Fraction multiplyFraction(Fraction multiplyed)
    {
        int newNominator = this.nominator * multiplyed.nominator;
        int newDenominator = this.denominator * multiplyed.denominator;
        return new Fraction(newNominator, newDenominator);
    }

    /** Metoda odwraca ułamek w danym obiekcie */
    void reverseFraction()
    {
        int tempNominator = this.nominator;
        this.nominator = this.denominator;
        this.denominator = tempNominator;

    }

    /** Metoda skraca ułamek w danym obiekcie */
    void reduceFraction()
    {
        int newNominator = this.nominator/Nwd(this.nominator, this.denominator);
        int newDenominator = this.denominator/Nwd(this.nominator, this.denominator);

        this.nominator = newNominator;
        this.denominator = newDenominator;
    }

}