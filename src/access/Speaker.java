package access;

public class Speaker {

    private int volume; //volume접근 제어
    //volume은 클래스 내부에서만 호출 가능, 메서드들을 통해서
    //필드

    Speaker(int volume) {
        this.volume = volume;
    }//생성자

    void volumeUp() { //메서드
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumnDown 호출");
    }

    void showVolumn() {
        System.out.println("현재 음량:" + volume);
    }
}
