package khan.riaz.mohammed;

public class Calculator implements CalculatorInterface{

    public Calculator(){

    }


    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public int modulus(int a, int b) {
        return a % b;
    }

    @Override
    public int percent(int a) {
        return a / 100;
    }
}
