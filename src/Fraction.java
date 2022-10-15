public class Fraction {

    int numerator;
    int denominator;

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Fraction) {
            if (numerator * ((Fraction) obj).denominator == denominator * ((Fraction) obj).numerator) {
                return true;
            }
        }

        return false;
    }

    static int gcd(int a, int b) {
        int i;
        if (a < b) {
            i = a;
        } else {
            i = b;
        }
        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

   //შეკვეცა
    static String truncated(Fraction a) {
        if (gcd(a.numerator, a.denominator) > 1) {
            return (a.numerator / gcd(a.numerator,a.denominator)) + "/" + (a.denominator / gcd(a.numerator,a.denominator));
        }
        return a.numerator + "/" + a.denominator;
    }

    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

//  ჯამი და იგი
    static String sum(Fraction a, Fraction b) {
        int num;
        int den;
        if (a.denominator == b.denominator) {
            num = a.numerator + b.numerator;
            den = a.denominator;
        } else {
            den = lcm(a.denominator, b.denominator);
            num = (lcm(a.denominator, b.denominator)/a.denominator * a.numerator) + (lcm(a.denominator, b.denominator)/b.denominator * b.numerator);
        }
        return num + "/" + den;
    }

// აგი ნამრავლი
    static String prod(Fraction a, Fraction b) {
        int num;
        int den;
        num = a.numerator * b.numerator;
        den = a.denominator * b.denominator;
        return num + "/" + den;
    }

}
