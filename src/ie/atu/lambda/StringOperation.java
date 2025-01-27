package ie.atu.lambda;

@FunctionalInterface
public interface StringOperation {
    // Single Abstract Method (SAM) interface
    String apply(String str);
}
