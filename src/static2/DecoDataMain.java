package static2;
import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall(); //인스턴스 변수 다시생성이니까 다시 1

        DecoData data3 = new DecoData();
        data3.staticCall();
        DecoData.staticCall();
    }
}
