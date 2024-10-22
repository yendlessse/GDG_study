package poly.basic;

public class CastingMain4 {
    //다운캐스팅을 자동으로 하지 않는 이유
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조
        //부모 -> 자식 호출x
        Parent parent1 = new Child();//주
        //자식 타입 존재
        Child child1 = (Child)parent1;
        child1.childMethod();

        Parent parent2 = new Parent(); //주의
        Child child2 = (Child) parent2; //런타임 오류 - classcastException
        child2.childMethod(); //실행 불가
        //왜? parent2에는 Child인스턴스가 없다 => 런타임 오류
    }
}
