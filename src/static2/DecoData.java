package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //staticCall은 정적메서드니까 인스턴스는 접근 불가
        //instanceValue ++ // 인스턴스 변수 접근, error
        //instanceMethod() //인스턴스 메서드 접근, error
        staticValue++; //정적변수 접근
        staticMethod();
    }

    public static void staticCall(DecoData data) {
        //static 메서드 이지만
        //참조값을 넘겨줬음으로 인스턴스 접근 가능
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        //인스턴스 메서드; 인스턴스, 정적변수 모두 접근 가능
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }
    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}