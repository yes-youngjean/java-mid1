package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value;     //=> Auto-Boxing
        System.out.println("Auto-BoxedValue: " + boxedValue);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue;  //=> Auto-Unboxing

        System.out.println("Auto-UnboxedValue: " + unboxedValue);
    }
}
