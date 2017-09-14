public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiplicate(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        throw new IllegalArgumentException("Divisor can't be equal to 0");
    }
    public static void main(String[] args) {
        System.out.println("Hello world?");
    }
}
