import java.util.ArrayList;

public class FractionSet {
    private ArrayList<Fraction> FractSet = new ArrayList<>();

    FractionSet(Fraction... FractionsForASet) {
        for (int i = 0; i < FractionsForASet.length; i++) {
            FractSet.add(FractionsForASet[i]);
        }
    }

    FractionSet() {
    }

    public void maxFraction() {
        System.out.print("Max fraction in a set: ");
        Fraction MaxFraction = new Fraction();
        MaxFraction.Assignment(FractSet.get(0));
        for (int i = 1; i < FractSet.size(); i++) {
            if (MaxFraction.Сomparison(FractSet.get(i)) == '<') {
                MaxFraction.Assignment(FractSet.get(i));
            }
        }
        System.out.println(MaxFraction.toString());
    }

    public void minFraction() {
        System.out.print("Min fraction in a set: ");
        Fraction MinFraction = new Fraction();
        MinFraction.Assignment(FractSet.get(0));
        for (int i = 1; i < FractSet.size(); i++) {
            if (MinFraction.Сomparison(FractSet.get(i)) == '>') {
                MinFraction.Assignment(FractSet.get(i));
            }
        }
        System.out.println(MinFraction.toString());
    }

    public void QuantityMore(Fraction compared) {
        System.out.print("The number of fractions is greater than this: ");
        int amount = 0;
        for (int i = 0; i < FractSet.size(); i++) {
            if (FractSet.get(i).Сomparison(compared) == '>') {
                amount++;
            }
        }
        System.out.println(amount);
    }

    public void QuantityLess(Fraction compared) {
        System.out.print("The number of fractions is less than this: ");
        int amount = 0;
        for (int i = 0; i < FractSet.size(); i++) {
            if (FractSet.get(i).Сomparison(compared) == '<') {
                amount++;
            }
        }
        System.out.println(amount);
    }

    public void AddFraction(Fraction added) {
        FractSet.add(added);
    }

    public String toString() {
        String FractionSetString = new String();
        String FractionName = "Fraction: ";
        for (int i = 0; i < FractSet.size(); i++) {
            FractionSetString = FractionSetString + FractSet.get(i).toString().replaceAll(FractionName, "");
            if (i != FractSet.size() - 1) {
                FractionSetString = FractionSetString + ", ";
            }
        }
        return "FractionSet: " + FractionSetString;
    }

    public int returnSize() {
        return FractSet.size();
    }

    public Fraction returnFraction(int i) {
        return FractSet.get(i);
    }

    public void assignmentSet(FractionSet assignable) {
        for (int i = 0; i < assignable.returnSize(); i++) {
            FractSet.add(i, assignable.returnFraction(i));
        }
    }

    public void summationSet(Fraction addend1, Fraction addend2, int i) {
        FractSet.get(i).Summation(addend1, addend2);
    }

    public void assignmentFraction(Fraction assignable, int i) {
        FractSet.set(i, assignable);
    }

    public void FractionSetChange(int size) {
        Fraction FractionAdded = new Fraction(0);
        for (int i = 0; i < size; i++) {
            FractSet.add(FractionAdded);
        }
    }
}

