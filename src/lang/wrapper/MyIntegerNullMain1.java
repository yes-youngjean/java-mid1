package lang.wrapper;

public class MyIntegerNullMain1 {
    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, 3};
        System.out.println("FineValue = " + findValue(arr, -1));
        System.out.println("FineValue = " + findValue(arr, 0));
        System.out.println("FineValue = " + findValue(arr, 1));
        System.out.println("FineValue = " + findValue(arr, 100));   // => 여기서 -1을 반환하는데 겹칠 수 있음
    }

    /**
     * 기본형: null 불가
     * 참조형: null 가능
     * */
    private static Integer findValue(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return value;
            }
        }

        return null;
    }
}
