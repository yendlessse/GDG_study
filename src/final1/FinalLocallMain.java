package final1;

public class FinalLocallMain {

    public static void main(String[] args) {
        final int data1;
        data1 = 10;
        //data1 = 20; //컴파일 오류

        final int data2 =10;
        //data2 = 20 //컴파일 오류

        method(10);
    }

    static void method(final int parameter){
        //prarameter = 20 //컴파일 오류
    }
}
