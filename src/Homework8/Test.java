package Homework8;

public class Test {
    //int a1;
    //int b1;
    //int c1;

    static final double p = 3.14;
    static double r;

    public static double multiplication(double a2, double b2, double c2) {
        // int a1 = a2;
        //int b1 = b2;
        // int c1 = c2;
        double result = a2 * b2 * c2;
        System.out.println(result);
        return result;
    }
    public static void division(double a3, double b3) {
        double result = a3 % b3;
        System.out.println(result);
    }

    public double radius(double r1){
        r = r1;
        double s = p * r * r;
        return s;
    }

    public static double square(double r2){
        r = r2;
        double sq = 2 * p * r;
        return sq;
    }

    public void measure(double r3){
        r = r3;
        System.out.println("R =" + r + "S = " + (p * r * r) + "L = " + (2 * p * r));
    }

}

    class Test2 {
        public static void main(String[] args) {
            Test.multiplication(4,5,5);
            Test.division(123,23);

            Test t1 = new Test();
            t1.radius(56);
            t1.measure(56);
            Test.square(45);

            System.out.println(t1.radius(56));
            //System.out.println(t1.measure(56));
            System.out.println(Test.square(45));


        }
    }



