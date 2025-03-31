package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        /**
         * 'Boxing' => 기본형으로 Wrapper 클래스를 만드는 것
         * 반대: 'Unboxing'
         * */
        Integer newInteger = Integer.valueOf(10);
        System.out.println("newInteger = " + newInteger);

        Long newLong = Long.valueOf(10);
        System.out.println("newLong = " + newLong);

        Double newDouble = Double.valueOf(10);
        System.out.println("newDouble = " + newDouble);

        Integer newInteger2 = new Integer(10);
        System.out.println("== : " + (newInteger.equals(newInteger2))); //.equals()로 비교해야 함!
    }
}
