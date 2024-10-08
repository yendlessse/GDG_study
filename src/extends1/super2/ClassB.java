package extends1.super2;

public class ClassB extends ClassA {
    public ClassB(int a) {
        super();
        //this(100, 0) 하면 ClassB(int a, int b)로 감 여기에는 super()가 필요
        // 기본 생성자(파라미터가 없는 경우) 생략가능
        System.out.println("ClassB 생성자 a="+a);
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
