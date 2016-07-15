package Exept;

/**
 * Created by SCIP on 15.07.2016.
 */
public class Methods {
    private void testNumber(int a, int b) throws Exception{
        if (a < 0 && b < 0) throw new IllegalArgumentException("a < 0 && b < 0");
        if (a == 0 && b != 0) throw new ArithmeticException("a == 0 && b != 0");
        if (a != 0 && b == 0) throw new ArithmeticException("a != 0 && b == 0");
        if (a == 0 && b == 0) throw new IllegalAccessException("a == 0 && b == 0");
        if (a > 0 && b > 0) throw new MyException("a > 0 && b > 0");
    }

    public int add(int a, int b){
        try {
            testNumber(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a + b;
    }

    public int minus(int a, int b){
        try {
            testNumber(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a - b;
    }

    public int divide(int a, int b){
        try {
            testNumber(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a/b;
    }

    public int multiply(int a, int b){
        try {
            testNumber(a, b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a*b;
    }
}
