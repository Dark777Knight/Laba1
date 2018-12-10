public class Polynomial {
    private FractionSet SetFract;
    private int size;

    Polynomial(FractionSet _SetFract) {
        size = _SetFract.returnSize();
        SetFract = new FractionSet();
        SetFract.assignmentSet(_SetFract);
    }

    Polynomial() {
        SetFract = new FractionSet();
    }

    void summPolinoms(Polynomial addend1, Polynomial addend2) {
        int sizeLarge, sizeSmall, flag;
        if (addend1.returnSize() < addend2.returnSize()) {
            sizeLarge = addend2.returnSize();
            sizeSmall = addend1.returnSize();
            flag = 1;
        } else {
            sizeSmall = addend2.returnSize();
            sizeLarge = addend1.returnSize();
            flag = 2;
        }
        size = sizeLarge;
        SetFract.FractionSetChange(size);
        for (int i = sizeLarge - 1; i > sizeLarge - sizeSmall - 1; i--) {
            if (flag == 2) {
                SetFract.summationSet(addend1.returnFraction(i), addend2.returnFraction(i - (sizeLarge - sizeSmall)), i);
            } else {
                SetFract.summationSet(addend1.returnFraction(sizeLarge - sizeSmall), addend2.returnFraction(i), i);
            }
            System.out.print(SetFract.returnFraction(i));
            System.out.println("    " + i);
        }
        System.out.println("");
        for (int i = 0; i < SetFract.returnSize(); i++) {
            System.out.print(SetFract.returnFraction(i));
            System.out.println("    " + i);
        }
        for (int i = 0; i < sizeLarge - sizeSmall; i++) {
            if (flag == 1) {
                SetFract.assignmentFraction(addend2.returnFraction(i), i);
            } else {
                SetFract.assignmentFraction(addend1.returnFraction(i), i);
            }
        }
    }

    public String toString() {
        String SetFractString = new String();
        String FractionName1 = "Fraction: ";
        String FractionName2 = "\\*x\\^0";
        String FractionName3 = "\\^1";
        for (int i = 0; i < SetFract.returnSize(); i++) {
            SetFractString = SetFractString + (SetFract.returnFraction(i).toString().replaceAll(FractionName1,
                    "") + "*x^" + (size - i - 1));
            if (i != SetFract.returnSize() - 1) {
                SetFractString = SetFractString + " + ";
            }
        }
        SetFractString = SetFractString.replaceAll(FractionName2, "");
        SetFractString = SetFractString.replaceAll(FractionName3, "");
        return "Polinomial: " + SetFractString;
    }

    public int returnSize() {
        return SetFract.returnSize();
    }

    public Fraction returnFraction(int i) {
        return SetFract.returnFraction(i);
    }

    public void FractionSetChange(int size) {
        SetFract.FractionSetChange(size);
    }
}
