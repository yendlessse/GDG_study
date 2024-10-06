package access.a;

public class PublicClass {
    //public class는 파일 이름과 동일해야함
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

//default클래스는 여러개 만들 수 있음
class DefaultClass1 {}
class DefaultClass2 {}
