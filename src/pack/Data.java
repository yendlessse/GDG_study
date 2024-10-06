package pack;

public class Data {
    public Data(){
        //public을 사용한 이유
        //다른 패키지에서 이 클래스의 생성자를 호출하기 위해서
        System.out.println("패키지 pack Data 생성");
    }
}
