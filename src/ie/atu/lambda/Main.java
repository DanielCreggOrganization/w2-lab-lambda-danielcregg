package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        StringOperation stringOperation = new StringToUpperCase();
        System.out.println(stringOperation.apply("Hello, World!"));
    }
}
