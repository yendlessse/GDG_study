package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(MemberInit member, String name, int age, int grade) {
        this.name = name; //이름이 동일할 때
        this.age = age;
        this.grade = grade;
        /*
        this.name = name; //1. 오른쪽의 name은 매개변수에 접근
        this.name = "user"; //2. name 매개변수의 값 사용
        x001.name = "user"; //3. this.은 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스의 멤버 변수에 접근
         */
    }
}
