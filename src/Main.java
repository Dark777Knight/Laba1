public class Main {
    public static void main(String args[]) {
        Fraction Fraction1 = new Fraction(12, 3);
        Fraction Fraction2 = new Fraction(1, 6);
        System.out.println(Fraction2.toString());                       //Fraction.class
        Fraction Fraction3 = new Fraction(1, 6);
        Fraction Fraction4 = new Fraction(5, 6);
        Fraction Fraction5 = new Fraction(1, 7);
        Fraction Fraction6 = new Fraction(12, 13);
        Fraction Fraction7 = new Fraction(3, 7);
        Fraction Fraction8 = new Fraction(4, 7);
        FractionSet Set1 = new FractionSet(Fraction1, Fraction2, Fraction3);
        Set1.maxFraction();
        Set1.minFraction();
        Set1.QuantityMore(Fraction2);
        Set1.QuantityLess(Fraction2);
        Set1.AddFraction(Fraction8);
        System.out.println(Set1.toString());                            //FractionSet.class
        FractionSet Set2 = new FractionSet(Fraction4, Fraction5, Fraction6, Fraction7, Fraction8);
        Polynomial Polinomial1 = new Polynomial(Set1);
        Polynomial Polinomial2 = new Polynomial(Set2);
        Polynomial Polinomial3 = new Polynomial();
        Polinomial3.summPolinoms(Polinomial1, Polinomial2);
        System.out.println(Polinomial3.toString());                     //Polynomial.class
    }
}
