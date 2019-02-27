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
    public double percent(double a) {
        return a / 100;
    }

    public static void main(String[] args) {

       Calculator calculator = new Calculator();
       System.out.println("Add " + calculator.add(1,2));
       System.out.println("Sub " + calculator.subtract(1,2));
       System.out.println("* " + calculator.multiply(2,3));
       System.out.println("/ " + calculator.divide(4, 2));
       System.out.println("% " + calculator.modulus(5,2));
       System.out.println("Per " + calculator.percent(50));


    }

}
