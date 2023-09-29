public class Formulas {


    public static OrderedPair findQuadraticRoots (double a, double b, double c) {
        double answerOne = (-b + Math.sqrt(Math.pow(b, 2) - (4*a*c)))/2*a;
        double answerTwo = (-b - Math.sqrt(Math.pow(b, 2) - (4*a*c)))/2*a;

        OrderedPair pair = new OrderedPair(answerOne, answerTwo);

        return pair;

    }

    public static double findSlope(OrderedPair A, OrderedPair B) {
        double slope = (B.getY()-A.getY())/(B.getX()-A.getX());


        return slope;

    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B) {
        double x;
        double y;

        x = (A.getX()+B.getX())/2;
        y = (A.getY()+B.getY())/2;

        OrderedPair pair = new OrderedPair(x, y);


        return pair;
    }

    public static double findArithmeticSeriesSum (double a, double d, int k) {
        double sum = (k/2.0) * (2*a + d*(k - 1));

        return sum;
    }

    public static double findGeometricSeriesSum (double a, double r, int k) {
        double sum = a * ((1-Math.pow(r, k))/(1-r));

        return sum;
    }

    public static int rollDie (int sides) {
        int num = (int) (Math.random()*sides) + 1;

        return num;
    }







}
