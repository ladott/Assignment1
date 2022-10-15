public class Main {

    static double discriminant(double a, double b, double c) {
        double d;
        d = Math.pow(b, 2) - 4 * (a * c);
        return d;
    }


    static String smallString(String[] stringArray){
        String arg = stringArray[0];
        for (int i = 0; i < stringArray.length; i++) {
            if(arg.length() > stringArray[i].length()) {
                arg = stringArray[i];
            }
        }
        return arg;
    }

    public static void main(String[] args) {
        System.out.println(discriminant(4, 5,3));
        String[] strArr = {"BMW", "Volvo", "Mercedes", "Porsche"};
        System.out.println(smallString(strArr));

        Fraction frac = new Fraction();
        Fraction frac_2 = new Fraction();
        frac.numerator = 9;
        frac.denominator = 10;
        frac_2.numerator = 1;
        frac_2.denominator = 6;
        System.out.println(frac);
        System.out.println(Fraction.truncated(frac));
        System.out.println(Fraction.sum(frac_2, frac));
        System.out.println(Fraction.prod(frac_2, frac));
    }
}