package lang.wrapper;

public class WrapperUtilsMain {
    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10);        //숫자, Wrapper 객체 변환
        Integer i2 = Integer.valueOf("10");     //문자열, Wrapper 객체 변환
        int i3 = Integer.parseInt("10");        //문자열 전용, 기본형 변환

    }
}
