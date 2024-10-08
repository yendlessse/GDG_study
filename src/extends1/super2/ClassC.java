package extends1.super2;

public class ClassC extends ClassB{
    public ClassC() {
        super(10, 20); //ClassB(int a) ClassB(int a, int b) 둘 중 하나 택
        System.out.println("ClassC 생성자");
    }
}