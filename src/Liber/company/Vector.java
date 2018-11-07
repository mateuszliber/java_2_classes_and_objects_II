package Liber.company;

class Vector
{
    double xa, ya, za;

    double xb, yb, zb;

    Vector(double xa, double ya, double za, double xb, double yb, double zb)
    {
        this.xa = xa;
        this.ya = ya;
        this.za = za;

        this.xb = xb;
        this.yb = yb;
        this.zb = zb;
    }

    public String toString()
    {
        return "A:("+xa+", "+ya+", "+za+"), B:("+xb+", "+yb+", "+zb+")";
    }

    /** Metoda towrzy nowy obiekt będący sumą dwóch poprzednich */
    Vector addVector(Vector added)
    {
       //double new_xp = this.xp + added.xp;
       // double new_yp = this.yp + added.yp;
        //double new_zp = this.zp + added.zp;
        //return new Complex(xp, yp, zp);
        return new Vector(1,2,3,4,5,6);
    }

    /** Metoda zwraca długość wielomianu */
   //double length()
    //{
    //    return new Complex(xp, yp, zp);
    //}
}