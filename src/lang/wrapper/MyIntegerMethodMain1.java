package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {

        /**
         * Wrapper Class로 "객체"를 만들 수 있다.
         * => 자기 자신의 메서드를 이용해, 자기 자신의 값과 외부 값을 비교함
         * => 기본형은 객체가 아니기에 스스로의 메서드를 가질 수 없음 => 객체지향 장점 살릴 수 없음 (메서드 등)
         *    + 기본형은 항상 값을 가져야 함
         * */
        MyInteger myInteger = new MyInteger(10);

        int i1 = myInteger.compareTo(5);
        System.out.println("i1 = " + i1);

        int i2 = myInteger.compareTo(10);
        System.out.println("i2 = " + i2);

        int i3 = myInteger.compareTo(20);
        System.out.println("i3 = " + i3);
    }
}
