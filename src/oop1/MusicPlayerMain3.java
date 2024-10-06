package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
//볼륨 증가
        volumnUp(data);
//볼륨 증가
        volumnUp(data);
//볼륨 감소
        volumnDown(data);
//음악 플레이어 상태
        showStatus(data);
//음악 플레이어 끄기
        off(data);
    }
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("시작");
    }

    static void  off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("종료");
    }

    static void volumnUp(MusicPlayerData data) {
        data.volumn++;
        System.out.println("볼륨:" + data.volumn);
    }

    static void volumnDown(MusicPlayerData data) {
        data.volumn--;
        System.out.println("볼륨:" + data.volumn);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("상태확인");
        if (data.isOn) {
            System.out.println("음악플레이어 ON, 볼륨:" + data.volumn);
        } else {
            System.out.println("음악플레이어 OFF");
        }
    }
}
