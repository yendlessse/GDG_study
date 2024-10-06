package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a =" + a);
        changePrimitive(a); //int x = a임으로 값이 복사되는 것
        System.out.println("메서드 호출 후: a =" + a);
    }
    static void changePrimitive(int x) {
        x = 20;
    }
}
