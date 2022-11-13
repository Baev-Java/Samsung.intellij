public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            return;
        }
        this.numerator = numerator * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator);
        normalization();
    }

    public int getNumerator() { //возвращает числитель дроби
        return numerator;
    }

    public int getDenominator() {//возвращает знаменатель дроби
        return denominator;
    }

    public void setDenominator(int denominator) {//даёт возможность изменить знаменатель
        if (denominator == 0) {
            System.out.println("Denominator can`t be zero. Choose another one.");
            return;
        }
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) { //даёт возможность изменить знаменатель числитель
        this.numerator = denominator;
    }

    private int gcd(int numaerator, int denomirator) { //метод для нахождения наибольшего бщего делителя
        while (numerator != 0 && denomirator != 0) {
            if (numerator > denomirator) {
                numerator %= denomirator;
            } else {
                denominator %= numerator;
            }
        }
        return numerator + denomirator;
    }

    private void normalization() { //сокращение дроби
        int n = gcd(Math.abs(numerator), Math.abs(denominator));
    }

    public boolean properFraction() { //проверка правильности дроби
        return (Math.abs(numerator) < denominator ? true : false);
    }

    public int getIntegerPart() { //выделение целой части дрроби
        return (numerator / denominator);
    }

    public Fraction fractionalPart() { //выделение дробной части
        return new Fraction(numerator % denominator, denominator);
    }

    public double toDecimalFractions() { //результат деление в десятичной дроби
        return (double) numerator / denominator;
    }

    public String toString() { //вывод дроби на печать
        return new String(numerator + "/" + denominator);
    }

    public Fraction sumFractionTo(Fraction obj) {
        return new Fraction(this.numerator * obj.denominator + obj.numerator * this.denominator,
                this.denominator * obj.denominator);
    }

    public Fraction sumFraction(Fraction obj1, Fraction obj2) {
        return new Fraction(obj1.numerator * obj2.denominator + obj2.numerator * obj1.denominator,
                obj1.denominator * obj2.denominator);
    }

}
