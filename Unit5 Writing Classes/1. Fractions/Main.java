class Main {
    public static void testConstructors() {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(7);
        Fraction f3 = new Fraction(12, -20);
        Fraction f4 = new Fraction(f3);

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println();
    }

    public static void testArithmetic() {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(3, 4);
        int addNum = 7;
        int mulNum = 6;

        Fraction sum1 = f1.add(addNum);
        System.out.println(f1 + " + " + addNum + " = " + sum1);
        Fraction sum2 = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + sum2);

        Fraction product1 = f2.multiply(mulNum);
        System.out.println(f2 + " * " + mulNum + " = " + product1);
        Fraction product2 = f1.multiply(f2);
        System.out.println(f1 + " * " + f2 + " = " + product2);

        System.out.println();
    }

    public static void testValues() {
        Fraction f = new Fraction(2, 3);
        System.out.println(f + " = " + f.getValue());
        System.out.println();
    }

    public static void main(String[] args) {
        testConstructors();
        testArithmetic();
        testValues();
    }
}
