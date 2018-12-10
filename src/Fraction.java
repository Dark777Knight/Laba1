public class Fraction {
    private int numerator, denominator;

    Fraction(int _numerator, int _denominator) {
        numerator = _numerator;
        denominator = _denominator;
    }

    Fraction() {
    }

    Fraction(int k) {
        numerator = k;
        denominator = k;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {

        return denominator;
    }

    public void Summation(Fraction addend1, Fraction addend2) {
        if (addend1.getDenominator() == addend2.getDenominator()) {
            numerator = addend1.getNumerator() + addend2.getNumerator();
            denominator = addend1.getDenominator();
        } else {
            numerator = addend1.getNumerator() * addend2.getDenominator()
                    + addend2.getNumerator() * addend1.getDenominator();
            denominator = addend1.getDenominator() * addend2.getDenominator();
        }
        int GCM = numerator, helperGCM = denominator;//GCM - greatest common multiple
        while (helperGCM != 0)
            helperGCM = GCM % (GCM = helperGCM);
        GCM = Math.abs(GCM);
        numerator = numerator / GCM;
        denominator = denominator / GCM;
    }

    public void Assignment(Fraction assignable) {
        numerator = assignable.getNumerator();
        denominator = assignable.getDenominator();
    }

    public char Сomparison(Fraction compared) {
        if ((numerator == compared.getNumerator()) & (denominator == compared.getDenominator())) {
            return '=';
        } else if ((numerator * compared.getDenominator()) > (compared.getNumerator() * denominator)) {
            return '>';
        } else return '<';
    }

    public String toString() {
        return "Fraction: " + numerator + "/" + denominator;
    }
}
