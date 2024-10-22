package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child(); //x001(parent)
        //단 자식의 기능은 호출 불가능
        //poly.childMethod();

        //다운 캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; //x001 을 child타입으로
        child.childMethod();
    }
}
