package ie.atu.lambda;

public class StringToUpperCase implements StringOperation {
    @Override
    public String apply(String str) {
        return str.toUpperCase();
    }
}
