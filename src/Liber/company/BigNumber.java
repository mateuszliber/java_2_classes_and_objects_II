package Liber.company;

public class BigNumber {

    int bigNumber;

    BigNumber (int bigNumber){
        this.bigNumber = bigNumber;
    }

    /** Metoda sprawdza czy podana liczba jest dzielnikiem bigNumber */
    boolean isDivisible(int divisor){
        if((this.bigNumber % divisor)==0){
            return true;
        } else return false;
    }

    /** Metoda sprawdza czy podana liczba jest liczbą pierwszą */
    boolean isFirst(){
        double bigRoot = Math.sqrt((double)(this.bigNumber));
        for(int i = 2; i<=Math.sqrt((int)(bigRoot)); i++){
            if((this.bigNumber%i)==0){
                return false;
            }
        }
        return true;
    }

}
