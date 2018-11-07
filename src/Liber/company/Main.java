package Liber.company;

import Liber.company.Complex;

public class Main {
    public static void main(String[] args) {
        /** Operacja na wielomianie kwadratowym */
        Polynomial wielomian1 = new Polynomial(2, 4, -4);
        Polynomial wielomian2 = new Polynomial(1, 2, 3);
        Polynomial wielomian3 = new Polynomial(1, 2, 4);

        System.out.println("Wielomian 1: "+wielomian1);
        Polynomial wielomianAdd = wielomian1.addPolynomial(wielomian2);
        System.out.println("Wynik dodawania wielomianów: "+wielomianAdd);

        Polynomial wielomianSubb = wielomian1.subbPolynomial(wielomian3);
        System.out.println("Wynik odejmowanie wielomianów: "+wielomianAdd);

        String wielomianMultiple = wielomian1.multiplePolynomial(wielomian3);
        System.out.println("Wynik mnożenia: "+wielomianMultiple);

        String miejscaZerowe = wielomian1.polynominalZeros();
        System.out.println("Miejsca zerowe wielomianu: "+miejscaZerowe);

        System.out.println("");
        /** Operacja na ułamkach */
        Fraction obj1, obj2;
        obj1 = new Fraction(28, 48);
        obj2 = new Fraction(3, 7);

        System.out.println("Ułamek 1: "+obj1);
        System.out.println("Ułamek 2: "+obj2);

        double obj1Decimal = obj1.decimal();
        System.out.println("Ułamek 1 dziesiętnie: "+obj1Decimal);

        Fraction obj3 = obj1.addFraction(obj2);
        System.out.println("Wynik dodawania: "+obj3);

        Fraction obj4 = obj1.substructFraction(obj2);
        System.out.println("Wynik odejmowania: "+obj4);

        Fraction obj5 = obj1.multiplyFraction(obj2);
        System.out.println("Wynik mnożenia: "+obj5);

        obj1.reduceFraction();
        System.out.println("Ułamek 1 po skróceniu: "+obj1);

        obj1.reverseFraction();
        System.out.println("Ułamek 1 po obróceniu: "+obj1);
        System.out.println("");

        /** Operacja na Zespolonych */
        Complex zespolon1, zespolon2;
        zespolon1 = new Complex(5, 10);
        zespolon2 = new Complex(2, 3);

        System.out.println("Zesp1: "+zespolon1);
        System.out.println("Zesp2: "+zespolon2);

        Complex zespolon3 = zespolon1.addComplex(zespolon2);
        System.out.println("Wynik dodawania: "+zespolon3);

        Complex zespolon4 = zespolon1.subbComplex(zespolon2);
        System.out.println("Wynik odejmowania: "+zespolon4);

        Complex zespolon5 = zespolon1.multiplyComplex(zespolon2);
        System.out.println("Wynik mnożenia: "+zespolon5);
        System.out.println("");

        /** BigNumber */
        BigNumber liczba1;
        liczba1 = new BigNumber(3389);
        System.out.println("Czy podzielna prze 4: "+liczba1.isDivisible(4));
        System.out.println("Czy podzielna prze 3: "+liczba1.isDivisible(3));
        System.out.println("Czy pierwsza: "+liczba1.isFirst());
    }
}
