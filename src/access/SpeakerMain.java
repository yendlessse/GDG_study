package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolumn();

        speaker.volumeUp();
        speaker.showVolumn();

        speaker.volumeUp();
        speaker.showVolumn();

        //필드에 직접 접근
        System.out.println("volumn 필드 직접 접근 수정");
        //speaker.volume = 200; //private 접근 오류
        speaker.showVolumn();
    }
}
