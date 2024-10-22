package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> child");
        Child child = new Child();
        child.parentMethod(); //상속받았으니 가능
        child.childMethod();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMethod();

        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다
        //poly.childMethod(); //자식의 기능은 호출할 숭 ㅓㅂㅅ다
    }
}
