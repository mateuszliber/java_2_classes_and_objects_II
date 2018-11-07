package Liber.company;

class Complex
{
    int real;
    int complex;

    Complex(int real, int complex)
    {
        this.real = real;
        this.complex = complex;
    }

    public String toString()
    {
        return " "+real+" + "+complex+"i ";
    }

    /** Metoda towrzy nowy obiekt będący sumą dwóch poprzednich */
    Complex addComplex(Complex added)
    {
        int real = this.real + added.real;
        int complex = this.complex + added.complex;
        return new Complex(real, complex);
    }

    /** Metoda towrzy nowy obiekt będący różnicą dwóch poprzednich */
    Complex subbComplex(Complex subbed)
    {
        int real = this.real - subbed.real;
        int complex = this.complex - subbed.complex;
        return new Complex(real, complex);
    }

    /** Metoda towrzy nowy obiekt będący wynkiem mnożenia dwóch poprzednich */
    Complex multiplyComplex(Complex multiplyed)
    {
        int newReal = ((this.real*multiplyed.real) + (-(this.complex+multiplyed.complex)));
        int newComplex = ((this.real*multiplyed.complex)+(multiplyed.real*this.complex));
        return new Complex(newReal, newComplex);
    }

}