public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n) {
        numerator = n;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public Fraction(Fraction other) {
        numerator = other.getNumerator();
        denominator = other.getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(int m) {
        int n = numerator + m * denominator;
        Fraction sum = new Fraction(n, denominator);
        return sum;
    }

    public Fraction add(Fraction other) {
        int commonDenominator = denominator * other.getDenominator();
        int sumNumerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
        Fraction sum = new Fraction(sumNumerator, commonDenominator);
        return sum;
    }

    private int gcf(int num1, int num2) {
        int smallest;
        if (num1 <= num2) {
            smallest = num1;
        } else {
            smallest = num2;
        }
        for (int i = smallest; i > 0; i--) {// the loop will eventually go down to 1;
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return -1;
    }

    public double getValue() {
        return (double) numerator / denominator;
    }

    public Fraction multiply(int m) {
        int n = numerator * m;
        Fraction product = new Fraction(n, denominator);
        return product;
    }

    public Fraction multiply(Fraction other) {
        Fraction product = new Fraction(numerator * other.getNumerator(), denominator * other.getDenominator());
        return product;
    }

    public void reduce() {
        numerator /= gcf(numerator, denominator);
        denominator /= gcf(numerator, denominator);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}